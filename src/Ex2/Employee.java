package Ex2;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
//
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;

        if(salary<0){
            this.salary=0;
        }
        else {
            this.salary = salary;
        }
    }

   double sumSalaryAYear(){
            return this.salary*12;
    }


    void incrementSalary(int percent){
        double salary = this.getSalary() + (this.getSalary()/100*percent);
        this.setSalary(salary);
    }
    void printSalary(){
        System.out.println("Employee: "+ this.getFirstName() + " "+ this.getLastName() + " salary: " + this.getSalary() );
    }

}
class EmployeeTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employs[] = new Employee[2];
        for (int i = 1; i < 3; i++) {
            System.out.println("Enter first name of employee "+i+": ");
            String firstName = sc.nextLine();

            System.out.println("Enter last name of employee:  "+i+": ");
            String lastName = sc.nextLine();

            System.out.println("Enter salary of employee "+i+": ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employs[i-1]=new Employee(firstName,lastName,salary);
        }
        for (int i = 1; i < 3; i++) {
            System.out.println(employs[i-1].getFirstName()+"'s Sum of salary: ");
            employs[i-1].printSalary();
        }

        System.out.println("Enter per salary of employee");
        int perSalary = sc.nextInt();
        for (int i = 1; i < 3; i++) {
            employs[i-1].incrementSalary(perSalary);
        }

        for (int i = 1; i < 3; i++) {
            System.out.println("Sum of salary after add "+perSalary+"%:");
            employs[i-1].printSalary();
        }
    }

}


