import java.lang.ScopedValue.Carrier;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    class Car{
      String brand;
      String model;
      String color;
      int year;
      double value;

      void honk(){
        System.out.println("Honk!");
      }
    }

    // display brand, model and value of each car
       Car brand = new car1("Honda");
       Car car2 = new Car(1969, "Toyota");
    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
	
	// Make BMW honk
	print("\nUsing car functions(behavior):");	

    
  }

}