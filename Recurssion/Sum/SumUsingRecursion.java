public class SumUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Sum of first n natural numbers is: "+Sum(18));
    }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n + Sum(n-1);
    }
}
