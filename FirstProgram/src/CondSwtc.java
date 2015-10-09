import java.util.Scanner;


public class CondSwtc {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3,c=0;
		Scanner t =  new Scanner (System.in); 
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modular");
		System.out.println("6.Exit");
		while(true){
		System.out.println("enter value");
		int i =t.nextInt();
		switch(i)
		{
		case 1:
			c=a+b;
			System.out.println("Add="+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Sub="+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Mul="+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Quo="+c);
			break;
		case 5:
			c=a%b;
			System.out.println("Rem="+c);
			break;
		case 6:
			System.out.println("Bye Bye");
			break;
			
		default:
			System.out.println("Please Enter number between 1-6");
			
			
			}
		}
	}

}
