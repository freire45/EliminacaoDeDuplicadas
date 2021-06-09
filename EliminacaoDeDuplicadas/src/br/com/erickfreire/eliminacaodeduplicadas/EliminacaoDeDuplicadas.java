package br.com.erickfreire.eliminacaodeduplicadas;

import java.util.Scanner;

/**
 * Programa em Java que insere cinco valores em um vetor sem gerar duplicadas
 * @author Erick Freire
 * @version 1  - Criado em 09-06-2021 as 15:23
 */

public class EliminacaoDeDuplicadas {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		int valor;
		int repete = 0;
		
		for(int contador = 0; contador < vetor.length; contador++) {
			if(contador == 0) {
				System.out.printf("Informe o primeiro valor: entre 10 e 100: ");
				valor = entrada.nextInt();
				while(valor < 10 || valor > 100) {
							System.out.printf("Valor Incorreto: Informe o primeiro valor: entre 10 e 100: ");
							valor = entrada.nextInt();
				}
				vetor[contador] = valor;
			} else {
				System.out.printf("\nInforme o valor: entre 10 e 100 ");
				valor = entrada.nextInt();
				
				while(valor < 10 || valor > 100) {
					System.out.printf("Valor Incorreto: Informe o primeiro valor: entre 10 e 100: ");
					valor = entrada.nextInt();
		        }
				
				for(int i = 0; i < vetor.length; i++) {
					if(valor == vetor[i]) {
						repete += 1;
					}
				}
				
				if(repete > 0) {
					System.out.printf("\nValor Repetido: Informe o valor: entre 10 e 100 ");
					valor = entrada.nextInt();
					
					while(valor < 10 || valor > 100) {
						System.out.printf("Valor Incorreto: Informe o primeiro valor: entre 10 e 100: ");
						valor = entrada.nextInt();
			        }
				}
				vetor[contador] = valor;
				repete = 0;
				
			}
		}
		
		System.out.println();
		System.out.println("Valores do Vetor: ");
		
		for(int i : vetor) {
			System.out.printf("%d\t", i);
		}

	}

}
