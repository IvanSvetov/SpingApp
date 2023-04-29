package ru.skypro.lessons.spring.pojo;

public class Bus extends Transport{

    private String model = "IKARUS";
    public Bus(String model) {
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
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }
}
