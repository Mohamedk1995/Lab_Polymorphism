package cars;

import manufactures.Manufacture;
import vehicles.Vehicle;

public class Suv extends Car {
    private String model;
    private String color;
    private int price;
    protected Vehicle vehicle;

    public Suv(String model, String color, int price, Vehicle vehicle) {
        super(model, color, price, vehicle);
    }
    @Override
    public Manufacture sale() {
        Manufacture manufacture = this.automobile.getSuvBacklog().pop();
        System.out.println(manufacture.getDescription());
        manufacture.setIsComplete(true);
        return manufacture;
    }

    @Override
    public Manufacture sale(Manufacture manufacture) {
        System.out.println(manufacture.getDescription());
        manufacture.setIsComplete(true);
        return manufacture;

    }
}
