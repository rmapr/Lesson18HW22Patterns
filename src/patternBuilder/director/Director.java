package patternBuilder.director;

import patternBuilder.builders.CarBuilder;
import patternBuilder.cars.Car;

public class Director {
    CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        super();
        this.carBuilder = carBuilder;
    }

    public Car build() {
        this.carBuilder.buildBodyStyle();
        this.carBuilder.buildPower();
        this.carBuilder.buildEngine();
        this.carBuilder.buildBreaks();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
        this.carBuilder.buildFuelType();
        return this.carBuilder.getCar();
    }
}
