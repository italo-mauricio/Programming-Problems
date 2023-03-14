package Bee.com.italo.java.problem1010;


import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *                                      Calculo Simples
 *
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após,
 * calcule e mostre o valor a ser pago.
 *
 * ENTRADA:
 *       - O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 *
 * SAIDA:
 *       - A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 *       O valor deverá ser apresentado com 2 casas após o ponto.
 *
 *
 *        EXEMPLO DE ENTRADA: 12 1 5.30                EXEMPLO DE SAÍDA: VALOR A PAGAR: R$ 15.50
 *  *     EXEMPLO DE ENTRADA: 16 2 5.10                EXEMPLO DE SAÍDA: VALOR A PAGAR: R$ 51.40
 */




public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double peca1 = scan.nextInt(), numPecas1 = scan.nextInt(), totalPecas1 = scan.nextDouble();
        double peca2 = scan.nextInt(), numPecas2 = scan.nextInt(), totalPecas2 = scan.nextDouble();
        double soma1 = numPecas1 * totalPecas1;
        double soma2 = numPecas2 * totalPecas2;
        double total = soma1 + soma2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f" , total));

    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.205s
        Tamanho: 711 Bytes
        Submissão: 14/03/2023  12:32:56
 */