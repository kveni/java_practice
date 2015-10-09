import java.util.Scanner;


public class TabProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t =  new Scanner (System.in); 
		System.out.println("enter value i");
		int i =t.nextInt();
		
		tab(i);
		
	}

	private static void tab(int i) {
		// TODO Auto-generated method stub
		for(int a=1;a<5;a++)
		{
			
			
				int c= i*a;
				System.out.println(i+"*"+a+"="+c);
			
		
		}
		
	
	}

}
