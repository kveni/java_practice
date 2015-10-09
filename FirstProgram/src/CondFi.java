import java.util.Scanner;

public class CondFi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3, c = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modular");
		System.out.println("6.Exit");

		while (true ) {
			
			System.out.println("enter value");
			int i = t.nextInt();
			
			if (i == 1) {
				c = a + b;
				System.out.println("Add=" + c);
			} else if (i == 2) {
				c = a - b;
				System.out.println("Sub=" + c);
			} else if (i == 3) {
				c = a * b;
				System.out.println("Mul=" + c);
			} else if (i == 4) {
				c = a / b;
				System.out.println("Quo=" + c);
			} else if (i == 5) {
				c = a % b;
				System.out.println("Rem=" + c);
			} else if (i == 6) {
				System.out.println("Bye Bye");
				break;
			} else
				System.out.println("Please enter number 1....6");

		}
	}

}
