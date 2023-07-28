package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		double pi = 3.14159;
		
		System.out.println("Valor de A: ");
		a = in.nextDouble();
		System.out.println("Valor de B: ");
		b = in.nextDouble();
		System.out.println("Valor de C: ");
		c = in.nextDouble();
		
		double triangulo = (a * c) / 2;
		double circulo = pi * Math.pow(b, b)/2;
				
				
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		
		
		in.close();
	}

}
