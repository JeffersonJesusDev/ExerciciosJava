package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangle = new Retangulo();
		
		System.out.println("Enter rectangle width and heigh:");
		retangle.height = sc.nextDouble();
		retangle.width = sc.nextDouble();
		
		System.out.println("AREA: " + retangle.area());
		System.out.println("\nPerimeter: " + retangle.perimeter());
		System.out.println("\nDiagonal: " + retangle.Diagonal());
		
		sc.close();
	}

}
