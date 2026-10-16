public class Main {

    public static void main(String[] args) {

        // Original three vehicles
        Vehicle v1 = new Vehicle("Koenigsegg", "Koenigsegg Jesko", 2020);

        Vehicle v2 = new Vehicle("Dodge", "1970 Dodge Charger R/T", 1970);

        Vehicle v3 = new Vehicle("Bugatti", "Bugatti Veyron", 2006);


        System.out.println("Vehicle 1:");
        v1.displayResults();

        System.out.println("Vehicle 2:");
        v2.displayResults();

        System.out.println("Vehicle 3:");
        v3.displayResults();


        System.out.println("== Getters ==");
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());


        System.out.println();
        System.out.println("== Set Years ==");

        boolean result;

        result = v1.setYear(2000);
        System.out.println("setYear(2000): " + result);
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        result = v1.setYear(1885);
        System.out.println("setYear(1885): " + result);
        System.out.println("Stored year: " + v1.getYear());

        result = v1.setYear(2027);
        System.out.println("setYear(2027): " + result);
        System.out.println("Stored year: " + v1.getYear());


        System.out.println();
        System.out.println("== Constructor Valid or Invalid ==");

        Vehicle invalid1 =
            new Vehicle("Test", "Invalid 1885", 1885);

        Vehicle invalid2 =
            new Vehicle("Test", "Invalid 2027", 2027);

        System.out.println(
            "Vehicle with year 1885: " + invalid1.getYear()
        );

        System.out.println(
            "Vehicle with year 2027: " + invalid2.getYear()
        );
    }
}
