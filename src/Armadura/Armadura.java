/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Armadura;

/**
 *
 * @author JhonWonka
 */
public class Armadura {
    private String[] materialOP={"Ligera","Pesado","Tunica"};
    private String material;
    int defensa;
    int dureza;
    float peso;   
    
    Armadura(String Material){
    this.material="X";
    this.defensa=20;
    this.dureza=50;
    this.peso=15;
    }
    
    public Armadura(int Defensa,String Material,int Dureza,float Peso){
    this.material=Material;
    this.defensa=Defensa;
    this.dureza=Dureza;
    this.peso=Peso;
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
    
    
}
