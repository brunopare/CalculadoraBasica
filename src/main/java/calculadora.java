package main.java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);

        double valorUm;
        double valorDois;
        String operacao;
        boolean resposta;

        try {
            do {
                System.out.print("Informe o valor 1: ");
                valorUm = sacanner.nextDouble();

                System.out.print("Digite a operação (+, -, *, /): ");
                operacao = sacanner.next();

                System.out.print("Informe o valor 2: ");
                valorDois = sacanner.nextDouble();

                System.out.println("Resutlado: " + realizarCalculo(valorUm, valorDois, operacao));

                resposta = verificaResposta();

            } while (resposta);

        } catch (InputMismatchException ex) {
            System.out.println("Valor fornecido inválido.");
        }

    }

    //verifica a resposta do usuário
    public static boolean verificaResposta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja realizar uma nova operação? (S/N) ");

        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

    }

    //método para fazer o cálculo
    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double resultado = 0.0;
        switch (operacao) {
            case "+":
                resultado = valorUm + valorDois;
                break;
            case "-":
                resultado = valorUm - valorDois;
                break;
            case "*":
                resultado = valorUm * valorDois;
                break;
            case "/":
                resultado = valorUm / valorDois;
                break;
            default:
                System.out.println("Informe uma operação válida! ");
        }
        return resultado;
    }
}
