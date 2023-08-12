package exercicios04condicional;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal ) {
			duracao = horaInicial - horaFinal; 
			
		}else {
			duracao = 24 - horaInicial + horaFinal;
			
		}
		System.out.println("O jogo durou " + duracao + " Horas");
		
		sc.close();
	}

}
