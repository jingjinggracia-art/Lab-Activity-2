public class Main {

   public static void main(String[] args) {
   
      Vehicle v1 = new Vehicle("Koenigsegg", "Koenigsegg Jesko", 2020);
      Vehicle v2 = new Vehicle("Dodge", "1970 Dodge Charger R/T", 1970);
      Vehicle v3 = new Vehicle("Bugatti", "Bugatti Veyron", 2006);
      
      v1.displayInfo();
      v1.calculateAge();
      v1.isVintage();

      v2.displayInfo();
      v2.calculateAge();
      v2.isVintage();
      
      v3.displayInfo();
      v3.calculateAge();
      v3.isVintage();
      
       
      
         
      
      
      }
    }
   