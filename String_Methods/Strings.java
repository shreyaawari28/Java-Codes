public class Strings {
    public static void main(String[] args) {

        String name1 = "Shreya";
        String name2 = "Aarohi";
        System.out.println("String Methods");
        System.out.println("String 1: "+name1);
        System.out.println("String 2: "+name2);
        System.out.println("Length of String 1: "+name1.length());
        System.out.println("Length of String 2: "+name1.length());
        System.out.println("Char at index 2 in String1 is: "+name1.charAt(2));
        System.out.println("Checking whether String 1 and String 2 are equal: "+name1.equalsIgnoreCase(name2));
        System.out.println("Comparing String 1 and String 2 using ASCII values: "+name1.compareToIgnoreCase(name2));
        System.out.println("Substring of String2 from index 2: "+name2.substring(2));
        System.out.println("Writing String 2 in Uppercase: "+name2.toUpperCase());
        System.out.println("Writing String 1 in Lowercase: "+name1.toLowerCase());
        System.out.println("Checking whether String 1 contains letter F: "+name1.contains("F"));
        String name3 ="           Kalpana";
        System.out.println("String 3 is: "+name3);
        System.out.println("Removing leading space from String 3 : "+ name3.trim());

    }
}
