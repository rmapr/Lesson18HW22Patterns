package examplePatternBuilderDontLook;

import examplePatternBuilderDontLook.builders.CarBuilder;
import examplePatternBuilderDontLook.builders.CarManualBuilder;
import examplePatternBuilderDontLook.cars.Car;
import examplePatternBuilderDontLook.cars.Manual;
import examplePatternBuilderDontLook.director.Director;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

         Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
