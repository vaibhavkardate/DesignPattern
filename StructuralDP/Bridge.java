package StructuralDP;

import java.lang.ModuleLayer.Controller;
import java.util.concurrent.ConcurrentHashMap;

interface TV
{
    void SwitchOn();
    void SwitchOff();
    void SetChannel(int channelNumber);
}

class samsungTV implements TV
{

    @Override
    public void SwitchOn() {
        System.out.println("turn on samsungTV tv");
    }

    @Override
    public void SwitchOff() {
        System.out.println("turn off samsungTV tv");
        
    }

    @Override
    public void SetChannel(int channelNumber) {
        System.out.println("setting channel on samsungTV tv :"+channelNumber);
    }
    
}

class sonyTV implements TV
{

    @Override
    public void SwitchOn() {
       System.out.println("turn on sony tv");
        
    }

    @Override
    public void SwitchOff() {
    
        System.out.println("turn off sony tv");
    }

    @Override
    public void SetChannel(int channelNumber) {
        
        System.out.println("setting channel on sony tv :"+channelNumber);
    }
    
}
 abstract class AbstractRemoteControl
    {
        protected TV ledTv;
        protected AbstractRemoteControl(TV ledTv)
        {
            this.ledTv = ledTv;
        }
        public abstract void SwitchOn();
        public abstract void SwitchOff();
        public abstract void SetChannel(int channelNumber);
    }

    class SamsungRemoteControl extends AbstractRemoteControl
    {
        public SamsungRemoteControl(TV ledTv)
        {
            super(ledTv);
        }
        
        public  void SwitchOn()
        {
            ledTv.SwitchOn();
        }
        public  void SwitchOff()
        {
            ledTv.SwitchOff();
        }
        public  void SetChannel(int channelNumber)
        {
            ledTv.SetChannel(channelNumber);
        }
    }  

    class SonyRemoteControl extends AbstractRemoteControl
    {
        public SonyRemoteControl(TV ledTv)
        {
            super(ledTv);
        }
        
        public  void SwitchOn()
        {
            ledTv.SwitchOn();
        }
        public  void SwitchOff()
        {
            ledTv.SwitchOff();
        }
        public  void SetChannel(int channelNumber)
        {
            ledTv.SetChannel(channelNumber);
        }
    }  

public class Bridge {
    public static void main(String[] args) {
           TV tv=new samsungTV();
        AbstractRemoteControl controller=new SamsungRemoteControl(tv);
      controller.SwitchOff();
        controller.SetChannel(20);
    }
}
