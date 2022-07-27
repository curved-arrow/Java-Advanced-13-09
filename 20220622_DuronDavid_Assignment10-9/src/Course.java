public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        // added if statement to prevent errors by creating an array larger than current one
        if (numberOfStudents >= students.length) {
            String[] newArray = new String[students.length*2]; // creates new array that is twice as large
            System.arraycopy(students, 0, newArray, 0, students.length); // arraycopy method is used here
            this.students = newArray; // students property is now updated to reflect the new array
        }

        System.out.println("Added " + student + " to " + this.courseName + "\n");
        this.students[numberOfStudents++] = student; // I updated this to increment the array element while also adding the student to the array element
    }

    public String[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void dropStudent(String student) {
        // this method will be used to remove a student from our array
        for (int i = 0; i < students.length; i++) {
            if (student.equalsIgnoreCase(students[i])) {
                System.out.println("Dropped " + student + " from " + this.courseName + "\n");

                this.students[i] = null; // sets the current value of the element to null
                this.numberOfStudents--; // reduces the total amount of elements in the array

                while (i < numberOfStudents) {
                    this.students[i] = students[i+1]; // allows iteration through the array.
                    i++;
                }
                break;
            }
        }
    }

    public void clear() {
        this.students = new String[100];
        this.numberOfStudents = 0;
        System.out.println(this.courseName + " has:\n" + this.numberOfStudents + " number of students");
    }
}