package gr.hae.repository;


import gr.hae.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourPackageRepo extends JpaRepository<TourPackage,Integer> {

    Optional<TourPackage> findByName(String name);



}
