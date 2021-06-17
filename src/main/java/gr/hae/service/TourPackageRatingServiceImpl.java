package gr.hae.service;

import gr.hae.model.TourPackageRating;
import org.springframework.stereotype.Service;

@Service
public class TourPackageRatingServiceImpl implements TourPackageRatingService{
    TourPackageRatingRepo repo;

    public TourPackageRatingServiceImpl(TourPackageRatingRepo repo){
        this.repo = repo;
    }
    @Override
    public TourPackageRating save(TourPackageRating tourPackageRating) {
        return repo.save(tourPackageRating);
    }
}
