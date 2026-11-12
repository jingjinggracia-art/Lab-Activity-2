public class Main {

    public static void main(String[] args) {

        // A parent reference holding a child object
        Vehicle vehicle = new Car("Tesla", "Roadster", 2026, 4);
        printDetails(vehicle);
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();

        System.out.println();

        // The same variable now refers to a truck object
        vehicle = new Truck("IZUZU", "NMR85H", 2023, 6);
        printDetails(vehicle);
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();

        System.out.println();

        // The same variable now refers to a motorcycle object
        vehicle = new Motorcycle("Yamaha", "NmaxV3", 2026, "durable");
        printDetails(vehicle);
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();

        System.out.println();

        // One method accepts different Vehicle subclasses
        Car car = new Car("Toyota", "Innova", 2023, 4);
        Motorcycle motor = new Motorcycle("Yamaha", "Fazzio", 2025, "fast");
        Truck truck = new Truck("ISUZU", "NMR85H", 2023, 6);

        printDetails(car);
        printDetails(motor);

        System.out.println();
        
         Printer printer = new Printer();
         
         System.out.println();
         
        Serviceable[] serviceItems = {
            car,
            motor,
            truck,
            printer
        };
        
         for (Serviceable item : serviceItems) {
            performService(item);
        }
        
         System.out.println();
         
         
        
        // An array holds different vehicle subclasses
        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 2020, 4),
            new Motorcycle("Yamaha", "Mio", 2022, "Automatic"),
            new Car("Honda", "City", 2024, 4),
            new Truck("IZUZU", "NMR85H", 2023, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            currentVehicle.displayResults();

            currentVehicle.moveForward();
            currentVehicle.moveBackwards();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            currentVehicle.move();

            System.out.println();
        }
    }
    
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayResults();
    }
    
    public static void performService(Serviceable item) {
        item.service();
    }

}


   

        
