package StructuralDP;

import java.util.HashMap;

interface Vehicle
{
    void setColor(String color);
    void startEngine();


}

class Truck implements Vehicle
{

     final int maxspeed;
     String color;
     public Truck()
     {
         maxspeed=150;
     }
    @Override
    public void setColor(String color) {
    this.color=color;
    }

    @Override
    public void startEngine() {
      
        System.out.println("Starting truck engine maxspreed"+ maxspeed);
    }

}

class Cycle implements Vehicle
{
    String color;
    final int maxspeed;
    public Cycle()
    {
        maxspeed=15;
    }
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting cycle of maxspreed "+maxspeed);
    }
 
}

class VehicleFactory
{
    HashMap<String,Vehicle> map=new HashMap<>();
    Vehicle vehicle;
     Vehicle getVehicle(String type)
    {
        if(map.containsKey(type))
        {
           vehicle= map.get(type);
        }else{
                if(type.equals("cycle"))
                {
                    vehicle=new Cycle();
                }else{
                    vehicle=new Truck();
                }
                map.put(type,vehicle);
        }
        return vehicle;
    }
}



public class FlyWeight {
    public static void main(String[] args) {
        VehicleFactory factory=new VehicleFactory();
      Vehicle vehicle=  factory.getVehicle("cycle");
        vehicle.setColor("red");
        vehicle.startEngine();  
    }
    
}
