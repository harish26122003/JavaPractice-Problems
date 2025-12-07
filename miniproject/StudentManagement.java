package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return id + " - " + name + " (" + course + ")";
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    list.add(new Student(id, name, course));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    if (list.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student s : list) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = list.removeIf(s -> s.id == removeId);

                    if (removed) {
                        System.out.println("Student Removed!");
                    } else {
                        System.out.println("Student ID not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
