public class Courses {
    private String CourseName;
    private String CourseCode;

    public Courses(String CourseName, String CourseCode) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
    public String getCourseName() {
        return CourseName;
    }
    public String getCourseCode() {
        return CourseCode;
    }
}
