public class Courses {
    private String CourseName;
    private String CourseCode;
    private String Grade;
    private int Credit;
    private double GradePoint;

    public Courses(String CourseName, String CourseCode, String Grade, int Credit) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Grade = Grade;
        this.Credit = Credit;
        switch(Grade){
            case "A":
                GradePoint = 5.0 * Credit;
                break;
    
            case "B+":
                GradePoint = 4.5 * Credit;
                break;
    
            case "B":
                GradePoint = 4.0 * Credit;
                break;
    
            case "C+":
                GradePoint = 3.5 * Credit;
                break;
    
            case "C":
                GradePoint = 3.0 * Credit;
                break;
    
            case "D+":
                GradePoint = 2.5 * Credit;
                break;
    
            case "D":
                GradePoint = 2.0 * Credit;
                break;
    
            case "F":
                GradePoint = 0 * Credit;
                break;
        }
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
