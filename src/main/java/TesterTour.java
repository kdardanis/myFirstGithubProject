import gr.hae.model.*;

import java.util.ArrayList;


public class TesterTour {


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Ioannis");
        person1.setSurname("Papadopoulos");
        person1.setEmail("....@gmail.com");



        ArrayList<Tour> tours = new ArrayList<>();

        Tour tour1 = new Tour();
        tour1.setId(1);
        tour1.setDescription("nice trip");
        tour1.setDuration(2);
        tour1.setPrice(20);
   //     tour1.setRegion(Region.ATTICA);

        Tour tour2 = new Tour();
        tour2.setId(2);
        tour2.setDescription("perfect trip");
        tour2.setDuration(5);
        tour2.setPrice(50);
  //      tour2.setRegion(Region.EPIRUS);


        tours.add(tour1);
        tours.add(tour2);


        TourPackage tourPackage = new TourPackage();
        tourPackage.setId(1);
        tourPackage.setDescription("Package contains tour 1 and tour 2");
        tourPackage.setPrice(70);
        tourPackage.setDuration(7);


        Integer x = person1.rating(tourPackage.getPrice());

        TourPackageRating tourPackageRating = new TourPackageRating();
        tourPackageRating.setTourPackage(tourPackage);
        tourPackageRating.setId(1);
        tourPackageRating.setComments("this is rating");
        tourPackageRating.setPerson(person1);
        tourPackageRating.setScore(x);

        System.out.println("score is :   " +x);

    }
}