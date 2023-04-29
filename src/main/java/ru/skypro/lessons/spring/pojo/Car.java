package ru.skypro.lessons.spring.pojo;

public class Car extends Transport{

    private String model = "BMW";
    public Car(String model) {
        super(model);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
