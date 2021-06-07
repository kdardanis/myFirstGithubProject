package gr.hae.repository;


import gr.hae.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageTourRepo extends JpaRepository<TourPackage,Integer> {



}
