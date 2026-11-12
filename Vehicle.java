public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }

        return false;
    }

   abstract void displayInfo();
   
         public abstract void moveForward();

         public abstract void moveBackwards();

         public abstract void moveLeft();

         public abstract void moveRight();
         
         public abstract void move();
         

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }

    void displayResults() {
        System.out.println();

        displayInfo();
        System.out.println("Age: " + calculateAge());
        System.out.println("Vintage: " + isVintage());

        System.out.println();
    }
  
}
