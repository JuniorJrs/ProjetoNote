package impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Digite um valor:");
		   int N = sc.nextInt();
		   
		   if (N % 2 == 0) {
			       System.out.println("Par");
			       
		   }
		   else {
			       System.out.println("Impar");
			       
		   }
		   
		   sc.close();
		

	}

}
