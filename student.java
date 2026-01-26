package sweety;
import java.util.Scanner;

public class student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        // Calculations
        int total = english + maths;
        float percentage = total / 2.0f;

        // Grade logic
        char grade;

        if (total >= 290) {
            grade = 'A';
        } else if (total >= 275) {
            grade = 'B';
        } else if (total >= 250) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("Student: " + name);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();

	}

}
