/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

import bogodark.Dados;

/**
 *
 * @author usuario
 */
public class Pistola extends Arma{
    
    public Pistola(String Nombre) {
        super(Nombre);
        setV_carga(Dados.Dado(2));
        setCadencia(1);
        setDamage(getDamage()+1);
    }
    
    
    
    
}
