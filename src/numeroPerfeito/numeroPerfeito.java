/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroPerfeito;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class numeroPerfeito {
    public static void perfeito(int x, int j){
        for(int i = x/2; i > 0; i--){               //Loop para ficar dividindo o x
            if(x%i == 0){
                j = j + i;                          //A variável j acumula os divisores
            }
        }
        if(j == x){                                 //Se j for igual a x é perfeito
            System.out.println("O número " + x + " é " + "perfeito");
        } else{                                     //Senão j não é perfeito
            System.out.println("O número " + x + " não é " + "perfeito");
        }
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Escreva um número");
        int x = l.nextInt();
        int j = 0;                                  //Acumulador
        
        perfeito(x, j);
    }
    
}
