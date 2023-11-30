package com.tecnicas;

import java.util.Scanner;

public class Questoes {
	
	// Questao 01
	public static void QuestaoUm() {
		System.out.println();
		System.out.println("Questao 01 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10) {
			System.out.println("A > 10");
		}
		if ((A + B ) == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
	}
	
	// Questao 02
	public static void QuestaoDois() {
		System.out.println();
		System.out.println("Questao 02 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A < 10) {
			System.out.println("A < 10");
		}
		else {
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}
	}
	
	// Questao 03
	public static void QuestaoTres() {
		System.out.println();
		System.out.println("Questao 03 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A == 10) {
			System.out.println("A == 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		}
		if (B == 10) {
			System.out.println("B == 10");
		}	
	}
	
	// Questao 04
	public static void QuestaoQuatro() {
		System.out.println();
		System.out.println("Questao 04 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		} else {
			if (A == B) {
				System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
			} else {
				System.out.println("número não válido");
			}
		}
	}

	// Questao 05
	public static void QuestaoCinco() {
		System.out.println();
		System.out.println("Questao 05 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		} else {
			System.out.println("número não válido");
		}
	}
	
	// Questao 06
	public static void QuestaoSeis() {
		System.out.println();
		System.out.println("Questao 06 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
	}

	// Questao 07
	public static void QuestaoSete() {
		System.out.println();
		System.out.println("Questao 07 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 && (A + B) == 20) {
			System.out.println("número válidos");
		} else {
			if (!(A > 10)){
				System.out.println("número não válido");
			}
		}
	}

	// Questao 08
	public static void QuestaoOito() {
		System.out.println();
		System.out.println("Questao 08 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10) {
			System.out.println("A > 10");
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}
		
	}
	
	// Questão 09
	public static void QuestaoNove() {
		System.out.println();
		System.out.println("Questao 09 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 && (A + B) == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
	}
	
	// Questao 10
	public static void QuestaoDez() {
		System.out.println();
		System.out.println("Questao 10 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (!(A > 10)) {
			System.out.println("número menor que 10");
		}
		if (!((A + B) == 20)) {
			System.out.println("número diferente de 20");
		}
	}

	// Questao 11
	public static void QuestaoOnze() {
		System.out.println();
		System.out.println("Questao 11 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (!(A > 10)) {
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}		
	}

	// Questao 12
	public static void QuestaoDoze() {
		System.out.println();
		System.out.println("Questao 12 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10);
			System.out.println("A > 10");
		if ((A + B) == 20);
			System.out.println("A + B == 20");
		if(!(A > 10) && !((A + B) == 20));
			System.out.println("números não válidos");
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}

	// Questao 13
	public static void QuestaoTreze() {
		System.out.println();
		System.out.println("Questao 13 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();

		if (A > 10) {
			System.out.println("A > 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		}
		if (!(A > 10) && !((A + B) == 20)) {
			System.out.println("números não válidos");
		}
	}
	
	// Questão 14
	public static void QuestaoQuatorze() {
		System.out.println();
		System.out.println("Questao 14 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10) {
			System.out.println("A > 10");
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}
		
	}
	
	// Questao 15
	public static void QuestaoQuinze() {
		System.out.println();
		System.out.println("Questao 15 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A < 10) {
			System.out.println("A < 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		}
		if (!(A < 10) && !((A + B) == 20)) {
			System.out.println("número não válido");
		}
	}
	
	// Questao 16
	public static void QuestaoDezesseis() {
		System.out.println();
		System.out.println("Questao 16 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A == 10) {
			System.out.println("A == 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		}
		if (B == 10) {
			System.out.println("B == 10");
		}
	}
	
	// Questao 17
	public static void QuestaoDezessete() {
		System.out.println();
		System.out.println("Questao 17 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		} else {
			if (A == B);
				System.out.println("A é igual a B");
			if (((A != 10) && (B != 10)) && A < 10);
				System.out.println("A é menor que 10");
			if (!(A == B) && !( ((A != 10) && (B != 10)) && A < 10 ));
				System.out.println("número não válido");
		}
	}
	
	// Questao 18
	public static void QuestaoDezoito() {
		System.out.println();
		System.out.println("Questao 18 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 || (A + B) == 20) {
			System.out.println("número válido");
		} else {
			System.out.println("número não válido");
		}
	}
	
	// Questao 19
	public static void QuestaoDezenove() {
		System.out.println();
		System.out.println("Questao 19 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
		
	}

	// Questao 20
	public static void QuestaoVinte() {
		System.out.println();
		System.out.println("Questao 20 ---------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A > 10 || (A + B) == 20 ) {
			System.out.println("números válidos");
		} else {
			System.out.println("números não válidos");
		}
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}
	
}
