package Design_Principle.SOLID;

interface BankCard {
    public void doTransaction(int amount);
  }


  class CreditCard implements BankCard{
    public void doTransaction(int amount){     
               System.out.println("tx done with CreditCard");
        }
    }

    class DebitCard implements BankCard{
        public void doTransaction(int amount){
        System.out.println("tx done with DebitCard");
            }
        }

        class ShoppingMall {
            private BankCard bankCard;
            public ShoppingMall(BankCard bankCard) {
                    this.bankCard = bankCard;
                }
            public void doPayment(Object order, int amount){
                    bankCard.doTransaction(amount);
                }

            }   
            
     class D{
        public static void main(String[] args) {
                BankCard bankCard=new CreditCard();
                ShoppingMall shoppingMall1=new ShoppingMall(bankCard);
                 shoppingMall1.doPayment("do some order", 10000);
                }
            }