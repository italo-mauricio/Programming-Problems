package Bee.com.italo.java.problem1004;


import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *
 *                          Produto Simples
 *
 *
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável
 * PROD. A seguir mostre a variável PROD com mensagem correspondente.
 *
 *
 * ENTRADA:
 *      - O arquivo de entrada contém 2 valores inteiros
 *
 *
 * SAIDA:
 *      - Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça
 *      de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem "Presentation Error".
 *
 *
 *     EXEMPLO DE ENTRADA: 3, 9                           EXEMPLO DE SAÍDA: PROD = 27
 *     EXEMPLO DE ENTRADA: -30, 10                        EXEMPLO DE SAÍDA: PROD = -300
 *
 *
 */


public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int PROD = num1 * num2;

        System.out.println("PROD = " + PROD);
    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.233s
        Tamanho: 374 Bytes
        Submissão: 08/03/2023   12:12:38
 */