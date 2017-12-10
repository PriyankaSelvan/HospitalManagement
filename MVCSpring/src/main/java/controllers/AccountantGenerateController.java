package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import models.Prescription;
import models.Inventory;
import models.Bill;
import models.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import HibernateUtil


@Controller
public class AccountantGenerateController {
	
   @RequestMapping(value = "/accountantGenerateBill", method = RequestMethod.GET)
   public ModelAndView patient() {
      return new ModelAndView("accountantGenerateBill", "command", new Bill());
   }
   
   @RequestMapping(value = "/accountantGenerateBillPost", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("MVCSpring")Bill patient, 
      ModelMap model) {
	
		Transaction t=HibernateUtil.getSessionFromFactory().beginTransaction();
		Prescription p = null;
		Inventory i1 = null;
		Inventory i2 = null;
		Inventory i3 = null;
		Inventory i4 = null;
		Inventory i5 = null;
		
		p = (Prescription)session.get(Prescription.class, patient.getPrescription_id());
		i1 = (Inventory)session.get(Inventory.class, p.getInventory_id_1());
		i2 = (Inventory)session.get(Inventory.class, p.getInventory_id_2());
		i3 = (Inventory)session.get(Inventory.class, p.getInventory_id_3());
		i4 = (Inventory)session.get(Inventory.class, p.getInventory_id_4());
		i5 = (Inventory)session.get(Inventory.class, p.getInventory_id_5());
		Double inv1_cost = 0.0;
		Double inv2_cost = 0.0;
		Double inv3_cost = 0.0;
		Double inv4_cost = 0.0;
		Double inv5_cost = 0.0;
		
		inv1_cost = (Double)i1.getCost() ;
		inv2_cost = (Double)i2.getCost() ;
		inv3_cost = (Double)i3.getCost() ;
		inv4_cost = (Double)i4.getCost() ;
		inv5_cost = (Double)i5.getCost() ;
		
		
		Double final_cost;
		final_cost = inv1_cost+inv2_cost+inv3_cost+inv4_cost+inv5_cost;
		patient.setFinal_cost(final_cost);
		
		session.persist(patient);//persisting the object
		Patient for_name = null;
		for_name = (Patient)session.get(Patient.class, patient.getPatient_id());
		t.commit();//transaction is commited
		session.close();
      model.addAttribute("bill_id", patient.getBill_id());
      model.addAttribute("patient_id", patient.getPatient_id());
      model.addAttribute("patient_name",for_name.getName());
      model.addAttribute("prescription_id", patient.getPrescription_id());
      model.addAttribute("final_cost", patient.getFinal_cost());
      
      
      return "result_bill";
   }
}
