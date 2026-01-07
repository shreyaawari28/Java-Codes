public class Heap_StringPool {
    public static void main(String[] args) {

        String a = new String ("Shreya"); //Stored in heap at diff locations
        String b = new String ("Shreya"); //Stored in heap at diff locations

        String c = "Shreya"; //Stored in String pool
        String d = "Shreya"; //Stored in String pool

        System.out.println("Does string a and b point to the same memory location? "+(a==b));

        System.out.println("Does string c and d point to the same memory location? "+(c==d));
    }
}
