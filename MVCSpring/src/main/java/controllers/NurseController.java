package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NurseController
{
   @GetMapping("/nursePage")
   public String welcome(Model model) 
   {
  
  return "nursePage";
}
   }
