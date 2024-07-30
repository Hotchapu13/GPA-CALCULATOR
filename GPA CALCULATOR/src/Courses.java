public class Courses {
    private String CourseName;
    private String CourseCode;
    private String Grade;

    public Courses(String CourseName, String CourseCode, String Grade) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Grade = Grade;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    public String getCourseName() {
        return CourseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }
    
    public String getGrade() {
        return Grade;
    }
}
