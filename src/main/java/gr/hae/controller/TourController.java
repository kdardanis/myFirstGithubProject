package gr.hae.controller;

import gr.hae.service.TourPackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TourController {
    TourPackageService tourPackageService;

    public TourController(TourPackageService tourPackageService){
        this.tourPackageService = tourPackageService;
    }

   @GetMapping("/index")
   String index(ModelMap model) {

       model.addAttribute("title","title");
       model.addAttribute("tours",tourPackageService.findAll());
       return "index";
   }

   @GetMapping("/rate")
   String rate(ModelMap model) {
       return "rate";
   }



}
