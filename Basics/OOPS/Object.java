package OOPS;

class Car{

    String brand_name = "BMW";
    String model = "340i";
    int year = 2026;
    boolean hype = true;
    double price = 7000000.990;

    void start(){
        System.out.println("you start the engine ");
    }
    void stop(){
        System.out.println("you stop the engine ");
    }
  
}

public class Object {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.stop();       
       
    }
}
