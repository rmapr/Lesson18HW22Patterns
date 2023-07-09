package examplePatternBuilderDontLook.builders;

import examplePatternBuilderDontLook.cars.CarType;
import examplePatternBuilderDontLook.components.Engine;
import examplePatternBuilderDontLook.components.GPSNavigator;
import examplePatternBuilderDontLook.components.Transmission;
import examplePatternBuilderDontLook.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
