package BehavioralDP;

interface State 
{
    public void changeState(StateController controller);

}

class Off implements State
{

    @Override
    public void changeState(StateController controller) {
       
        controller.setSpeed(new one());
        
    }
    
}

class one implements State
{

    @Override
    public void changeState(StateController controller) {
       
        controller.setSpeed(new two());
    }
    
}
class two implements State
{

    @Override
    public void changeState(StateController controller) {
        controller.setSpeed(new Off());
    }
    
}



class StateController
{
    private State state;
    public StateController()
    {
        state=new Off();
    }

    public void setSpeed(State controller)
    {
        state=controller;
    }

    public void changeState()
    {
        state.changeState(this);
    }
    @Override
    public String toString() {
      
        return state.getClass()+"";
    }

}

public class StateDP
{
    public static void main(String[] args) {
       StateController controller=new StateController();
       System.out.println(controller);
        controller.changeState();
        System.out.println(controller);
        controller.changeState();
        System.out.println(controller);
        controller.changeState();
        System.out.println(controller);
    }
}
