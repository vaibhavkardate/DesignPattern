package Design_Principle.SOLID;

class Guitar {

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
}

class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    //constructor, getters + setters
}

public class O {
    public static void main(String[] args) {
        Guitar guitar=new SuperCoolGuitarWithFlames();
        
    }
    
}
