package gr.hae;

import gr.hae.model.*;
import gr.hae.repository.RegionRepo;
import gr.hae.repository.TourRepo;
import gr.hae.service.TourPackageService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class ProjectApplication {



    public static void main(String[] args) {

        SpringApplication.run(ProjectApplication.class, args);

    }

    @Bean
    ApplicationRunner init(TourPackageService tourPackageService, TourRepo tourRepo, RegionRepo regionRepo) {
        return args -> {
            Region region1 = new Region();
            region1.setRegion("EPIRUS");

            Region region2 = new Region();
            region2.setRegion("ATTICA");

            regionRepo.save(region1);
            regionRepo.save(region2);

            ArrayList<Tour> tours = new ArrayList<>();

            Tour tour1 = new Tour();
            tour1.setDescription("nice trip");
            tour1.setDuration(2);
            tour1.setPrice(20);
            tour1.setRegion(region1);

            Tour tour2 = new Tour();
            tour2.setDescription("perfect trip");
            tour2.setDuration(5);
            tour2.setPrice(50);
            tour2.setRegion(region2);

            tourRepo.save(tour1);
            tourRepo.save(tour2);

            tours.add(tour1);
            tours.add(tour2);

            TourPackage tourPackage = new TourPackage();
            tourPackage.setDescription("Package contains tour 1 and tour 2");
            tourPackage.setPrice(70);
            tourPackage.setDuration(7);
            tourPackage.setKeywords("tour");
            tourPackage.setTour(tours);

            tourPackageService.save(tourPackage);
//
//                Integer x = person1.rating(tourPackage.getPrice());
//
//                TourPackageRating tourPackageRating = new TourPackageRating();
//                tourPackageRating.setTourPackage(tourPackage);
//                tourPackageRating.setId(1);
//                tourPackageRating.setComments("this is rating");
//                tourPackageRating.setPerson(person1);
//                tourPackageRating.setScore(x);
//
//                System.out.println("score is :   " +x);
//
//
//                // TourPackage tp = new TourPackage();
//                // tp.setName(tourName);
//                // tourPackageService.save(tp);
//
//
        };
    }


}

