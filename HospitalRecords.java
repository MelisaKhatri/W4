public class HospitalRecords {
    public static void main(String[] args) {
        InPatient inp = new InPatient("Aarav", 35, "201");
        OutPatient outp = new OutPatient("Sita", 27, "20 June 2026");

        inp.getTreatmentPlan();
        outp.getTreatmentPlan();
    }
}

abstract class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void getTreatmentPlan();
}

class InPatient extends Patient {
    private String roomNumber;

    public InPatient(String name, int age, String roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("In-Patient Treatment Plan");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Treatment: Daily monitoring, medication, and nursing care.\n");
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("Out-Patient Treatment Plan");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Appointment Date: " + getAppointmentDate());
        System.out.println("Treatment: Take prescribed medicine and return for follow-up.\n");
    }
}