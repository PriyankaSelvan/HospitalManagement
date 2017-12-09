package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceptionistController
{
   @GetMapping("/receptionistPage")
   public String welcome(Model model) 
   {
  
  return "receptionistPage";
}
   }
