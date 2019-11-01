package excercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setGpa(Double aGpa) {
        gpa = aGpa;
    }

    public double getGpa() {
        return gpa;
    }


    // Update the appropriate fields: numberOfCredits, gpa
    public void addGrade(int courseCredits, double grade) {

        int qualScore = 0;

        if (grade > 90) {
            qualScore = 4;
        }
        if (grade > 80) {
            qualScore = 3;
        }
        if (grade > 70) {
            qualScore = 2;
        }
        if (grade > 60) {
            qualScore = 1;
        }
        if (grade < 60) {
            qualScore = 0;
        }

        gpa = ((this.gpa * this.numberOfCredits) + (qualScore * courseCredits)) / (this.numberOfCredits + courseCredits);
        // gpa = (total quality score) / (total number of credits)
        // total quality score = gpa * numberOfCredits

        this.numberOfCredits += courseCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        // freshman (0-29 credits), sophomore (30-59 credits), junior (60-89 credits),
        // or senior (90+ credits).
        String gradeLevel = "";

        if (this.numberOfCredits < 30) {
            gradeLevel = "freshman";
        }
        if (this.numberOfCredits < 60 && 29 > this.numberOfCredits) {
            gradeLevel = "sophmore";
        }
        if (this.numberOfCredits < 90 && 59 > this.numberOfCredits) {
            gradeLevel = "junior";
        }
        if (this.numberOfCredits >= 90) {
            gradeLevel = "senior";
        }

        return gradeLevel;
    }

    /* getters and setters omitted */

    public boolean equals(Object o) {
        if (o == this) {
            return false;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) o;
        return theStudent.getGradeLevel() == getGradeLevel();
    }

    public String toString() {
        return name + "(Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

}


