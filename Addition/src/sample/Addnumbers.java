package sample;

import java.util.Scanner;

public class Addnumbers {
	
	
	public static void main(String[] args) {
      
	int a,b;
      System.out.println("Plzz Enter the variables");
     
	Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      
      
      Addnumbers.add(a,b);
      
 
			
		}

	private static int add(int a, int b) {
                  int c = a+b;
				return c;
                  
		
	}
	}


