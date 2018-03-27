package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos voce tem?");
		int numero = scanner.nextInt();
		
		//verifica a idade, se for maior que 30 imprime "vc e velho" 
		if (numero>=30) {
			System.out.println("VOCE É VELHO!");	
		} else if (numero<15){
			System.out.println("VOCE É NUEVO!");
		}
		
	}
}
