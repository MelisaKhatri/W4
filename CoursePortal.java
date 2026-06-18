public class CoursePortal {
    public static void main(String[] args) {
        Course[] courses = {
             new LiveCourse("Java", "3 hours", "Binod", "9:00 PM - 11:00 PM"),
            new RecordedCourse("Digital", "2 hours", "Anuska", 15)
        };

        for (Course c : courses) {
            c.getCourseInfo();
        }
    }
}
class Course {
    private String title;
    private String duration;
    
    private String instructor;
    public Course(String title, String duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public void getCourseInfo() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Instructor: " + instructor);
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;
    }
}

class LiveCourse extends Course {
    private String scheduleTime;

    public LiveCourse(String title, String duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("Live Course");
        System.out.println("Course Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Schedule Time: " + scheduleTime);
        System.out.println();
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public RecordedCourse(String title, String duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo() {
        System.out.println("Recorded Course");
        System.out.println("Course Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Video Count: " + videoCount);
        System.out.println();
    }
}