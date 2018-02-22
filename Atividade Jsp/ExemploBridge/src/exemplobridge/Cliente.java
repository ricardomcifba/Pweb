/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobridge;

import Ferramentas.*;
import Moveis.*;
import exemplobridge.interfaces.*;

/**
 *
 * @author Michele
 */
public class Cliente {
    
    private IMovel movel;
    private IFerramenta ferramenta;
    
    public Cliente(IMovel movel ){
        this.movel = movel;
    }
    
    public static void main(String[] args) {
        
        IMovel movel = new Sofa();
        IFerramenta ferramenta = new Cara();
        
        movel.construir(ferramenta);
        
        System.out.println(movel + "\n  usando ferramenta" + ferramenta.toString());
        
        
// TODO code application logic here
        
    }
    
}
