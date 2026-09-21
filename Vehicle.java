public class Vehicle {

   String brand;
   String model;
   int year;
   
      void displayInfo() {
         System.out.println("Vehicle brand: " + brand + " // " + "Vehicle model: " + model + " // " + "Year: " + year);
       }

                           
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
    