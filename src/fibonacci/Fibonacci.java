/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Fibonacci {

    public static int fib(int n) {    //Método para o cálculo do Fibonacci
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        try {                                   //Se o valor for válido o código executa normalmente
            int n;
            Scanner l = new Scanner(System.in);

            System.out.println("Declare a quantidade de elementos");
            n = l.nextInt();
            int[] fb = new int[n];
            
            for (int i = 0; i < n; i++) {       //Loop com o método fib
                fb[i] = fib(i);
                System.out.print(fb[i] + " ");
            }
        } catch (Exception e) {                 //Aviso se der erro
            System.out.println("Valor inválido");
        }
    }

}
