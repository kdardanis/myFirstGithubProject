package gr.hae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TourController {

   @GetMapping("/index")
   String index(ModelMap model) {
       return "index";
   }


}
