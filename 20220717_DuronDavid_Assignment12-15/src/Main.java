/*********************************************************************************
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if  *
 * it does not exist. Write 100 integers created randomly into the file using     *
 * text I/O. Integers are separated by spaces in the file. Read the data back     *
 * from the file and display the data in increasing order.                        *
 *********************************************************************************/

// Here we import the utilities and io apis
import java.util.*;
import java.io.*;

public class Main {
    /** Main method */
    public static void main(String[] args) throws Exception {
        // Determine if file exists
        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                // Here is the output object
                PrintWriter output = new PrintWriter(file);
        ) {
            // Write 100 random integers to the file
            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 500) + 1));
                output.print(" ");
            }
        }

        // Creates an ArrayList object
        ArrayList<Integer> list = new ArrayList<>();

        try(
                // Uses the scanner class to read the file
                Scanner input = new Scanner(file);
        ) {
            // Displays the data back from the file
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }

        // Sorts list object
        Collections.sort(list);

        // Display data in ascending order
        System.out.print(list.toString()+"\n");
    }
}