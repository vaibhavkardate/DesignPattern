package StructuralDP;

 interface Bank
{
    public void giveMoney();
}

class SBI implements Bank
{

    @Override
    public void giveMoney() {
       System.out.println("Money given");
    }

}
 class ProxyObject extends SBI
 {
     @Override
     public void giveMoney()
     {
        super.giveMoney();

     }
 }

public class Proxy 
{
    public static void main(String[] args) 
    {
        Bank proxy = new ProxyObject();
        proxy.giveMoney();
    }
}