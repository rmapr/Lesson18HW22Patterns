package patternBuilder.builders;

import patternBuilder.cars.CarType;
import patternBuilder.components.Engine;
import patternBuilder.components.GPSNavigator;
import patternBuilder.components.Transmission;
import patternBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
