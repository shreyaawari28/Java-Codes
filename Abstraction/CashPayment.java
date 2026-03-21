public class CashPayment extends Payment {


    @Override
    protected void pay(double amount) {
        if( amount > 5000){
            System.out.println("High cash transaction");

        }
        else{
            System.out.println("Transaction successful of Rs."+amount);
        }
    }
}
