package gr.hae.service;

import gr.hae.model.TourPackage;

import java.util.List;
import java.util.Optional;

public interface TourPackageService {

    public List<TourPackage> findAll();
    public TourPackage save(TourPackage tourPackage);
    public Optional<TourPackage> findByName(String name);
}
