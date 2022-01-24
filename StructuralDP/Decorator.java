package StructuralDP;
abstract class Pizza
{
    String description = "Unkknown Pizza";
  
    public String getDescription()
    {
        return description;
    }
  
    public abstract int getCost();
}

class PeppyPaneer extends Pizza
{
    public PeppyPaneer() { description = "PeppyPaneer"; }
    public int getCost() {  return 100; }
}
class FarmHouse extends Pizza
{
    public FarmHouse() {  description = "FarmHouse"; }
    public int getCost() { return 200; }
}
class Margherita extends Pizza
{
    public Margherita()  { description = "Margherita"; }
    public int getCost() { return 100;  }
}

abstract class ToppingsDecorator extends Pizza
{
    public abstract String getDescription();
}

class FreshTomato extends ToppingsDecorator
{
   
    Pizza pizza;
  
    public FreshTomato(Pizza pizza) { this.pizza = pizza; }
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato ";
    }
    public int getCost() { return 40 + pizza.getCost(); }
}
class Barbeque extends ToppingsDecorator
{
    Pizza pizza;
    public Barbeque(Pizza pizza) {  this.pizza = pizza;  }
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";
    }
    public int getCost() { return 90 + pizza.getCost(); }
}


public class Decorator {
    public static void main(String[] args) {
       System.out.println("without topping"); 
        Pizza pizza = new Margherita();
        System.out.println( pizza.getDescription()+" Cost :" + pizza.getCost());

        System.out.println("with toppping");
        FreshTomato tomato=new FreshTomato(pizza);
        System.out.println( tomato.getDescription()+" Cost :" + tomato.getCost());
    }
    
}
