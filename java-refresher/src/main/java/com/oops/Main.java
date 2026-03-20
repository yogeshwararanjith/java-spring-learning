package com.oops;

public class Main {

    public static void main(String[] args) {

        // run time polymorphism
        // upcasting -> child object is referenced using parent type
        Vehicle vehicle = new Vehicle("Vehicle","vehicle");
        vehicle.startEngineType();

        Vehicle bike = new MotorCycle("Splendor","Motor Cycle",2, "Petrol");
        bike.startEngineType();

        Vehicle car = new Car("Maruti","Four Wheeler",4,"EV");
        car.startEngineType();

        Vehicle maruti = new Car("Maruti","Four Wheeler",4,"Petrol");
        //cant access child class methods
       // maruti.OnAC();

        //downcasting child object back to child reference to access child methods

        Car swift = (Car) maruti;
        swift.OnAC();

        System.out.println(swift.toString());
    }
}
