package Bee.com.italo.java.problem1009;


import java.util.Locale;
import java.util.Scanner;

    /***
     * @author italo-mauricio
     *
     *                                      Salário
     *
     * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
     * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
     *
     * ENTRADA:
     *       - O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais,
     *       representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
     *
     * SAIDA:
     *       - Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
     *
     *
     *        EXEMPLO DE ENTRADA: JOÃO, 500.00, 1230.00                EXEMPLO DE SAÍDA: TOTAL = R$ 684.00
     *  *     EXEMPLO DE ENTRADA: PEDRO, 700.00, 0.00                  EXEMPLO DE SAÍDA: TOTAL = R$ 700.00
     */


    public class SalarioBonus {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            String nomeFuncionario = scan.nextLine();
            double salario = scan.nextDouble();
            double vendas = scan.nextDouble();
            double totalVendas = (vendas * 0.15);
            double total = salario + totalVendas;

            System.out.println(String.format("TOTAL = R$ %.2f" , total));
        }
    }

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.170s
        Tamanho: 613 Bytes
        Submissão: 13/03/2023  14:37:28
 */



