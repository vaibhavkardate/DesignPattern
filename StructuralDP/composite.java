package StructuralDP;

import java.util.ArrayList;
import java.util.List;

interface component
{
    void getPrice();

}

class leaf implements component
{
    int price ;
    String name;
    public leaf(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    @Override
    public void getPrice() {
        System.out.println("name : "+name +" price :"+price);
    }

}
class CompositeDevice implements component
{
    String name;
    List<component> alist=new ArrayList<>();
    public CompositeDevice(String name)
    {
        this.name=name;
    }
    @Override
    public void getPrice() {
        System.out.println(name);
        for(component cop:alist)
        {
            cop.getPrice();
        }         

    }
    
}







public class composite {

        public static void main(String[] args) {
            component l1=new leaf("CPU", 8000);
            component l2=new leaf("HDD", 200);
            component l3=new leaf("Mouse", 500);
            component   l4=new leaf("RAM", 5000);
            component   l5=new leaf("Monitor", 10000);

            CompositeDevice c1=new CompositeDevice("MB");
            c1.alist.add(l1);
            c1.alist.add(l4);
            c1.getPrice();

           CompositeDevice c2=new CompositeDevice("Computer");
           CompositeDevice c3=new CompositeDevice("cabinet");
            c3.alist.add(l3);
            c3.alist.add(l5);

            c2.alist.add(l2);
            c2.alist.add(c3);
            c2.alist.add(c1);
            c2.getPrice();
    }
    
}
