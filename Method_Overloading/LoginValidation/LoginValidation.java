import java.util.Scanner;

public class LoginValidation {

    final String username = "Shreya_28";
    final String password = "Shreya1234";
    final int OTP = 7865;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        String uname = sc.next();

        System.out.println("Enter password: ");
        String pass = sc.next();

        System.out.println("Enter OTP: ");
        Integer otp = sc.nextInt();

        LoginValidation lv = new LoginValidation();
        lv.validate(uname, pass);

        lv.validate(uname,pass,otp);
    }



        public  void validate(String a, String b){
            if (a.equals(username) && b.equals(password))
            {
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Login failed");
            }
        }

        public  void validate(String a, String b, Integer c){
            if (a.equals(username) && b.equals(password) && c.equals(OTP))
            {
                System.out.println("Access Granted");
            }
            else{
                System.out.println("Access Denied");
            }
        }


}
