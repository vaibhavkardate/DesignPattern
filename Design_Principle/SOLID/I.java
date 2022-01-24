package Design_Principle.SOLID;


// public interface UPIPayments {
    
//     public void payMoney();
    
//     public void getScratchCard();
    
//     public void getCashBackAsCreditBalance();
// }



interface UPIPayments {
    
    public void payMoney();
    
    public void getScratchCard();
}



interface CashbackManager{
    public void getCashBackAsCreditBalance();
   }
   
   