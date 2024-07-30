public class Courses {
    private String CourseName;
    private String CourseCode;
    private String Grade;
    private int Credit;

    public Courses(String CourseName, String CourseCode, String Grade, int Credit) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Grade = Grade;
        this.Credit = Credit;
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

    public void setCredit(int Credit) {
        this.Credit = Credit;
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

    public int getCredit() {
        return Credit;
    }
}
