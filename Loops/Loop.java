public class Loop {
    public static void main(String[] args) {
//        Uses a for loop to print odd numbers from 1 to 10.
        System.out.println("Using for loop to print 1 to 10");

        for(int i=1 ; i<=10 ; i++){
            System.out.println(i);
        }

//        Uses a while loop to print even numbers from 0 to 10.
        System.out.println("Using a while loop to print even numbers from 0 to 10.");
        int n =0;
        while(n<=10){
            if (n%2==0){
                System.out.println(n);
            }
            n++;
        }

//        Uses a do-while loop to print numbers from 0 to 10.
        System.out.println(" Using a do-while loop to print numbers from 0 to 10.");

        int m=0;
        do{
            System.out.println(m);
            m++;
        }while(m<=10);



    }
}
