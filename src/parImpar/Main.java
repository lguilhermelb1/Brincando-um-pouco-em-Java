/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parImpar;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        // Vetores
        int entrada[] = new int[20];
        int par[] = new int[20];
        int impar[] = new int[20];
        int saida[] = new int[20];

        // Ler os 20 números
        for(int j = 0; j < 20; j++) {
            System.out.println("Digite o número da posição " + j + ": ");
            entrada[j] = l.nextInt();
        }

        // Separar impares e pares
        for(int i = 0; i < entrada.length; i++) {
            if (entrada[i] % 2 != 0) {
            impar[i] = entrada[i];
        } else {
            par[i] = entrada[i];
        }

        saida[i] = entrada[i];
    }
        
        // Mostrar pares
        Arrays.sort(par);
        System.out.println("Pares: ");
        for(int s = 0; s < par.length; s++) {
            if (par[s] != 0) {
                System.out.println(par[s]);
            }
        }
        
        // AQUI ORDENO EM ORDEM CRESCENTE O VETOR DE NUMEROS IMPARES
        Arrays.sort(impar);
        System.out.println("Impares: ");
        for(int s = 0; s < impar.length; s++) {
            if (impar[s] != 0) {
                System.out.println(impar[s]);
            }
        }
        
        Arrays.sort(saida);
        System.out.println("Saída juntos: ");
        for (int s = 0; s < saida.length; s++) {
            if (saida[s] != 0) {
                System.out.println(saida[s]);
            }
        }
    }
}
