package gr.hae.controller;

import gr.hae.model.TourPackage;
import gr.hae.model.TourPackageRating;
import gr.hae.service.TourPackageRatingService;
import gr.hae.service.TourPackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class TourController {
    TourPackageService tourPackageService;
    TourPackageRatingService tourPackageRatingService;

    public TourController(TourPackageService tourPackageService,TourPackageRatingService tourPackageRatingService ){
        this.tourPackageService = tourPackageService;
        this.tourPackageRatingService = tourPackageRatingService;
    }

   @GetMapping({"/index", "/"})
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

    @PostMapping("/tourPackage/{id}")
    public String saveNewTourPackageRating(@PathVariable Integer id,@RequestParam("rating") String rating,ModelMap model){
        tourPackageRatingService.save(id,12,Integer.valueOf(rating));
        System.out.println(rating);
        return "index";
    }

}
