package gr.hae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import java.util.List;

@Entity
public class TourPackage {
@Id
@GeneratedValue
Integer id;
@Max(80)
String name;
String description;

    @Positive
Integer price;
@Positive
Integer duration;
String keywords;
@OneToMany
List<Tour> tour;

    public TourPackage(Integer id, String name, String description, Integer price, Integer duration, String keywords) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.keywords = keywords;
    }

    public TourPackage() {

    }

    public List<Tour> getTour() {
        return tour;
    }

    public void setTour(List<Tour> tour) {
        this.tour = tour;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
