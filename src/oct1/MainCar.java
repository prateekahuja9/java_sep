package oct1;

public class MainCar {
    public static void main(String[] args) {

        Car car = new Car();
        car.properties = "AWD";
        car.brand = "Honda";
        car.model = "Accord";
        car.price = "$40000";
        car.color = "Black";

        System.out.println("Following are the properties of the car : ");
        System.out.println(car.brand + " " + car.model + " " + car.properties + " " + car.color + " " + car.price);
    }
}
