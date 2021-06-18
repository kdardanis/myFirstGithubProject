package gr.hae.repository;

import gr.hae.model.Person;
import gr.hae.model.Region;
import gr.hae.model.TourPackage;
import gr.hae.model.TourPackageRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRatingRepo extends JpaRepository<TourPackageRating, Integer> {

    boolean existsByPersonAndTourPackage(Person person, TourPackage tourPackage);
    TourPackageRating findByPersonAndTourPackage(Person person, TourPackage tourPackage);
}