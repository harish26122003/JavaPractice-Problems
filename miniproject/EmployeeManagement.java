package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = basicSalary * 0.10;   // House Rent Allowance (10%)
        double da = basicSalary * 0.05;    // Dearness Allowance (5%)
        return basicSalary + hra + da;
    }

    public String toString() {
        return id + " - " + name + " | Basic: " + basicSalary +
               " | Total Salary: " + calculateSalary();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Salary Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, salary));
                    System.out.println("Employee Added!");
                    break;

                case 2:
                    System.out.println("\n--- Employee List ---");
                    if (list.isEmpty()) {
                        System.out.println("No employees available.");
                    } else {
                        for (Employee emp : list) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = list.removeIf(e -> e.id == removeId);

                    if (removed) {
                        System.out.println("Employee Removed!");
                    } else {
                        System.out.println("Employee ID not found!");
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

