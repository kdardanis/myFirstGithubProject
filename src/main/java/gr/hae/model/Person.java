package gr.hae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Integer id;
    @Max(30)
    @Min(3)
    String name;
    @Max(30)
    @Min(3)
    String surname;
    @Max(30)
    @Min(3)
    String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Person() {

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer rating (Integer price){

        Integer score=0;

        if (price <= 100) {
            score = 10;
        }

        else
        {score = 2;}

        return score;
    }
}
