import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0;
		int alcool = 0;
		int disel = 0;
		
		int tipo = sc.nextInt();
		
		while(tipo != 4) {
			if(tipo == 1) {
				alcool++;
			}
			else if(tipo == 2) {
				gasolina++;
			}
			else if(tipo == 3) {
				disel++;
			}
			tipo = sc.nextInt();
		}
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Disel: "+disel);
		
		sc.close();
	}

}
