package patternBuilder;

import patternBuilder.builders.CarBuilder;
import patternBuilder.builders.SedanCarBuilder;
import patternBuilder.builders.SportsCarBuilder;
import patternBuilder.cars.Car;
import patternBuilder.director.Director;

public class App {
    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        Director director = new Director(carBuilder);
        director.build();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportsCarBuilder();
        director = new Director(carBuilder);
        director.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
