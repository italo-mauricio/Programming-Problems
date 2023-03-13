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
     */


    public class SalarioBonus {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            String nomeFuncionario = scan.nextLine();
            double salario = scan.nextDouble();
            double vendas = scan.nextDouble();

            System.out.println("TOTAL = " + " R$ " +);
        }
    }

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.163s
        Tamanho: 566 Bytes
        Submissão: 08/03/2023  21:24:15
 */


}
