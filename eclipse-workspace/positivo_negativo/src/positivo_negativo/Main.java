package positivo_negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   int N = sc.nextInt();
		   
		   if (N < 0) {
			       System.out.println("Negativo");
			       
		   }
		   else {
			       System.out.println("Nao Negativo");
			       
		   }
           
		   sc.close();
	}

}
