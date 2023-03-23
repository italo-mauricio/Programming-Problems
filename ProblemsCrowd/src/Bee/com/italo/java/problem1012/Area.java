package Bee.com.italo.java.problem1012;


import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *                                      Área
 *
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 *
 *
 * ENTRADA:
 *       - O arquivo de entrada contém três valores com um dígito após o ponto decimal.
 *
 * SAIDA:
 *       - O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
 *       sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
 *       apresentado com 3 dígitos após o ponto decimal.
 *
 *
 *        EXEMPLO DE ENTRADA: 3.0 4.0 5.2                          EXEMPLO DE SAÍDA:
                                                                                     * TRIANGULO: 7.800
                                                                                     * CIRCULO: 84.949
                                                                                     * TRAPEZIO: 18.200
                                                                                     * QUADRADO: 16.000
                                                                                     * RETANGULO: 12.000
 *
 *  *     EXEMPLO DE ENTRADA: 12.7 10.4 15.2                       EXEMPLO DE SAÍDA:
                                                                                     * TRIANGULO: 96.520
                                                                                     * CIRCULO: 725.833
                                                                                     * TRAPEZIO: 175.560
                                                                                     * QUADRADO: 108.160
                                                                                     * RETANGULO: 132.080
 *
 */


public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble();
        final double pi = 3.14159;

        double triangulo = (A * C) / 2;
        double circulo = pi * C * C;
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.264s
        Tamanho: 960 Bytes
        Submissão: 23/03/2023  20:07:46
 */