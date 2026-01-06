public class Employee {
    private int empId;
    public String empName;
    private double salary;
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void Details() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rahul", 45000);
        emp1.Details();
    }

}


