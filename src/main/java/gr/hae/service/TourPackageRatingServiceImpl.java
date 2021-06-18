package gr.hae.service;

import gr.hae.model.Person;
import gr.hae.model.TourPackage;
import gr.hae.model.TourPackageRating;
import gr.hae.repository.PersonRepo;
import gr.hae.repository.TourPackageRatingRepo;
import org.springframework.stereotype.Service;

@Service
public class TourPackageRatingServiceImpl implements TourPackageRatingService{
    TourPackageRatingRepo repo;
    TourPackageService tourPackageService;
    PersonRepo personRepo;

    public TourPackageRatingServiceImpl(TourPackageRatingRepo repo,TourPackageService tourPackageService,PersonRepo personRepo){
        this.repo = repo;
        this.tourPackageService = tourPackageService;
        this.personRepo = personRepo;
    }


    @Override
    public TourPackageRating save(Integer tourPackageId, Integer userId, Integer rating) {
        TourPackage tourPackage = tourPackageService.findById(tourPackageId);
        TourPackageRating tourPackageRating;
        Person person = personRepo.findById(userId).orElse(null);
        if (!repo.existsByPersonAndTourPackage(person,tourPackage))
           tourPackageRating = new TourPackageRating(tourPackage,person,rating,"");
        else
        {
            tourPackageRating = repo.findByPersonAndTourPackage(person,tourPackage);
            tourPackageRating.setScore(rating);
        }
        return repo.save(tourPackageRating);
    }
}
