public class Encapsulation {
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println(d.getName() + " : " + d.getAge() );

    }
}

class demo{
    private int Age = 10;
    private String Name = "Shreya";

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }
}
