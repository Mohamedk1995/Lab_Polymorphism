package cars;

import manufactures.Manufacture;
import vehicles.Vehicle;

public abstract class Car {
    private String model;
    private String color;
    private int price;
    protected Vehicle automobile;

    public Car(String model, String color, int price, Vehicle automobile) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.automobile = automobile;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public String drive() {
        return this.model + " is driving";
    }

    public String stop() {
        return this.model + " is stopping";
    }

    public String speed() {
        return this.model + " is speeding";
    }

    public abstract Manufacture sale();

    public abstract Manufacture sale(Manufacture manufacture);

    public static void main(String args[]) {
        enum Day {

            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }
        Day[] daysOfWeek = Day.values();
        for (Day today : daysOfWeek) {

            //Using Enum in Switch case statement

            switch (today) {
                case MONDAY:
                    System.out.println("It's Monday, We have many cars available for order");
                    break;
                case TUESDAY:
                    System.out.println("It's Tuesday, We have many cars available for order");
                    break;
                case WEDNESDAY:
                    System.out.println("It's Wednesday, We have many cars available for order");
                    break;
                case THURSDAY:
                    System.out.println("It's Thursday, We have many cars available for order");
                    break;
                case FRIDAY:
                    System.out.println("It's Friday, We have many cars available for order");
                    break;
                case SATURDAY:
                    System.out.println("It's Saturday, We are closed for the weekend");
                    break;
                case SUNDAY:
                    System.out.println("It's Sunday, We are closed for the weekend");
                    break;

            }
        }
    }
}
