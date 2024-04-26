# Student Record Management System

The Student Record Management System is a Java application designed to empower administrators with efficient tools for handling student records. This system allows administrators to add new students, update student information, and view student details through an intuitive command-line interface.

## Features

- **Add New Student**: Administrators can add new students by providing their name, ID, age, and grade.
- **Update Student Information**: Administrators can update the information of existing students by specifying their ID and providing new details.
- **View Student Details**: Administrators can view the details of a specific student by entering their ID.

## Requirements

- Java Development Kit (JDK) installed on your system.
- Command-line interface (CLI) for running the Java program.

## Usage

1. Clone or download the repository to your local machine.
2. Open a terminal and navigate to the directory containing the Java files.
3. Compile the Java files using the following command:
   ```
   javac StudentRecordManagementSystem.java
   ```
4. Run the compiled Java program using the following command:
   ```
   java StudentRecordManagementSystem
   ```
5. Follow the on-screen prompts to interact with the Student Record Management System.

## Documentation

### Class: StudentRecordManagementSystem

This class serves as the entry point of the application and contains the main method for executing the program.

#### Methods

- `main(String[] args)`: The main method displays a menu of options and handles user input to perform various operations such as adding new students, updating student information, and viewing student details.

### Error Handling

The program includes error handling to manage cases where the student ID is not found or invalid inputs are provided. Error messages are displayed to guide the user in resolving issues.


## License

This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/license/mit) file for details.
