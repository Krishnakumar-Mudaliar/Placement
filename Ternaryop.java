import java.util.Scanner;

public class Ternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();
        
        int greatestNumber = firstNumber > secondNumber ? firstNumber : secondNumber;

        System.out.println("The greatest number is: " + greatestNumber);

	}

}
