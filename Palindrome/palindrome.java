public class palindrome {
    public static void main(String[] args) {
        int digit = 121;
        int original = digit;
        int rem=0;
        int rev =0;
        if (digit<0){
            System.out.println("Digit cannot be aq palindrome as it is negative");
        }
        else{
               while(digit!=0){
                   rem = digit % 10;
                   rev = rev * 10 + rem;
                   digit = digit / 10;

               }
        }

        if (rev == original){
          System.out.println("Digit " +original+" is a palindrome");
        }
         else {
          System.out.println("Digit is not a palindrome");
        }


    }
}
