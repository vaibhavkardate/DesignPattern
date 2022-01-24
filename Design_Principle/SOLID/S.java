package Design_Principle.SOLID;
class PrinterService{
    public void printPassbook() {
           //update transaction info in passbook
       }
}

class LoanService{
    public void getLoanInterestInfo(String loanType) {
            if (loanType.equals("homeLoan")) {
                //do some job
            }
            if (loanType.equals("personalLoan")) {
                //do some job
            }
            if (loanType.equals("car")) {
                //do some job
            }
        }
    }

    void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}    