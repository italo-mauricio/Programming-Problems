package Bee.com.italo.java.problem1008;


import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *                                      Salário
 *
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 *
 * ENTRADA:
 *       - O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
 *       representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
 *
 * SAIDA:
 *       - Imprima o número e o salário do funcionário, conforme exemplo fornecido,
 *       com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 *
 */


public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        int numFuncionario = scan.nextInt();
        int numHoras = scan.nextInt();
        double salario = scan.nextDouble();

        System.out.println("NUMBER = " + numFuncionario);
        System.out.println(String.format("SALARY = U$ %.2f" , (numHoras * salario)));
    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.163s
        Tamanho: 566 Bytes
        Submissão: 08/03/2023  21:24:15
 */

