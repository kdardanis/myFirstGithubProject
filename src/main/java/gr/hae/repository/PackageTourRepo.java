package gr.hae.repository;


import gr.hae.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageTourRepo extends JpaRepository<TourPackage,Integer> {



}
