package cz.cvut.fit.hw5.dto;

import org.springframework.hateoas.RepresentationModel;

public class Country extends RepresentationModel<Country> {

    String id;
    String name;

    public Country(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
