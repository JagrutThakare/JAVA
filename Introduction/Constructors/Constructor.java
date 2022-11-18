        // A constructor is similar to a method doesnt have return type 
        // name should be equal to class name.
        // when you make an object its always called.
package Constructors;


class Vehicle {
    int wheels;
    String color;
    int headLights = 2;

// 1
    // Vehicle() {             // If you dont make a constructor the compiler will 
    //     wheels = 4;         // make this on its own with state values of all variables  
    // }

// 2
        Vehicle(int noOfWheels) {
            wheels = noOfWheels;      
        }                                 

        Vehicle(int wheels, String color) {
            this.wheels = wheels;   // this word shows the reference of current object wheels.
            this.color = color;     // this word shows the reference of current object color.
            headLights = 2;
        }

}

public class Constructor {
    
    Constructor() {
        System.out.println("Object is now created");
    }
    public static void main(String[] args) {

 //       Constructor obj = new Constructor();

        Vehicle car = new Vehicle(3);
        System.out.println(car.wheels + " Wheels");

        Vehicle car2 = new Vehicle(4);
        System.out.println(car2.wheels + " Wheels");

        Vehicle eRiksha = new Vehicle(3, "blue");
        System.out.println(eRiksha.wheels + " wheels and color =  " + eRiksha.color);

    }
}
