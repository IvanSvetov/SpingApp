package ru.skypro.lessons.spring.pojo;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public void ready() {
        System.out.println(model + " is ready");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
}
