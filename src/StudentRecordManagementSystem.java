import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecordManagementSystem {
    // Database to store student records (Static variable)
    public static Map<String, String[]> db = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Main menu loop
        while (true) {
            System.out.println("Welcome to Student Record Management System");
            System.out.println("1 Add new student");
            System.out.println("2 Update student information");
            System.out.println("3 View Student Details");
            System.out.println("4 Exit");

            int choice = 0;

            // Validate input to ensure it's an integer
            while (true) {
                System.out.print("Choose your option: ");
                String input = scanner.nextLine();
                try {
                    choice = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Choice. Please choose between option 1 to 4");
                }
            }

            // Switch case based on user choice
            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    UpdateNewStudent(scanner);
                    break;
                case 3:
                    ViewStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please choose between option 1 to 4");
                    break;
            }
        }
    }

    // Method to add a new student to the database (Static Method)
    private static void addNewStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        // Check if student ID already exists in the database
        if (db.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        String age = scanner.nextLine();
        // Convert age to an integer for validation
        int ageValue;
        try {
            ageValue = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid age.");
            return; // Exiting the method as the age format is invalid
        }
        // Validate that age is greater than 13 and1 less than 120 years
        if (ageValue < 13 || ageValue > 120) {
            System.out.println("Age is out of range! Age must be between 13 and 119 years.");
            return; // Exiting the method as the age is out of range
        }

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();
        // Create an array to store student information
        String[] studentInfo = { name, age, grade };
        // Add the student information to the database
        db.put(id, studentInfo);
        System.out.println("Student information added successfully.");
    }

    // Method to update student information (Static Method)
    private static void UpdateNewStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        // Check if the student exists in the database
        if (!db.containsKey(id)) {
            System.out.println("Student not found in database");
            return; // Exit method if student not found
        }
        // Retrieve the student's current information
        String[] existingStudentInfo = db.get(id);

        int option = 0;
        while (true) {
            System.out.println("Which info would you like to update: ");
            System.out.println("1 Update Name");
            System.out.println("2 Update Age");
            System.out.println("3 Update Grade");
            System.out.println("4 Update All Info");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            try {
                option = Integer.parseInt(input);
                break; // Break out of the loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid option");
            }
        }

        switch (option) {
            case 1:
                System.out.println("Current Student Name: " + existingStudentInfo[0]);
                System.out.print("Enter Updated student name: ");
                String newName = scanner.nextLine();
                existingStudentInfo[0] = newName;
                break;
            case 2:
                System.out.println("Current Student Age: " + existingStudentInfo[1]);
                System.out.print("Enter Updated student age: ");
                String newAge = scanner.nextLine();
                existingStudentInfo[1] = newAge;
                break;
            case 3:
                System.out.println("Current Student Grade: " + existingStudentInfo[2]);
                System.out.print("Enter Updated student grade: ");
                String newGrade = scanner.nextLine();
                existingStudentInfo[2] = newGrade;
                break;
            case 4:
                System.out.println("Current Student Information:");
                System.out.println("Name: " + existingStudentInfo[0]);
                System.out.println("Age: " + existingStudentInfo[1]);
                System.out.println("Grade: " + existingStudentInfo[2]);
                System.out.print("Enter updated student name: ");
                String updatedName = scanner.nextLine();
                System.out.print("Enter updated student age: ");
                String updatedAge = scanner.nextLine();
                System.out.print("Enter updated student grade: ");
                String updatedGrade = scanner.nextLine();
                existingStudentInfo[0] = updatedName;
                existingStudentInfo[1] = updatedAge;
                existingStudentInfo[2] = updatedGrade;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        // Update the student's information in the database
        db.put(id, existingStudentInfo);
        System.out.println("Student information updated successfully.");
    }

    // Method to view student details (Static Method)
    private static void ViewStudentDetails(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        String[] studentInfo = db.get(id);
        System.out.println("Student Details:");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + studentInfo[0]);
        System.out.println("Student ID: " + studentInfo[1]);
        System.out.println("Student grade: " + studentInfo[2]);
    }
}
