/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author Michele
 */
public class JavaApplication5 {

    public static void main(String[] args) {
        byte[] vet = {1, 6, 3, 9, 2, 5, 4, 7, 8 };
        for (int i = 0; i < vet.length; i++) {
            for (int j = i; j < vet.length; j++) {
                if (vet[i] % 2 == 1) {
                    byte aux = vet[i];
                    for (int z = i+1; z < vet.length; z++) {
                        vet[z-1] = vet[z];
                    }                    
                    vet[vet.length-1] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        
        

    }

}
