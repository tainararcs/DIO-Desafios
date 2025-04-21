package application;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

	        Scanner terminal = new Scanner(System.in);
			
	        System.out.print("\nDigite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
	
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
	
	        System.out.println();
			
		try {
			// Chama o método contendo a lógica de contagem.
			contar(parametroUm, parametroDois);
		}
	        catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Valida se parametroUm é MAIOR que parametroDois e lança a exceção, em caso positivo.
        	if (parametroUm >= parametroDois) {
            		throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro\n");
        	}
		
		int contagem = parametroDois - parametroUm;

        	// Realiza o for para imprimir os números com base na variável contagem.
	        for (int i = 1; i <= contagem; i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
        	System.out.println();
	}
}
