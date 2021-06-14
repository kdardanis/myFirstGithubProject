package gr.hae.service;

import gr.hae.model.TourPackage;
import gr.hae.repository.PackageTourRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageServiceImpl implements TourPackageService {
    PackageTourRepo repo;

    public TourPackageServiceImpl(PackageTourRepo repo){
        this.repo = repo;
    }
    public List<TourPackage> findAll(){
        return repo.findAll();}

    @Override
    public TourPackage save(TourPackage tourPackage) {
        return repo.save(tourPackage);
    }


}
