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
public class ArmaduraCabeza {
    String material;
    int defensa;
    int dureza;
    float peso;
    int autoridad;
    
    ArmaduraCabeza()
    {
        this.material= "No Definido";
        this.defensa = 0;
        this.dureza = 0;
        this.peso = 0;
        this.autoridad = 0;
    }
    public ArmaduraCabeza(String material,int Defensa,float Peso,int Autoridad){
        this.material = material;   
        this.defensa = Defensa;
        this.dureza = 100;
        this.peso = Peso;
        this.autoridad = Autoridad;
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

    public int getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(int autoridad) {
        this.autoridad = autoridad;
    }
    
    
}
