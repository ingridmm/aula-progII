package aula1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//use o for para imprimir todos os numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);	
			if (numeros[i]%2== 0){
				System.out.println("num é par");
			}
		}
		System.out.println();
	}
	
}	
