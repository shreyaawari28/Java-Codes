public class PartTimeEmployee extends Employee {
    int hours;
    public PartTimeEmployee(int h){
        hours = h;
    }
    @Override
    void calculateSalary(){
        double salary = hours * 200;
        System.out.println("Part Time Salary is: "+salary);
    }
}
