/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armadura;

/**
 *
 * @author Sebastian
 */
public class ArmaduraPiernas {
    String material;
    int defensa;
    int dureza;
    float peso;
    
    public ArmaduraPiernas()
            
    {        
        this.nombre=desconocido
        this.material="Platino";
        this.defensa=20;
        this.dureza=50;
        this.peso=10;
    }
    public ArmaduraManos(int Defensa,String Material,int Dureza,float Peso,int Daño)
    {
        this.material=Material;
        this.defensa=Defensa;
        this.dureza=Dureza;
        this.peso=Peso;
        this.daño=Daño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
