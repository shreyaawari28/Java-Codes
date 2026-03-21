public class CreditCardPayment extends Payment{
    @Override
    protected void pay(double amount) {
        double finalAmount = amount + (amount * 2) / 100;
        System.out.println("Paid using Credit Card: "+finalAmount);

    }
}
