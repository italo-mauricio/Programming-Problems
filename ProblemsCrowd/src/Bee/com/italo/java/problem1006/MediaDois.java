package Bee.com.italo.java.problem1006;


import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *
 *                                              Média 1
 *
 *
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno,
 * sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 *
 *
 * ENTRADA:
 *      - O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 *
 *
 * SAIDA:
 *      - Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
 *      não esqueça de imprimir o fim de linha após o resultado,
 *      caso contrário, receberá "Presentation Error".
 *
 *
 *     EXEMPLO DE ENTRADA: 5.0, 6.0, 7.0                  EXEMPLO DE SAÍDA: MEDIA = 6.3
 *     EXEMPLO DE ENTRADA: 5.0, 10.0, 10.0                EXEMPLO DE SAÍDA: MEDIA = 9.0
 *
 *
 */

public class MediaDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double notaA = scan.nextDouble();
        double notaB = scan.nextDouble();
        double notaC = scan.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;
        double somaPesos = pesoA + pesoB + pesoC;
        double media = (notaA * pesoA + notaB * pesoB + notaC * pesoC) / somaPesos;

        System.out.println(String.format("MEDIA = %.1f", media));
    }
}


/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.268s
        Tamanho: 706 Bytes
        Submissão: 08/03/2023  13:05:16
 */

