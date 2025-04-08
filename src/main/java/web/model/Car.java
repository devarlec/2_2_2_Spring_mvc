package web.model;

import org.springframework.stereotype.Component;


public class Car {

    private String name;
    private String model;
    private String owner;

    public Car(String name, String model, String owner) {
        this.name = name;
        this.model = model;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
