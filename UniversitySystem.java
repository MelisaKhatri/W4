public class UniversitySystem {
    public static void main(String[] args) {

        Student std = new Student("Anuska", 101, "Art");
        Teacher teacher = new Teacher("Shital", 202, "Science");
        Admin admin = new Admin("Maya", 303, "Management");

        std.getRoleDetails();
        teacher.getRoleDetails();
        admin.getRoleDetails();
    }
}

abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void getRoleDetails();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Student extends Person {
    private String program;

    public Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Role: Student");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Program: " + program);
        System.out.println();
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

class Admin extends Person {
    private String department;

    public Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("Role: Admin");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + department);
        System.out.println();
    }
}