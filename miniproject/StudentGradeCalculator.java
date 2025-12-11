package miniproject;

import java.util.Scanner;

public class StudentGradeCalculator {

	static char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / (double) n;
        char grade = calculateGrade(average);

        // Output section
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Subjects: " + n);

        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


