import java.util.Scanner;

/**
 *  SELECT STUDENTS
 * - Determine who are above 15 years old to receive a vaccine
 * - Enter number of students
 * Input student names and ages
 * Use arrays
 */



public class Driver {


    public static void main(String[] args){

    System.out.println("Enter number of students:");
    Scanner scan = new Scanner(System.in);
    int numStudent = scan.nextInt();
    /*- - - - - - - - - - - - - */
    String[] student = new String[numStudent];
    int[] age = new int[numStudent];
    /*- - - - - - - - - - - - - */
    Scanner scanName = new Scanner(System.in);
    Scanner scanAge = new Scanner(System.in);
    /*- - - - - - - - - - - - - */
    for(int i = 0; i < numStudent; i++){
    System.out.println("Enter name: ");
     student[i] = scanName.nextLine();
     System.out.println("Enter age: ");
     age[i] = scanAge.nextInt();
    }
    for(int i = 0; i < numStudent; i++){
      if(age[i] >= 15){
          System.out.println(student[i] + " can receive a vaccine.");
          System.out.println("The student is now " + age[i]);
      }
    }
    scan.close();
    scanAge.close();
    scanName.close();

    }
}
