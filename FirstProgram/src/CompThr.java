import java.util.Scanner;


public class CompThr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t =  new Scanner (System.in); 
		System.out.println("enter value a");
		int a =t.nextInt();
		System.out.println("enter value b");
		int b =t.nextInt();
		System.out.println("enter value c");
		int c =t.nextInt();
		int d=maxim(a,b,c);
	System.out.println("Maximum="+d);	
		


	}

	private static int maxim(int a, int b,int c) {
		// TODO Auto-generated method stub
		if((a>b)&&(a>c))
		{
		  return a;
		}
		else if(b>c)
			return b;
		else
			return c;
	}

}
