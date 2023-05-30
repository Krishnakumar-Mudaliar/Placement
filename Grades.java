
import java.util.Scanner;

public class Grades {
   public static void main(String[] args) {
      
  
      Scanner scanner = new Scanner(System.in);
      
 
      System.out.print("Enter marks for Subject 1: ");
      int subject1 = scanner.nextInt();
      System.out.print("Enter marks for Subject 2: ");
      int subject2 = scanner.nextInt();
      System.out.print("Enter marks for Subject 3: ");
      int subject3 = scanner.nextInt();
      
      
      int total = subject1 + subject2 + subject3 ;
      double average = total / 3.0;
      String grade;
      
    
 
      if (average >= 90) {
         grade = "A";
      } else if (average >= 80 && average < 90) {
         grade = "B";
      } else if (average >= 70 && average < 80) {
         grade = "C";
      } else {
         grade = "Fail";
      }
      
      // Print the total marks, average marks, and grade
      System.out.println("Total marks: " + total);
      System.out.println("Average marks: " + average);
      System.out.println("Grade: " + grade);
   }
}
