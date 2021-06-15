package gr.hae.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

@Entity
public class Tour {
@Id
@GeneratedValue
Integer id;
@Max(80)
String title;
@Max(300)
String description;
@Positive
Integer price;
@Positive
Integer duration;


    @ManyToOne
Region region;
String image;

    public Tour(Integer id, String title, String description, Integer price, Integer duration, Region region) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.region = region;
    }

    public Tour() {

    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
