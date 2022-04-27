package vehicles;

import cars.Car;
import cars.SportCar;
import cars.Suv;
import manufactures.SportCarManufacture;
import manufactures.SuvManufacture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vehicle {
    List<Car> cars;

    protected LinkedList<SportCarManufacture> sportsCarBacklog = new LinkedList<>();
    protected LinkedList<SuvManufacture> suvBacklog = new LinkedList<>();


    public Vehicle(){cars = new ArrayList<>();}
    public void addCar(Car cars){
        this.cars.add(cars);
    }
    public List<Car> getCars(){
        return this.cars;
    }

    public LinkedList<SportCarManufacture> getSportsCarBacklog() {
        return sportsCarBacklog;
    }
    public LinkedList<SuvManufacture> getSuvBacklog() {
        return suvBacklog;
    }
}
