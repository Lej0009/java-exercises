package excercises.school;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private static int creditHours;
    private ArrayList<String> enrolledStudents;

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCreditHours(int aCreditHours) {
        creditHours = aCreditHours;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setEnrolledStudents(ArrayList<String getName()>) {
        enrolledStudents.add(student.getName());
    }

    public ArrayList getEnrolledStudents() {
        return enrolledStudents;
    }

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

        Course theCourse = (Course) o;
        return theCourse.getCourseName() == getCourseName();
    }

    public String toString() {
        return courseName + "(Credits: " + creditHours + ")";
    }


}
