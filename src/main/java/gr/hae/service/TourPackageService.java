package gr.hae.service;

import gr.hae.model.TourPackage;
import gr.hae.repository.PackageTourRepo;

import java.util.List;

public interface TourPackageService {

    public List<TourPackage> findAll();
    public TourPackage save(TourPackage tourPackage);
}
