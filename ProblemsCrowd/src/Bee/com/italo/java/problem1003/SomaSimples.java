package Bee.com.italo.java.problem1003;


import java.util.Scanner;

/***
 * @author italo-mauricio
 *
 *
 *                      Soma Simples
 *
 *
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável
 * SOMA. A seguir escrever o valor desta variável.
 *
 *
 * ENTRADA:
 *      - O arquivo de entrada contém 2 valores inteiros.
 *
 *
 * SAIDA:
 *      - Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido
 *      pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 *      caso contrário, receberá "Presentations Error".
 *
 *
 */


public class SomaSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}

/*
    Resultado:
        Linguagem: Java 14 (Open JDK 1.14.0)[+2s]
        Tempo de execução: 0.201s
        Tamanho: 374 Bytes
        Submissão: 08/03/2023  12:04:32
 */
