package com.oops;

public class Vehicle {

    private String name;
    private String type;
    private int wheels;

    public Vehicle(String name, String type){
        this.name = name;
        this.type = type;
    }

    public Vehicle(String name, String type, int wheels){
        this.name = name;
        this.type = type;
        this.wheels = wheels;
    }

//    public void startEngine(String type){
//        switch (type){
//            case "Motorcycle":
//                System.out.println(getClass().getSimpleName()+"started with kick");
//                break;
//            case "Car":
//                System.out.println(getClass().getSimpleName()+"started with push start");
//                break;
//            case "Auto":
//                System.out.println(getClass().getSimpleName()+"started with rope start");
//                break;
//            default:
//                System.out.println("Type is not mentioned");
//                break;
//        }
//    }

    public void startEngineType(){
        System.out.println("vehicle -> start engine");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

class MotorCycle extends Vehicle{
   private String fuelType;

   public MotorCycle(String name, String type){
        super(name, type);
   }

   public MotorCycle(String name, String type, int wheels, String fuelType){
       super(name,type,wheels);
       this.fuelType = fuelType;
   }

   public void startEngineType(){
       if(fuelType.toLowerCase().equals("petrol")){
           System.out.println(this.getName()+" "+getClass().getSimpleName()+" ignition ON and started");
       }else if(fuelType.toLowerCase().equals("EV")){
           System.out.println(this.getName()+" "+getClass().getSimpleName()+"battery ON and started");
       }
   }

}

class Car extends Vehicle{
    private String fuelType;

    public Car(String name, String type){
        super(name, type);
    }

    public Car(String name, String type, int wheels, String fuelType){
        super(name,type,wheels);
        this.fuelType = fuelType;
    }

    public void startEngineType(){
        if(fuelType.toLowerCase().equals("petrol")){
            System.out.println(this.getName()+" "+getClass().getSimpleName()+"ignition ON cylinders powered up and started");
        }else if(fuelType.equals("EV")){

            System.out.println(this.getName()+" "+getClass().getSimpleName()+" battery ON and started");
        }
    }

    public void OnAC(){
        System.out.println(getName()+" turn ON AC");
    }

    public String toString(){
        return getClass().getSimpleName()+" "+getName();
    }

}
