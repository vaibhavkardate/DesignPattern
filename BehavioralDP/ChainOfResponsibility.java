package BehavioralDP;
import java.lang.Exception;;
/**
 * ChainOfResponsibility
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        ChainOfResponsibility chain=new ChainOfResponsibility();
           chain.A1();
    }

    public void A1()
    {
        try
        {
            A2();
        } catch(Exception e)
        {
            // e.printStackTrace();
            System.out.println("Exceptionn call");
        }  
    }
    public void A2()
    {
        A3();
    }
    public void A3()
    {
        throw new ArithmeticException("Person is not allowed there");    
    }


    
}