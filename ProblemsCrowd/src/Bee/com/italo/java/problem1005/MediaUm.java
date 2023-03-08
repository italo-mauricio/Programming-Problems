package Bee.com.italo.java.problem1005;


import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *
 *                          Média 1
 *
 *
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir,
 * calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 *
 *
 * ENTRADA:
 *      - O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 *
 *
 * SAIDA:
 *      - Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade.
 *      Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 *      caso contrário, receberá "Presentation Error".
 *
 *
 *     EXEMPLO DE ENTRADA: 5.0, 7.1                       EXEMPLO DE SAÍDA: MEDIA = 6.43182
 *     EXEMPLO DE ENTRADA: 0.0, 7.1                       EXEMPLO DE SAÍDA: MEDIA = 4.84091
 *
 *
 */
public class MediaUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double notaA = scan.nextDouble();
        double notaB = scan.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaPesos = pesoA + pesoB;
        double media = (notaA * pesoA + notaB * pesoB) / somaPesos;

        System.out.println(String.format("MEDIA = %.5f", media));

    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.264s
        Tamanho: 374 Bytes
        Submissão: 08/03/2023  12:44:37
 */
