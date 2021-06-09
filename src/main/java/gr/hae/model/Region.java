package gr.hae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {


  //  ATTICA, MACEDONIA, CRETE, EPIRUS
    @Id
    @GeneratedValue
  Integer id;
String region;

    public Region(Integer id, String region) {
        this.id = id;
        this.region = region;
    }

    public Region() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
