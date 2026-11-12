
public class Car extends Vehicle implements Serviceable {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    void displayInfo() {
            System.out.println(
            "Vehicle brand: " + getBrand() +
            " // Vehicle model: " + getModel() +
            " // Year: " + getYear()
        );

        System.out.println("Doors: " + doors);
    }
    
    
      @Override
       public void moveForward() {
         System.out.println("Car moves forward.");
      }

      @Override
       public void moveBackwards() {
         System.out.println("Car moves backwards.");
      }

      @Override
       public void moveLeft() {
         System.out.println("Car turns left.");
      }

      @Override
       public void moveRight() {
        System.out.println("Car turns right.");
     }
      
      @Override
    public void move() {
        System.out.println("Car moves on the road.");
    }

      @Override
    public void service() {
        System.out.println("Car: Check oil and brakes.");
    }
}
