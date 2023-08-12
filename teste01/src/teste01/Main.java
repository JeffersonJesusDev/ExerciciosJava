package teste01;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resp;
		
		do {
			System.out.println("Digite a temperatura em Celsisu: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}

}
