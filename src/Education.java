public class Education {
    private String degreeType;
    private String major;
    private String university;
    private String graduationYear;

    public Education() {
    }//Default constructor

    public Education(String degreeType, String major, String university, String graduationYear){
        this.degreeType = degreeType;
        this.major = major;
        this.university = university;
        this.graduationYear = graduationYear;
    }

    //getters and setters
    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void displayText(){
        System.out.println();//Space
        System.out.println("Education");
        System.out.println(degreeType + " in " + major);
        System.out.println(university + ", " + graduationYear);
    }
}
