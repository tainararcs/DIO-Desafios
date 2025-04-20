package application;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = criaContaTerminal();
        System.out.println("\n" + contaTerminal + "\n");
    }

    public static ContaTerminal criaContaTerminal() {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nPor favor, digite o número da Agência: ");
        numero = scan.nextInt();

        System.out.print("Nome da Agência: ");
        agencia = scan.next();

        scan.nextLine(); // Consumir a quebra de linha pendente após o next()

        System.out.print("Seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Saldo: ");
        saldo = scan.nextDouble();
        
        scan.close();

        return new ContaTerminal(numero, agencia, nomeCliente, saldo);
    }
}
