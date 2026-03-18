public class Constructorss {

    int age;
    String name;

    public Constructorss(){
        this.age = 18;
        this.name = "Shreya";
    }

    public Constructorss(String n) {
        this.age = 19;
        this.name = n;
    }

    public Constructorss(int a , String na) {
        this.age = a;
        this.name = na;
    }

    void display(){
        System.out.println("Age : "+ age + " Name : "+ name);
    }

    public static void main(String[] args) {
        Constructorss s = new Constructorss();
        Constructorss s1 = new Constructorss("Mrunal");
        Constructorss s2 = new Constructorss(22,"Aarohi");

        s.display();
        s1.display();
        s2.display();



    }

}
