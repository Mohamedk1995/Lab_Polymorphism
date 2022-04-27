package cars;
import cars.SportCar;
import cars.Suv;
import manufactures.SportCarManufacture;
import manufactures.SuvManufacture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuvTest {

    private Suv suv;

    @BeforeEach
    public void setUp() {
        Vehicle vehicle = new Vehicle();
        suv = new Suv("Range Rover", "Black", 100000, vehicle);
        vehicle.getSuvBacklog().add(new SuvManufacture("Out of Stock"));
        vehicle.getSuvBacklog().add(new SuvManufacture("Production slow"));
        vehicle.getSuvBacklog().add(new SuvManufacture("Delay in deliveries"));
    }

    @Test
    public void hasModel() {
        assertThat(suv.getModel()).isEqualTo("Range Rover");
    }

    @Test
    public void hasColor() {
        assertThat(suv.getColor()).isEqualTo("Black");
    }

    @Test
    public void hasPrice() {
        assertThat(suv.getPrice()).isEqualTo(100000);
    }

    @Test
    public void canPullManufacture() {
        suv.sale();
        suv.sale();
        suv.sale();
        assertThat(this.suv.automobile.getSportsCarBacklog().size()).isEqualTo(0);
    }
}
