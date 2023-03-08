package Bee.com.italo.java.problem1007;

import java.util.Scanner;


/***
 * @author italo-mauricio
 *
 *
 *                                              Diferença
 *
 *
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * ENTRADA:
 *      - O arquivo de entrada contém 4 valores inteiros.
 *
 *
 * SAIDA:
 *      - Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 *
 *
 *     EXEMPLO DE ENTRADA: 5, 6, 7, 8                  EXEMPLO DE SAÍDA: MEDIA = -26
 *     EXEMPLO DE ENTRADA: 0, 0, 7, 8                  EXEMPLO DE SAÍDA: MEDIA = -56
 *
 *
 */

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        int numD = scan.nextInt();
        int diferenca = (numA * numB - numC * numD);

        System.out.println("DIFERENCA = " + diferenca);

    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.232s
        Tamanho: 473 Bytes
        Submissão: 08/03/2023  13:27:00
 */

