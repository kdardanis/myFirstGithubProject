package gr.hae.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TourPackageRating {
    @Id
    Integer id;
    TourPackage tourPackage;
    Person person;
    Integer score;
    String comments;

    public TourPackageRating(Integer id, TourPackage tourPackage, Person person, Integer score, String comments) {
        this.id = id;
        this.tourPackage = tourPackage;
        this.person = person;
        this.score = score;
        this.comments = comments;
    }

    public TourPackageRating() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
