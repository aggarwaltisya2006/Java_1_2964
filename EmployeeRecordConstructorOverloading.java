package DAY12;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        this.id = 0;
        this.name = "N/A";
        this.department = "N/A";
        this.salary = 0.0;
    }

    Employee(String name, double salary) {
        this.id = 0;
        this.name = name;
        this.department = "N/A";
        this.salary = salary;
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display(String label) {
        if (id == 0 && name.equals("N/A")) {
            System.out.println(label + ": Default record created");
        } else if (department.equals("N/A")) {
            System.out.printf("%s: %s, Rs. %.2f%n", label, name, salary);
        } else {
            System.out.printf("%s: %d, %s, %s, Rs. %.2f%n", label, id, name, department, salary);
        }
    }
}

public class EmployeeRecordConstructorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 45000);
        Employee e3 = new Employee(101, "Neha", "IT", 60000);

        System.out.println();
        e1.display("Employee 1");
        e2.display("Employee 2");
        e3.display("Employee 3");
    }
}
