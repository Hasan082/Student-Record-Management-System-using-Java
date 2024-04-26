import java.util.*;

public class StudentRecordManagementSystem {
    // Key: student ID, Value: array of name, age, grade
    public static Map<String, String[]> studentsMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Record Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    viewStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        if (studentsMap.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        String age = scanner.nextLine();
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        String[] studentInfo = { name, age, grade };
        studentsMap.put(id, studentInfo);

        System.out.println("Student added successfully.");
    }

    public static void updateStudent(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        String id = scanner.nextLine();
        if (!studentsMap.containsKey(id)) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Enter new student information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("Grade: ");
        String grade = scanner.nextLine();

        String[] studentInfo = { name, age, grade };
        studentsMap.put(id, studentInfo);

        System.out.println("Student information updated successfully.");
    }

    public static void viewStudentDetails(Scanner scanner) {
        System.out.print("Enter student ID to view details: ");
        String id = scanner.nextLine();
        if (!studentsMap.containsKey(id)) {
            System.out.println("Student not found.");
            return;
        }

        String[] studentInfo = studentsMap.get(id);

        System.out.println("Student Details:");
        System.out.println("Name: " + studentInfo[0]);
        System.out.println("Age: " + studentInfo[1]);
        System.out.println("Grade: " + studentInfo[2]);
    }
}
