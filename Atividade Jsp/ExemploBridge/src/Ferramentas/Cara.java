/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferramentas;

import exemplobridge.interfaces.IFerramenta;

/**
 *
 * @author Michele
 */
public class Cara implements IFerramenta{

    @Override
    public void usar() {        
    }
    
    public String toString(){
        return (" rápida!");
    }
    
}
