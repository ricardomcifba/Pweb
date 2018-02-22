/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Aluno
 */
public class Forca {
    
    String  filme [] = {"gosth", "casablanca", "dracula",  "shrek"};
    String carro[] = {"parati", "voyage", "santana", "kombi"};
    String novela [] = {"tieta", "carrossel", "gabriela", "saramandaia"};
    int tam = 0;
    int tentativas = 3;    
    int escolha = 1;
    char descubra[];
    
    
    public void escolheTema(){
        if(escolha==1){
            String palavra = filme[(int) (Math.random() * filme.length)];
            tam = palavra.length(); 
        }
        else if(escolha ==2){
            String palavra = carro[(int) (Math.random() * carro.length)];
            tam = palavra.length(); 
        }
        else{
            String palavra = novela[(int) (Math.random() * novela.length)];
            tam = palavra.length();
        }
    }
    
    public void jogandoForca(){
        while(tentativas != 0){
            
        }
    }
    /*
    System.out.println("Dica:\n");
    System.out.println("A palavra escolhida tem tamanho " + tam);
    */
}
