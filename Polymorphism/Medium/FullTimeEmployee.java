public class FullTimeEmployee extends Employee {

    @Override
    void calculateSalary(){
        double salary = 70000;
        System.out.println("Full time salary is: "+salary);
    }
}
