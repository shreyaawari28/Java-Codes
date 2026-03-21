public abstract class Payment {
    protected double amount;

    protected abstract void pay(double amount);

    public void receipt(){
        System.out.println("Payment Processed");
    }


    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(2000);

        p = new UPIPayment();
        p.pay(2000);

        p = new CashPayment();
        p.pay(2000);
    }


}
