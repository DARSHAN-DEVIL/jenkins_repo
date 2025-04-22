

class Employee {
    int empId;
    String name;
    int age;
    double salary;


    public void inputEmployeeDetails() {
    empId=23;
     name="hell";
     age=19;
    salary=45000;
    }


    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Input employee details
        employee.inputEmployeeDetails();

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
