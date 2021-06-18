package gr.hae.service;

import gr.hae.model.TourPackageRating;

public interface TourPackageRatingService {
    public TourPackageRating save(Integer tourPackageId,Integer userId,Integer rating);
}
