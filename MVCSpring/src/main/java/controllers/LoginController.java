package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import models.Login;
import models.Patient;
import models.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Controller
public class LoginController {
	
   @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
   public ModelAndView patient() {
      return new ModelAndView("loginPage", "command", new Login());
   }
   
   @RequestMapping(value = "/loginPagePost", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("MVCSpring")Login login, 
      ModelMap model) {
	 //creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		login.setPassword("encrypted");
/*		
 		Patient patient = null;
		patient = (Patient)session.get(Patient.class, login.getLogin_id());
		if(patient != null) {
			login.setType("Patient");
		}
		else {
			login.setType("Doctor");
		}
*/
		
		//login.setType("Patient");
		//creating transaction object
		Transaction t=session.beginTransaction();
		session.persist(login);//persisting the object
		
		t.commit();//transaction is committed
		session.close();
      model.addAttribute("login_id", login.getLogin_id());
      model.addAttribute("password", login.getPassword());
      //model.addAttribute("type", login.getType());
      
      // change this to the portal of the specific type
     // String type = login.getType();
      if(login.getLogin_id().charAt(0) == 'P') {
    	  Patient patient = null;
    	  patient = (Patient)session.get(Patient.class, login.getLogin_id());
    	  if(patient != null) {
    		  return "result_login_patient";
    	  }
      }
      return "result_login_doctor";
   }
}