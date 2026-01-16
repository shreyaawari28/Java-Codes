public class Array {
    public static void main(String[] args) {
        //Search a specific element from an array
        int[] search = {34, 75, 98, 45, 12};
        int find = 98;
        for (int i = 0; i <= 4; i++) {

                if(search[i]==find){
               System.out.println("Element "+find+" found at index "+i);
               break;
           }
       }

        //Find maximum value in an integer array containing negative numbers.

        int[] max ={-87, -67, -4, -23, 2};
        int maxfind = Integer.MIN_VALUE;

        for(int n :max){
            if(n > maxfind){
                maxfind = n;
            }
        }
        System.out.println("Maximum element from the array is " + maxfind);

//        Prints the array elements in reverse order.
        char [] reverse ={'s','h','r','e','y','a'};
        System.out.print("Char array is:");
        for (int r = 0; r< reverse.length ; r++) {
            System.out.print(reverse[r]);

        }
        System.out.print("\nPrinting the array elements in reverse order:");

        for (int q = reverse.length-1 ; q >=0 ; q--) {
            System.out.print(reverse[q]);

        }

//        Calculates the sum of all elements in an integer array

        int[] sum ={1,2,3,4,5,6,7,8,9};
        int add = 0;
        for(int s: sum){
            add = add+s;
        }
        System.out.println("\nSum of the array elements is:"+add);



        //    Demonstrates traversal of a two-dimensional array.
        System.out.println("2D Array");
        int[][] array2d ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2d[i][j]+"\t");

            }
            System.out.println();

        }

        //Jagged Array
        System.out.println("Jagged array");

        int[][] jagged = new int[3][];
        jagged[0]=new int[]{1,2,3};
        jagged[1]=new int[]{4,5,6,7,8};
        jagged[2]=new int[]{9};

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j]+"\t");

            }
            System.out.println();

        }

    }





}
