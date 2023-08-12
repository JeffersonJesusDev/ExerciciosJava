package ecercicio05condicional;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if (code == 1) {
				total = quantidade * 4.0;
		}
		else if (code == 2) {
				total = quantidade * 4.5;
		}
		else if (code == 3) {
				total = quantidade * 5.0;
		}
		else if (code == 4) {
				total = quantidade * 2.0;
		}
		else {
				total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
