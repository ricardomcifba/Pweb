/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moveis;

import exemplobridge.interfaces.IFerramenta;
import exemplobridge.interfaces.IMovel;

/**
 *
 * @author Michele
 */
public class Mesa implements IMovel{
    private IFerramenta ferramenta;

    public void setFerramenta(IFerramenta ferramenta) {
        this.ferramenta = ferramenta;
    }


    @Override
    public void construir(IFerramenta ferramenta) {
        ferramenta.usar();
        System.out.println("Contriur uma mesa\n");
        
    }
    
}
