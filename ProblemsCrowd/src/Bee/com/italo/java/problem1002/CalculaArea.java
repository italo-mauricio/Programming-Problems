package Bee.com.italo.java.problem1002;

import java.util.Locale;
import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *                      Área do Círculo
 *
 *  A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
 *      - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por N.
 *
 *  ENTRADA:
 *      - A entrada contém um valor de ponto flutuante(dupla precisão), no caso, a variável raio.
 *
 *  SAIDA:
 *      - Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal
 *      Utilize variáveis de precisão dupla (double). Como todos os problemas, não esqueça de imprimir no fim de linha após o resultado,
 *      caso contrário, receberá "Presentation Error".
 *
 *
 *      EXEMPLO DE ENTRADA: 2.00                           EXEMPLO DE SAÍDA: A=12.5664
 *      EXEMPLO DE ENTRADA: 100.64                         EXEMPLO DE SAÍDA: A=31819.3103
 *
 */


// Resposta
public class CalculaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double raio = scanner.nextDouble();
        double area = 3.14159 * (raio * raio);
        System.out.println(String.format("A=%.4f", area));
    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.416s
        Tamanho: 423 Bytes
 */