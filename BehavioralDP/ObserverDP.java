package BehavioralDP;

import java.util.ArrayList;
import java.util.List;

class CricketFan
    {
        String name;
        public CricketFan(String name)
        {
            this.name=name;
        }
        public void getnotified()
        {
            System.out.println("cricket started "+name);
        }
    }
class Notification
{
    List<CricketFan> fan;
    public Notification()
    {
        this.fan=new ArrayList<>(); 
    }
    public void add(CricketFan f)
    {
        fan.add(f);
    }
    public void NotificationOfCricket()
    {
        for(CricketFan cricketFan:fan)
        {
            cricketFan.getnotified();
        }
    }
}




public class ObserverDP {
    public static void main(String[] args) {
        Notification notification=new Notification();
        notification.add(new CricketFan("Vaibhav"));
        notification.add(new CricketFan("kardate"));
        notification.add(new CricketFan("temp"));
        notification.NotificationOfCricket();
    }
    
}
