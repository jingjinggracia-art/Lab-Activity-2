public class Motorcycle extends Vehicle {
   private String engineType;
   public Motorcycle(String b,String m,int y,String e){
      super(b,m,y);
      this.engineType = e;
   }
   
    @Override
    void displayInfo() {
        System.out.println(
            "Vehicle brand: " + getBrand() +
            " // Vehicle model: " + getModel() +
            " // Year: " + getYear()
        );

        System.out.println("Engine: " + engineType);
        
      
    }
    
      @Override
       public void moveForward() {
         System.out.println("Motorcycle moves forward.");
      }

      @Override
       public void moveBackwards() {
         System.out.println("Motorcycle moves backwards.");
      }

      @Override
       public void moveLeft() {
         System.out.println("Motorcycle turns left.");
      }

      @Override
       public void moveRight() {
        System.out.println("Motorcycle turns right.");
   }
}
