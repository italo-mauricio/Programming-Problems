package Bee.com.italo.java.problem1011;



import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *                                      Esfera
 *
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 *
 * Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 *
 * ENTRADA:
 *       - O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
 *
 * SAIDA:
 *       - A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 *
 *
 *        EXEMPLO DE ENTRADA: 3                        EXEMPLO DE SAÍDA: VOLUME = 113.097
 *  *     EXEMPLO DE ENTRADA: 15                       EXEMPLO DE SAÍDA: VOLUME = 15137.155
 *
 */



public class Esfera {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.println(String.format("VOLUME = %.3f" , volume));

    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.150s
        Tamanho: 390 Bytes
        Submissão: 23/03/2023  19:41:07
 */