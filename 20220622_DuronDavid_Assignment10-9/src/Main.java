public class Main {
    public static void main(String[] args) {
        Course currentCourse = new Course("Ice Cream 101"); // creates course object

        currentCourse.addStudent("Cloud Strife");
        currentCourse.addStudent("Tifa Lockhart");
        currentCourse.addStudent("Barret Wallace");

        currentCourse.dropStudent("Barret Wallace");

        String[] listOfStudents = currentCourse.getStudents(); // array to hold object property

        for (int i = 0; i < listOfStudents.length; i++) {
            if (i == 0) {
                System.out.println("Displaying list of enrolled students\n");
            }
            if (listOfStudents[i] == null) break;
            System.out.println(listOfStudents[i] + "\n");
        }

        currentCourse.clear();
    }
}