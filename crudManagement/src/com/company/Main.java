package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int option = 0;

        //Creating Employee Object
        Employee employeeManagement =  new Employee();
        Record record = new  Record();

        //hard coding the data
        record.setIdNum(1173);
        record.setCellNum(278465597);
        record.setName("Lucas");
        //adding data to Linked list
employeeManagement.addEmployee(record);

        do {
            menu();
            option = input.nextInt();

            //switch case
            switch (option) {
                //Case 1
                case 1:
                    // Display message
                    System.out.print("What is the Employee ID Number ? ");
                    int idNum = input.nextInt();
                    System.out.print("What is the Employee Cellphone Number ? ");
                    int contactNum = input.nextInt();
                    input.nextLine();

                    System.out.print("What is the Employee's Name ? ");
                    String empName = input.nextLine();
                    record = new Record(empName, idNum, contactNum);
                    employeeManagement.addEmployee(record);
                    System.out.println(record.toString());
                    break;

                    //Case 2
                case 2 :
                    System.out.print("What is the Employee ID Number ? ");
                    int empDelete = input.nextInt();
                    employeeManagement.delete(empDelete);
                    break;

                //Case 3
                case 3:
                    System.out.print("What is the Employee ID Number ? ");
                    int empUpdate = input.nextInt();
                    employeeManagement.update(empUpdate,input);
                    break;

                //Case 4
                case 4:
                    System.out.print("What is the Employee ID Number ? ");
                    int empFind = input.nextInt();
                    if (!employeeManagement.read(empFind)) {
                        System.out.println("Employee ID does not exist\n");
                    }
                    break;

                //Case 5
                case 5:
                    employeeManagement.display();
                    break;

                //Case 9
                case 9:
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;

                // If none above case executes

                default:
                    System.out.println("\nInvalid input\n");

                    break;
            }
        }
        while (option != 9);

    }

    public static void menu()
    {
     //options menu
        System.out.println("MENU");
        System.out.println("--------------------------");
        System.out.println("1: Add Employee");
        System.out.println("2: Delete Employee");
        System.out.println("3: Update Employee");
        System.out.println("4: Search Employee");
        System.out.println("5: Display Employee");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
