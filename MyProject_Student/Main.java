package project1;

import java.util.Scanner;

public class Main {

    public static Student generateRandomUsers() {

        Student newStudent = new Student("JKerby", "secretPass11", "Jean-Kerby Auguste", "1000 Whitly Blvd",
                "RandomEmaill232@gmail.com");

        return newStudent;
    }

    public static void helpInsertIntoLink(LinkedList link, Student newStudent) {
        link.insertNewStudent(newStudent);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int HoldVal = -1;
        char exitValue = 'a';

        LinkedList link = new LinkedList();

        for (int i = 0; i < 2; i++) {
            helpInsertIntoLink(link, generateRandomUsers());
        }

        System.out.print("Select 1 if you are a student, if not select 0 if you are an administrator: ");
        HoldVal = input.nextInt();

        if (HoldVal == 1) {
            int HoldVal1 = -1;

            System.out.print("Select 1 to login or Select 2 to create an account: ");
            HoldVal1 = input.nextInt();

            if (HoldVal1 == 1) {

            } else if (HoldVal1 == 2) {


                System.out.print("Enter a username: ");
                String userName = input.next();

                System.out.print("Enter a password: ");
                String password = input.next();

                System.out.print("Enter your name: ");
                String name = input.next();

                System.out.print("Enter your address: ");
                String address = input.next();

                System.out.print("Enter your email: ");
                String email= input.next();


                link.insertHelper(userName, password, name, address, email);
                link.displayStudentInfo(userName,password);

            } else {
                System.out.println("You did not select on of the specified value,");
            }

        } else if (HoldVal == 0) {

            while (exitValue != 'x') {
            }

        } else {
            System.out.println(
                    "You did not select on of the specified value, select on the value if you want this application to work.");
        }

        // link.forwardDisplay();

        input.close();

    }

}
