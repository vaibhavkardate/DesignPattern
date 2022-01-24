package StructuralDP;

interface MobileShop {  
    public void modelNo();  
    public void price();  
}  

class Iphone implements MobileShop {  
    @Override  
    public void modelNo() {  
        System.out.println(" Iphone 13 pro max ");  
    }  
    @Override  
    public void price() {  
    System.out.println(" Rs 165000.00 ");  
    }  
}  

class Samsung implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Samsung s21 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 95000.00 ");  
    }  
}  


class FacadeObject {  
    private MobileShop phone;  
    
    public void iphoneSale(){  
        phone=new Iphone();
        phone.modelNo();  
        phone.price();  
    }  
        public void samsungSale(){  
            phone=new Samsung();
            phone.modelNo();  
            phone.price();  
    }  
    
}  



public class Facade {
    public static void main(String[] args) {
        FacadeObject object=new FacadeObject();
        object.iphoneSale();
    }
}
