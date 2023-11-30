package com.tecnicas.lista02;

import java.util.Scanner;

public class Questoes {
	
	Scanner entrada = new Scanner(System.in);
	
	// Print Vetor;
	public static void imprimirVetor(int vetor[]) {
		// Função de imprimir os elementos de um vetor de inteiros qualquer
		for (int i = 0; i < vetor.length; i++ ) {
			System.out.println(vetor[i]);
		}
	}
	
	// Questão 01
	public static int QuestaoUm(int vetor[]) {
		System.out.println();
		System.out.println("Questao 01 ---------------------------");
		
		int soma = 0;
		
		// i = 2 para ignorar as 2 primeiras posicoes
		// i < (vetor.length - 2) para ignorar as 2 ultimas posicoes
		System.out.print("Valores: ");
		for(int i = 2; i < (vetor.length - 2); i++ ) {
			soma = (soma + vetor[i]);
			System.out.print(vetor[i] + " ");
		}
		System.out.println("Soma dos valores: " + soma);
		return soma;
	}
	
	// Questão 02
	public static void QuestaoDois(int a, int b) {
		System.out.println();
		System.out.println("Questao 02 ---------------------------");
		
		System.out.println("Numeros pares entre " + a + " e " + b + ": ");
		// Calcula o modulo dos numeros entre a e b
		for(int i = a; i <= b; i++) {
			// Caso o modulo seja 0 entao o numero é par
			if(i%2==0) {
				System.out.println(i + " ");
			}
		}
		
	}
	
	// Questao 03
	public static int QuestaoTre(int vetorA[], int vetorB[]) {
		System.out.println();
		System.out.println("Questao 03 ---------------------------");
		
		int i = 0;
		int j = 0;
		int media = 0;
		
		// Soma todos os valores do vetorA
		for (i = 0; i < vetorA.length; i++ ) {
			media = media + vetorA[i];
		}
		
		// Soma todos os valores do vetorB
		for (j = 0; j < vetorB.length; j++ ) {
			media = media + vetorB[j];
		}
		
		// Realiza a media;
		System.out.println("Vetor A:");
		imprimirVetor(vetorA);
		System.out.println("Vetor B:");
		imprimirVetor(vetorB);
		System.out.println("Media: " + media/(i + j));
		
		// Realiza a media;
		return media/(i + j);
	}
	
	// Questao 04
	public static double QuestaoQuatro(int vetorValores[], int vetorPesos[]) {
		System.out.println();
		System.out.println("Questao 04 ---------------------------");
		
		// retorna -1 como falso caso os vetores não tenham os mesmos tamanhos
		if (vetorValores.length != vetorPesos.length) {
			return -1;
		}
		
		double a = 0;
		double b = 0;
		
		// Aplicacao da formula da media ponderada
		for (int i = 0; i < vetorValores.length; i++ ) {
			a = (vetorValores[i] * vetorPesos[i]) + a;
			b = (vetorPesos[i]) + b;
		}
		
		System.out.println("Valores: ");
		imprimirVetor(vetorValores);
		System.out.println("Pesos: ");
		imprimirVetor(vetorPesos);
		
		System.out.println("Média ponderada dos valores com seus pesos: " + (a/b));
		return a/b;
	}
	
	// Questao 05
	public static int QuestaoCinco (int valor, int vetorA[], int vetorB[]) {
		System.out.println();
		System.out.println("Questao 05 ---------------------------");
		
		// Contador de ocorrencias
		int cont = 0;
		
		// compara o valor com cada possicao do vetor vetorA
		for (int i = 0; i < vetorA.length; i++ ) {
			if (vetorA[i] == valor) {
				cont++;
			}
		}
		
		// compara o valor com cada possicao do vetor vetorB
		for (int i = 0; i < vetorB.length; i++ ) {
			if (vetorB[i] == valor) {
				cont++;
			}

		}
		System.out.println("Vetor A: ");
		imprimirVetor(vetorA);
		System.out.println("Vetor B: ");
		imprimirVetor(vetorB);
		
		
		System.out.println("Quantidade de ocorrencias: " + cont);
		return cont;
	}
	
	// Questao 06
	public static int[] QuestaoSeis (int vetor[]) {
		System.out.println();
		System.out.println("Questao 06 ---------------------------");
		
		// Cria um novo vetor com o mesmo tamanho do que recebe
		int[] novoVetor = new int[vetor.length];
		
		// Pega cada elemento de vetor[i] e o coloca em novoVetor[i]
		for (int i = 0; i < vetor.length; i++ ) {
			novoVetor[i] = vetor[i];
		}
		System.out.println("Vetor recebido: ");
		imprimirVetor(vetor);
		System.out.println("Nova vetor cópia: ");
		imprimirVetor(novoVetor);
		return novoVetor;
	}

	// Questao 07
	public static int[] QuestaoSete (int vetor[]) {
		System.out.println();
		System.out.println("Questao 07 ---------------------------");
		
		System.out.println("Vetor recebido: ");
		imprimirVetor(vetor);
		
		int aux = 0;
		// percorre o vetor
		for (int i = 0; i < vetor.length; i++ ) {
			for (int j = 1; j < (vetor.length - i); j++ ) {
				// Verifica se vetor[ j -1] é maior que seu elemento seguinte
				// Se sim, ele inverte a ordem dos elementos
				if (vetor[j - 1] > vetor[j]) {
					aux = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		System.out.println("Novo vetor ordenada: ");
		imprimirVetor(vetor);
		return vetor;
	}
	
	// Questao 08
	public static boolean QuestaoOito(int vetor[]) {
		System.out.println();
		System.out.println("Questao 08 ---------------------------");
		
		System.out.println("Vetor: ");
		imprimirVetor(vetor);
		
		// Verifica o elemento vetor[i] com seu elemento seguinte
		// caso vetor[i] seja maior que o elemento seguinte, o vetor nao esta em ordem crescente
		for (int i = 0; i < vetor.length - 1; i++ ) {	
			if (vetor[i] > vetor[i + 1]) {
				System.out.println("Vetor nao ordenada de forma crescente!");
				return false;
			}
		}
		System.out.println("Vetor ordenada de forma crescente!");
		return true;
	}
	
	// Questao 09
	public static int QuestaoNove(int k, int vetor[]){
		System.out.println();
		System.out.println("Questao 09 ---------------------------");
		
		// Cria uma copia do vetor que recebe como parametro
		int vetorAux[] = vetor;
		
		// Ordenada de forma crescente
		int aux = 0;	
		for (int i = 0; i < vetorAux.length; i++ ) {
			for (int j = 1; j < (vetorAux.length - i); j++ ) {
				if (vetorAux[j - 1] > vetorAux[j]) {
					aux = vetorAux[j - 1];
					vetorAux[j - 1] = vetorAux[j];
					vetorAux[j] = aux;
				}
			}
		}
		
		System.out.println("Vetor: ");
		imprimirVetor(vetor);
		System.out.print("O " + k + " maior valor: " + (vetorAux[vetorAux.length - k]));
		
		// Como é em ordem crescente, o ultimo valor é o maior, logo, o indice do k esimo 
		// maior valor é (tamanhoDoVetor - k)
		return (vetorAux[vetorAux.length - k]);
	}
	
	// Questao 10
	public static int QuestaoDez(int k, int vetor[]){
		System.out.println();
		System.out.println("Questao 10 ---------------------------");
		int x = k;
		k = k - 1;
		
		// Cria uma copia do vetor que recebe como parametro
		int vetorAux[] = vetor;
		
		// Ordenada de forma crescente
		int aux = 0;	
		for (int i = 0; i < vetorAux.length; i++ ) {
			for (int j = 1; j < (vetorAux.length - i); j++ ) {
				if (vetorAux[j - 1] > vetorAux[j]) {
					aux = vetorAux[j - 1];
					vetorAux[j - 1] = vetorAux[j];
					vetorAux[j] = aux;
				}
			}
		}
		
		System.out.println("Vetor: ");
		imprimirVetor(vetor);
		System.out.print("O " + x + " menor valor: " + vetorAux[k]);
		
		// Como é em ordem crescente, o ultimo valor é o maior, logo, o indice do k esimo 
		// menor valor é (k)
		return (vetorAux[k]);
	}
	
	// Questao 11
	public static boolean QuestaoOnze(int vetorA[], int vetorB[]) {
		System.out.println();
		System.out.println("Questao 11 ---------------------------");
		
		
		// Verifica Tamanho dos Vetores
		if(vetorA.length != vetorB.length) {
			System.out.println("Vetores de tamanhos diferentes!!!");
			return false;
		}
		
		// Analisa posicao a posicao
		for (int i = 0; i < vetorA.length; i++ ) {
			if (vetorA[i] != vetorB[i]) {
				System.out.println("Vetores com valores diferentes!!");
				System.out.println("A = " + vetorA[i] + " B = " + vetorB[i]);
				return false;
			}
		}
		System.out.println("Vetores Iguais");
		return true;
	}
	
	// Questao 12
	public static int QuestaoDoze(int base, int expoente) {
		System.out.println();
		System.out.println("Questao 12 ---------------------------");
		
		// inicia a base
		int potencia = 1;
		
		// multiplica a base n=exponte vezes
		for (int i = 1; i <= expoente; i++ ) {
			potencia = potencia * base;
		}
		
		System.out.println(base + " elevado a " + expoente + " = " + potencia);
		return potencia;
	}
	
	// Questao 13
	public static boolean QuestaoTreze (int numero) {
		System.out.println();
		System.out.println("Questao 13 ---------------------------");
		
		// Calcula o modulo do numero por i i-vezes  
		for (int i = 2; i < numero; i++) {
			// Verifica o modulo 
			// Caso o numero seja par ou divisivel por i, o sistema retorna falso
			// Do contrario, true
			if(numero % i == 0) {
				System.out.println("O número " + numero + " não é primo");
				return false;
			}
		}
		System.out.println("O número " + numero + " é primo");
		return true;	
	}
	
	// Questao 14
	public static int[] QuestaoQuatorze(int vetorA[], int vetorB[]) {
		System.out.println();
		System.out.println("Questao 14 ---------------------------");
		
		// novo vetor com o manho do vetorA + vetorB
		// ja que por definição, o maximo de ocorrencias nao pode ultrapassar esse numero
		int novoVetor[] = new int[vetorA.length + vetorB.length];
		// Contador de ocorrencias
		int k = 0;
		
		// Verifica se vetorA[i] é igual a vetorB[b]
		for (int i = 0; i < vetorA.length; i++ ) {
			for (int j = 0; j < vetorA.length; j++ ) {
				if (vetorA[i] == vetorB[j]) {
						novoVetor[k] = vetorA[i];
						k++;
				}
			}
		}
		System.out.println("Vetor A:");
		imprimirVetor(vetorA);
		System.out.println("Vetor B:");
		imprimirVetor(vetorB);
		System.out.println("Novo vetor com as ocorrencias dos dois vetores ");
		imprimirVetor(novoVetor);
		return novoVetor;
	}
	
	// Questao 15
	public static int[] QuestaoQuinze(int numero, int vetor[]) {
		System.out.println();
		System.out.println("Questao 15 ---------------------------");
		
		// Computando o numero de ocorrencias no vetor
		int cont = 0;
		for (int i = 0; i < vetor.length; i++ ) {
			if (vetor[i] == numero) {
				cont++;
			}
		}
		
		// Definindo o novo vetor
		int novoVetor[] = new int[vetor.length - cont];
		
		// Preenchendo o novo vetor sem as ocorrencias computadas anteriormente
		int k = 0;
		for (int i = 0; i < vetor.length; i++ ) {
			if (vetor[i] != numero) {
				novoVetor[k] = vetor[i];
				k++;
			}
		}
		
		// Exibeindo valor final
		System.out.println("Novo vetor sem o elemento: " + numero);
		for (int i = 0; i < novoVetor.length; i++ ) {
			System.out.println(novoVetor[i]);
		}
		
		return novoVetor;
	}

	// Questao 16
	public static boolean QuestaoDezesseis(String palavra) {
		return false;
	}
	
	// Questao 17
	public static boolean QuestaoDezesete(int numero) {
		System.out.println();
		System.out.println("Questao 17 ---------------------------");
		
		// Calcula o modulo do numero por i i-vezes  
		for (int i = 2; i < numero; i++) {
			// Verifica o modulo 
			// Caso o numero seja par ou divisivel por i, o sistema retorna falso
			// Do contrario, true
			if(numero % i == 0) {
				System.out.println("O número " + numero + " não é primo");
				return false;
			}
		}
		System.out.println("O número " + numero + " é primo");
		return true;
	}

	// Questao 18
	public static String QuestaoDezoito(String palavra) {
		System.out.println();
		System.out.println("Questao 18 ---------------------------");
		
		String novaString = "";
		
		// Itera e concatena as letras da palavra de tras para frente na nova string
		for (int i = palavra.length() - 1; i >= 0 ; i-- ) {
			novaString = novaString + palavra.charAt(i);
		}
		System.out.println("String recebida: " + palavra);
		System.out.println("String invertida: " + novaString);
		return novaString;
		
	}

	// Questao 19
	public static double QuestaoDezenove(double valorInicial, double taxa, int periodo) {
		System.out.println();
		System.out.println("Questao 19 ---------------------------");
		
		// Formula Montante = capital * ( (1 + taxa)^periodo )
		double montante = valorInicial * Math.pow((1 + taxa), periodo);
		
		System.out.println(montante);
		
		return montante;
	}
	
	// Questao 20
	public static boolean QuestaoVinte(int numero) {
		System.out.println();
		System.out.println("Questao 20 ---------------------------");
		int aux = 0;
		for (int i = 1; i < numero; i++ ) {
			
			// Pega os divisores próprios e os soma consecutivamente em aux
			if(numero % i == 0) {
				aux = i + aux;
			}
		}
		
		// Verifica se a soma dos divisores é igual ao numero
		if(aux == numero) {
			System.out.println(numero + " eh perfeito!");
			return true;
		}
		System.out.println(numero + " nao eh perfeito!");
		return false;	
	}
	
	// Questao 21
	public static void QuestaoVinteUm() {
		
	}
	
	// Questao 22
	public static void QuestaoVinteDois() {
		System.out.println();
		System.out.println("Questao 22 ---------------------------");
		
		int varTam = 5;
		
		// A) INICIO	
		System.out.println("A) INICIO\n");
		
		for ( int j = 1; j <= varTam; j++) {
		
			for (int i = 1; i <= j; i++) {
					
				System.out.print((i-1) + "\t");
					
			}
				
			System.out.println("");
				
		}
			
			
		System.out.println("");
		System.out.println("");
			
		
		// B) INICIO
		System.out.println("B) INICIO\n");
		
		int cont = 1;
		
		for ( int i = 1; i <= varTam; i++ ) {
				
			for ( int j = 1; j <= (varTam); j++ ) {
				
				if ( ( cont % 2) > 0 ) {
					System.out.print("@\t");
				} else {
					System.out.print("*\t");
				}
					
				cont++;
					
			}
			
			System.out.println("");
		
		}			
	
		
		System.out.println("");
		System.out.println("");
		
		
		// C) INICIO
		System.out.println("C) INICIO\n");
		
		int varAux = (varTam / 2 );
		cont = 1;
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0 ; j < varTam; j++ ) {
				
				if ( j == varAux || i == varAux) {
					
					System.out.print("@\t");
					
				} else {
					
					if ( (i % 2) > 0 ) {
						System.out.print( j + "\t");
					} else {
						System.out.print( ( varTam - ( j + 1) ) + "\t");
					}
					
				}
			
			}
			
			System.out.println("");
		}

		
		System.out.println("");
		System.out.println("");
		
		
		// D) INICIO
		System.out.println("D) INICIO\n");
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0; j < varTam; j++ ) {
				
				if ( i == 0 ) {
					
					System.out.print(j + "\t");	
					
				} else if (  i == (varTam - 1) ) {
						
					System.out.print( ( (varTam - 1) - j) + "\t");
						
				}		
					
				else if ( j == 0 ) {
					
					System.out.print(i + "\t");
					
				} else if ( j == (varTam - 1) ) {
						
					System.out.print( (varTam - 1) - i + "\t");
					
				}
		
				else {
					
					System.out.print("*\t");
					
				}
				
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("");
		System.out.println("");
		
		
		// E) INICIO
		System.out.println("E) INICIO\n");
		
		for ( int i = 0; i < varTam; i++ ) {
			
			for ( int j = 0; j < varTam; j++ ) {
				
				if ( i != varAux && j == varAux) {
						
					System.out.print("||\t");
					
				} else if ( i == varAux && j != varAux ) {
					
					System.out.print("=\t");
					
				} else if ( i == varAux && j == varAux )	
					
					System.out.print("||\t");
				
				else {
					
					if ( i > -1 && i < ( varTam / 2) ) {
						
						if ( j > -1 && j < ( varTam / 2) )	
							
							System.out.print("#\t");
						
						
					} if ( i > -1 && i < ( varTam / 2) ) {
						
						if ( j > ( varTam / 2) && j < ( varTam ) )		
							
							System.out.print("!\t");
						
					} if ( i > ( varTam / 2) && i < ( varTam ) ) {
						
						if ( j > -1 && j < ( varTam / 2) )	
						
							System.out.print("*\t");
						
					} if ( i > ( varTam / 2) && i < ( varTam ) ) {
						
						if ( j > ( varTam / 2) && j < ( varTam ) )
						
							System.out.print("%\t");
						
					}
					
				}
				
			}
			
			System.out.println("");
			
		}
	
		
		System.out.println("");
		System.out.println("");
		
		
		// F) INICIO
		System.out.println("F) INICIO\n");
				
		int r = 0;
				
		for ( int i = 1; i <= varTam; i++) {
					
			for ( int j = 1; j <= varTam; j++) {
						
				if ( i == j ) {
							
					System.out.print((i-1) + "\t");
						
				} else if ( j == ( varTam - r ) ) {
							
					System.out.print( (varTam - i) + "\t");
							
				} 
				else {
						
					System.out.print("*\t");
				}
						
				if ( j == varTam ) {
					r++;
					System.out.println("");
				}
			}
					
		}
	}

}
 