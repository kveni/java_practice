import java.util.Scanner;


public class MethProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t =  new Scanner (System.in); 
		
		System.out.println("enter value a");
		int a =t.nextInt();
		System.out.println("enter value b");
		int b =t.nextInt();
		int c=maxim(a,b);
	System.out.println("Maximum="+c);	
		


	}

	private static int maxim(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)
		{
		  return a;
		}
		else
			return b;
	}

}
