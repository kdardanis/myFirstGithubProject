package gr.hae.service;

import gr.hae.model.TourPackage;
import gr.hae.repository.TourPackageRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourPackageServiceImpl implements TourPackageService {
    TourPackageRepo repo;

    public TourPackageServiceImpl(TourPackageRepo repo){
        this.repo = repo;
    }
    public List<TourPackage> findAll(){
        return repo.findAll();}

    @Override
    public TourPackage save(TourPackage tourPackage) {
        return repo.save(tourPackage);
    }

    @Override
    public Optional<TourPackage> findByName(String name) {
        return repo.findByName(name);
    }


}
