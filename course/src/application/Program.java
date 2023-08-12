package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; // Uma única variavel do tipo triangolo para ter as variavéis e já o seus atributos
		x = new Triangle();  //minha instancia criei o objeto os "quadrados do a,b,c" = locais da memoria
		y = new Triangle(); //alocação dinamica de memória, objetonos dinamicos durante execução
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
			
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
