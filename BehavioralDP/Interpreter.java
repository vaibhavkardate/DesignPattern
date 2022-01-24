package BehavioralDP;

interface Expression
{
    boolean interpreter(String con);
}
  

class TerminalExpression implements Expression 
{
    String data;
  
    public TerminalExpression(String data)
    {
        this.data = data; 
    }
  
    public boolean interpreter(String con) 
    {
        if(con.contains(data))
        {
            return true;
        }
        else
        {
            return false;  
        }
    }
}
// OrExpression class implementing
// the above interface. This interpreter 
// just returns the or condition of the 
// data is same as the interpreter data.
class OrExpression implements Expression 
{
    Expression expr1;
    Expression expr2;
  
    public OrExpression(Expression expr1, Expression expr2) 
    {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public boolean interpreter(String con) 
    {        
        return expr1.interpreter(con) || expr2.interpreter(con);
    }
}
  
// AndExpression class implementing
// the above interface. This interpreter 
// just returns the And condition of the 
// data is same as the interpreter data.
class AndExpression implements Expression 
{
    Expression expr1;
    Expression expr2;
  
    public AndExpression(Expression expr1, Expression expr2) 
    { 
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public boolean interpreter(String con) 
    {        
        return expr1.interpreter(con) && expr2.interpreter(con);
    }
}
  
// Driver class
public class Interpreter
{
  
    public static void main(String[] args) 
    {
        Expression person1 = new TerminalExpression("vaibhav");
        Expression person2 = new TerminalExpression("Kardate");
        Expression isSingle = new OrExpression(person1, person2);

        System.out.println(isSingle.interpreter("vaibhav"));
        System.out.println(isSingle.interpreter("Kardate"));
        System.out.println(isSingle.interpreter("Achint"));
          
        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);    
          
        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));
  
    }
}