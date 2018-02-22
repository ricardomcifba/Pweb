
import static java.lang.Character.isLetter;
import static java.lang.Character.isLetter;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e127787
 */
public class ContarDigitos {
    private String texto;
    private int vogais;
    private int consoantes;
    private int caracter;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String Minusculo(String texto){
        texto = toLowerCase(texto);
        return texto;
    }
    
    public int getVogais(){
        this.contador();
        return vogais;      
    }
    
    public int getConsoantes(){
        this.contador();
        return consoantes;    
    }
    
    public int getCaracter(){
        this.contador();
        return caracter;
    }
        
    private void contador(){
        texto = Minusculo(texto);
        int vogais= 0;
        int consoantes = 0;
        int caracter = 0;
        for(int i = 0; i < this.getTexto().length();i++){
            if(Character.isLetter(getTexto().charAt(i))){
                if(this.getTexto().charAt(i) == 'a' || this.getTexto().charAt(i) == 'e' || this.getTexto().charAt(i) == 'i' || this.getTexto().charAt(i) == 'o' || this.getTexto().charAt(i) == 'u'){
                    vogais = vogais+1;
                }
                else{
                    consoantes = consoantes +1;
                }
            }else if(Character.isWhitespace(getTexto().charAt(i))){
                caracter = caracter+1;
                
            }
        }
    }
    
}
