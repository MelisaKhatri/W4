public class EmployeeSystem {
    public static void main(String[] args) {

        Employee manager = new Manager("Alice", "11", 100000, 1500);
        Employee developer = new Developer("John", "10", 500000, 2, 3500);

        System.out.println("Manager Details");
        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Salary: " + manager.calculateSalary());
        System.out.println();
        System.out.println("Developer Details");
        System.out.println("Name: " + developer.getName());
        System.out.println("ID: " + developer.getId());
        System.out.println("Salary: " + developer.calculateSalary());
    }
}
abstract class Employee {
    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double rate;

    public Developer(String name, String id, double baseSalary,
                     int overtimeHours, double rate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * rate);
    }
}