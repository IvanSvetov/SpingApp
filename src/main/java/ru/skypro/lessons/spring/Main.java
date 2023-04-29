package ru.skypro.lessons.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.skypro.lessons.spring.config.AppConfig;
import ru.skypro.lessons.spring.pojo.Bus;
import ru.skypro.lessons.spring.pojo.Car;
import ru.skypro.lessons.spring.pojo.Pickup;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        Bus bus = context.getBean(Bus.class);
        Pickup pickup = context.getBean(Pickup.class);

        car.ready();
        bus.ready();
        pickup.ready();


    }
}
