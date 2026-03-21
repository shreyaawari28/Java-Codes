abstract class Employee {
    void calculateSalary(){
        System.out.println("Calculating Employee Salary...");
    }

    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        e.calculateSalary();

        e = new PartTimeEmployee(6);
        e.calculateSalary();
    }
}
