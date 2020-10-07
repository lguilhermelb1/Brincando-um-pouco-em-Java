/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/*
 *
 * @author Luis Guilherme
 */
public class Palindromo {
    public static String maiorPalindromo(String s) {
        int direita = 0, esquerda = 0;
        String atual = "";                                  //Acumulador para comparar
        String maiorPalindromo = "";                    
        for (int i = 1; i < s.length() - 1; i++) {          //Contagem de letra por letra comparando
            esquerda = i - 1;
            direita = i + 1;
            while (esquerda >= 0 && direita < s.length()) {
                if (s.charAt(esquerda) != s.charAt(direita)) {
                    break;
                }
                atual = s.substring(esquerda, direita + 1);
                maiorPalindromo = atual.length() > maiorPalindromo.length() ? atual : maiorPalindromo;  //Compara o palindromo atual com o maior até agora, se atual for maior, passa a ser maiorPalindromo
                esquerda--;  direita++;
            }
        }
        maiorPalindromo = maiorPalindromo.length() == 0 ? "inexistente" : maiorPalindromo;  //Se maiorPalindromo não ter nenhum palindromo retornará como inexistente
        return maiorPalindromo;
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite a sequência");       //Entrada de dados
        String str = l.next();
        String maiorPalindromo = maiorPalindromo(str);
        
        if(str.length() == 1){                          //Se houver apenas uma letra ou número avisa e mostra
            System.out.println("String: " + str);
            System.out.println("Maior palíndromo possível: existe apenas um dígito, " + str);
        } else{
            System.out.println("String: " + str);
            System.out.println("Maior palíndromo possível: " + maiorPalindromo);
        }
    }
}

