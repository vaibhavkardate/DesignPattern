package Creational;
class Phone
{
    String OS;
    int battery,camera;
    double size;
    public Phone(String oS, int battery, int camera, double size) {
        OS = oS;
        this.battery = battery;
        this.camera = camera;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Phone [OS=" + OS + ", battery=" + battery + ", camera=" + camera + ", size=" + size + "]";
    }
   
}
class PhoneBuilder
{
    String OS;
    int battery,camera;
    double size;
   
    public void setOS(String oS) {
        OS = oS;
    }
   
    public void setBattery(int battery) {
        this.battery = battery;
    }
    
    public void setCamera(int camera) {
        this.camera = camera;
    }
  
    public void setSize(double size) {
        this.size = size;
    }
    public Phone getPhone()
    {
        return new Phone(OS, battery, camera, size);
    }

}

public class Builder {
    public static void main(String[] args) {
        PhoneBuilder builder=new PhoneBuilder();
        Phone phone= builder.getPhone();
        System.out.println(phone);
    }
    
}
