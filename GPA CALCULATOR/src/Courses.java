public class Courses {
    private String CourseName;
    private String CourseCode;
    private String Grade;
    private double Credit;
    private double GradePoint;

    public Courses(String CourseName, String CourseCode, String Grade, double Credit) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Grade = Grade;
        this.Credit = Credit;
        switch(Grade){
            case "A":
                this.GradePoint = 5.0 * Credit;
                break;
    
            case "B+":
                this.GradePoint = 4.5 * Credit;
                break;
    
            case "B":
                this.GradePoint = 4.0 * Credit;
                break;
    
            case "C+":
                this.GradePoint = 3.5 * Credit;
                break;
    
            case "C":
                this.GradePoint = 3.0 * Credit;
                break;
    
            case "D+":
                this.GradePoint = 2.5 * Credit;
                break;
    
            case "D":
                this.GradePoint = 2.0 * Credit;
                break;
    
            case "F":
                this.GradePoint = 0 * Credit;
                break;

            default:
                System.out.println("Invalid grade entered.");
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

    public void setCredit(double Credit) {
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

    public  double getCredit() {
        return Credit;
    }

    public double getGradePoint() {
        return GradePoint;
    }

}
