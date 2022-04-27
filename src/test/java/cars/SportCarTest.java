package cars;
import manufactures.SportCarManufacture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.Vehicle;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SportCarTest {
    SportCar sportCar;
    Car car;

    @BeforeEach
    public void setUp(){
        Vehicle vehicle = new Vehicle();

        sportCar = new SportCar("Ferrari", "Red", 250000, vehicle);

        vehicle.getSportsCarBacklog().add(new SportCarManufacture("Production affected due to short supply of microchips"));
        vehicle.getSportsCarBacklog().add(new SportCarManufacture("Covid-19 workers on furlough"));
        vehicle.getSportsCarBacklog().add(new SportCarManufacture("Increase in demand"));

    }
    @Test
    public void hasModel(){
        assertThat(sportCar.getModel()).isEqualTo("Ferrari");
    }
    @Test
    public void hasColor(){
        assertThat(sportCar.getColor()).isEqualTo("Red");
    }
    @Test
    public void hasPrice(){
        assertThat(sportCar.getPrice()).isEqualTo(250000);
    }
    @Test
    public void canPullManufacture(){
        sportCar.sale();
        sportCar.sale();
        sportCar.sale();
        assertThat(this.sportCar.automobile.getSportsCarBacklog().size()).isEqualTo(0);
    }


}
