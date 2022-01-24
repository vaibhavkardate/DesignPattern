package StructuralDP;

interface Movable {
     // returns speed in MPH 
    double getSpeed();
}

class MPH implements Movable {
 private int speed;
    public MPH(int speed)
    {
        this.speed=speed;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
}

interface MovableAdapter {
    // returns speed in KM/H 
    double getSpeed();
}

class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;
    MovableAdapterImpl(Movable movable)
    {
        luxuryCars=movable;
    }


    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
public class Adapter {

    public static void main(String[] args) {
        Movable movable=new MPH(100);
        MovableAdapter adapter=new MovableAdapterImpl(movable);
        System.out.println(adapter.getSpeed());
    }
    
}
