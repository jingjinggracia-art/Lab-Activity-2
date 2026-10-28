public class Main {

    public static void main(String[] args) {

        // A parent reference holding a child object
        Vehicle vehicle = new Car("Tesla", "Roadster", 2026, 4);
        vehicle.displayInfo();

        System.out.println();
        
        // The same variable now refers to a truck object
        vehicle = new Truck("IZUZU", "NMR85H", 2023, 6);
        vehicle.displayInfo();
        
        System.out.println();
        

        // The same variable now refers to a motorcycle object
        vehicle = new Motorcycle("Yamaha", "NmaxV3", 2026, "durable");
        vehicle.displayInfo();

        System.out.println();

        // One method accepts different Vehicle subclasses
        Car car = new Car("Toyota", "Innova", 2023, 4);
        Motorcycle motor = new Motorcycle("Yamaha", "Fazzio", 2025, "fast");
        
        System.out.println();

        printDetails(motor);

        // An array holds different vehicle subclasses
        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 2020, 4),
            new Motorcycle("Yamaha", "Mio", 2022, "Automatic"),
            new Car("Honda", "City", 2024, 4),
            new Truck("IZUZU", "NMR85H", 2023, 6)
        };

            for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
