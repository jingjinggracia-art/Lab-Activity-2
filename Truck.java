
public class Truck extends Vehicle implements Serviceable{
    private int wheels;

    public Truck(String brand, String model, int year, int wheels) {
        super(brand, model, year);
        this.wheels = wheels;
    }

    @Override
    void displayInfo() {
        System.out.println(
            "Vehicle brand: " + getBrand() +
            " // Vehicle model: " + getModel() +
            " // Year: " + getYear()
        );

        System.out.println("Number of wheels: " + wheels);
    }
    
    
@Override
public void moveForward() {
    System.out.println("Truck moves forward.");
}

@Override
public void moveBackwards() {
    System.out.println("Truck moves backwards.");
}

@Override
public void moveLeft() {
    System.out.println("Truck turns left.");
}

@Override
public void moveRight() {
    System.out.println("Truck turns right.");
}

@Override
public void move() {
   System.out.println("Truck moves on the road.");
}

@Override
public void service() {
   System.out.println("Truck: Inspect cargo brakes.");
}

}
