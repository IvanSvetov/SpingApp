package ru.skypro.lessons.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skypro.lessons.spring.pojo.Bus;
import ru.skypro.lessons.spring.pojo.Car;
import ru.skypro.lessons.spring.pojo.Pickup;
import ru.skypro.lessons.spring.pojo.Transport;

@Configuration
public class AppConfig {

    @Bean
    public Car getCartBean() {
        return new Car("BMW");
    }
    @Bean
    public Bus getBustBean() {
        return new Bus("IKARUS");
    }
    @Bean
    public Pickup getPickuptBean() {
        return new Pickup("TOYOTA");
    }

}


