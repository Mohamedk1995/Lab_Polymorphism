package cars;
import manufactures.Manufacture;
import org.w3c.dom.ls.LSOutput;
import vehicles.Vehicle;

public class SportCar extends Car {

    private String model;
    private String color;
    private int price;
    protected Vehicle vehicle;

    public SportCar(String model, String color, int price, Vehicle vehicle){
        super(model, color, price, vehicle);
    }

    @Override
    public Manufacture sale() {
        Manufacture manufacture = this.automobile.getSportsCarBacklog().pop();
        System.out.println(manufacture.getDescription());
        manufacture.setIsComplete(true);
        return manufacture;
    }

    @Override
    public Manufacture sale(Manufacture  manufacture) {
        System.out.println(manufacture.getDescription());
        manufacture.setIsComplete(true);
        return manufacture;
    }

}
