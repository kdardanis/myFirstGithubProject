package gr.hae.controller;

import gr.hae.model.TourPackage;
import gr.hae.service.TourPackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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

   @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping("/tourPackage/{id}")
    public String updateTour(@PathVariable Integer id, Model model){
        TourPackage tourPackage = tourPackageService.findById(id);
        model.addAttribute("tourPackage", tourPackage);
        return "tourPackage";
    }



}
