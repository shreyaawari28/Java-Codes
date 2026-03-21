public class UPIPayment extends Payment{
    @Override
    protected void pay(double amount) {
        System.out.println("Paid using UPI: "+amount);
    }
}
