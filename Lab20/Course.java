
import java.util.ArrayList;
class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents > 100) {
            String[] newStudents = new String[numberOfStudents];
            for (int i = 0; i < numberOfStudents; i++) {
                newStudents[i] = students[i];
            }
        }
        else {
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    public String[] getStudents() {
        String[] studentArray = new String[numberOfStudents];
        return studentArray;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        ArrayList<String> newStudents = new ArrayList<String>();
        for (int j = 0; j < students.length; j++) {
            newStudents.add(j, students[j]);
            if(newStudents.get(j).equalsIgnoreCase(student)) {
                newStudents.remove(j);
            }
            students[j] = newStudents.get(j);
        }
    }

    public void clear() {
        for(int i = 0; i < numberOfStudents; i++) {
            students[i] = "null";
        }
    }
}