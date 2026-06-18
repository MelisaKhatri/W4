public class GradeBook {
    public static void main(String[] args) {

       double[] graduateScores = {50.6, 70.8, 82.5, 65.90, 82.89};
        double[] undergraduateScores = {67.00, 75.00, 87.50, 77.00, 99.00};

         GraduateStudent graduate = new GraduateStudent(
                "Jane",
                100,
                graduateScores,
                "IT"
        );

        UndergraduateStudent undergraduate = new UndergraduateStudent(
                "John ",
                120,
                 undergraduateScores
        );

         System.out.println("Graduate Student");
        System.out.println("Name: " + graduate.getStudentName());
        System.out.println("Roll Number: " + graduate.getStudentId());
        System.out.println("Average: " + graduate.calculateAverage());
        graduate.printThesisTitle();

        System.out.println();

       System.out.println("Undergraduate Student");
        System.out.println("Name: " + undergraduate.getStudentName());
        System.out.println("Roll Number: " + undergraduate.getStudentId());
        System.out.println("Average: " + undergraduate.calculateAverage());
    }
}
abstract class Student {
    private String studentName;
    private int studentId;
    private double[] studentMarks;
    public Student(String studentName, int studentId, double[] studentMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMarks = studentMarks;
    }

  public String getStudentName() {
        return studentName;
    }

     public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

     public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double[] getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(double[]studentMarks) {
        this.studentMarks = studentMarks;
    }

    public double calculateAverage() {
        if (studentMarks.length == 0) {
            return 0;
        }
        double total = 0;
        for (double mark : studentMarks) {
            total += mark;
        }
        return total / studentMarks.length;
    }
}

class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String studentName, int studentId,
                           double[] studentMarks, String researchTopic) {
        super(studentName, studentId, studentMarks);
        this.researchTopic = researchTopic;
    }

   
    public String getResearchTopic() {
        return researchTopic;
    }

  
    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public void printThesisTitle() {
        System.out.println("Research Topic: " + researchTopic);
    }
}
class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName,
                                int studentId,
                                double[] studentMarks) {
        super(studentName, studentId, studentMarks);
    }
}