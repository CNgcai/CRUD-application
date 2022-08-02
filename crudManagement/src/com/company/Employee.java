package com.company;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;


public class Employee {
    // LinkedIn

    LinkedList<Record> list;

    //Default Constructor
    public Employee()
    {
        list = new LinkedList<>();
    }

    //Create employee
    public void addEmployee (Record record){
        // Check if record already exists or not, if not add it to Record list

        if (!read( record.getIdNum())) {
            list.add(record);
        }
        else {
            System.out.println("Employee already exists in the Record list");
        }

    }

    //Search Employee
    public boolean read (int num)
    {
        for ( Record l : list)
        {
            //check using id Number
            if(l.getIdNum() == num)
            {
                System.out.println(l);
                return true;
            }


        }
        return false;
    }
    //Delete Employee
    public void delete (int empIdNum) {
        //iterate through records
        Record deleteRec = null;

        for (Record ll: list) {
            if (ll.getIdNum() == empIdNum)
            {
                deleteRec = ll;
            }
        }
        if (deleteRec == null) {
            System.out.println("Invalid record Id");
        }
        else  {
            System.out.println("Successfully removed record from the list");
        }

        //Find Employee

    }
    public Record findEmp (int idNumber) {
        for (Record l : list) {

            // Checking record by id Number.
            if (l.getIdNum() == idNumber) {
                return l;
            }
        }

        return null;
    }

    public void update (int num, Scanner input) {
        if ( read(num)) {
            Record record = findEmp(num);
            //update ID num
            System.out.print("Please enter new Employee id Number ? ");
            int idNumber = input.nextInt();
            //update cellphone number
            System.out.print("Please enter new Employee cellphone Number ? ");
            int cellNumber = input.nextInt();
            input.nextLine();

            //update name
            System.out.print("Please enter new Employee name ? ");
            String name = input.nextLine();
            record.setName(name);
            record.setCellNum(cellNumber);
            record.setIdNum(idNumber);

            System.out.println("Employee info updated Successfully");

        }
        else {

            // Print statement
            System.out.println(
                    "Record Not Found in the Employee list");
        }


    }
    //Display Employee
    public void display() {
        //if list is empty
        if (list.isEmpty()) {

            // Print statement
            System.out.println("The list has no records\n");

        }
        for (Record record : list) {

            // Printing the list
            System.out.println(record.toString());
        }

    }
}
