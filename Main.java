public class Main {

   public static void main(String[] args) {
   
      Vehicle v1 = new Vehicle();
      v1.brand = "Koenigsegg";
      v1.model = "Koenigsegg Jesko";
      v1.year = 2020;
      v1.displayInfo();
      v1.calculateAge();
      v1.isVintage();
      
      Vehicle v2 = new Vehicle();
      v2.brand = "Dodge";
      v2.model = "1970 Dodge Charger R/T";
      v2.year = 1970 ;
      v2.displayInfo();
      v2.calculateAge();
      v2.isVintage();
      
      Vehicle v3 = new Vehicle();
      v3.brand = "Bugatti";
      v3.model = "Bugatti Veyron";
      v3.year = 2006;
      v3.displayInfo();
      v3.calculateAge();
      v3.isVintage();
      
        v1.displayResults();
        v2.displayResults();
        v3.displayResults();
      
       
      
         
      
      
      }
    }
   