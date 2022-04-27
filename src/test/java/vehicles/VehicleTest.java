package vehicles;

import cars.SportCar;
import cars.Suv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    private Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle();
        vehicle.addCar(new SportCar("Ferrari", "Red", 250000, vehicle));
        vehicle.addCar(new Suv("Range Rover", "Black", 100000, vehicle));
    }
    @Test
    public void addsCar(){
        assertThat(vehicle.getCars().size()).isEqualTo(2);
    }
}
