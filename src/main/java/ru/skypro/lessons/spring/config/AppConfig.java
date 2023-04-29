package ru.skypro.lessons.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skypro.lessons.spring.pojo.*;

@Configuration
public class AppConfig {

    @Bean("car")
    public Car getCarBean() {
        return new Car("BMW");
    }
    @Bean("bus")
    public Bus getBusBean() {
        return new Bus("IKARUS");
    }
    @Bean("pickup")
    public Pickup getPickupBean() {
        return new Pickup("TOYOTA");
    }
    @Bean("driver1")
    public Driver getDriverBean() {
        return new Driver("Vasya", getCarBean());
    }
    @Bean("driver2")
    public Driver getDriver2Bean() {
        return new Driver("Vasya", getBusBean());
    }
    @Bean("driver3")
    public Driver getDriver3Bean() {
        return new Driver("Vasya", getPickupBean());
    }


}


