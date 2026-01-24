public class NegNumbers {
    public static void main(String[] args) {
        int[] num ={2, -6, 4, 8, 1, -9};
        int count =0;
        for (int n:num){
            if(n<0){
                count++;
            }
        }
        System.out.println(" count of negative numbers in the array are:"+count);
    }
}