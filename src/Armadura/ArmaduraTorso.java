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
public class ArmaduraTorso {
    String nombre;
    String material;
    int defensa;
    int dureza;
    float peso; 
    int damage;

ArmaduraTorso () {
    this.nombre="desconocido";
    this.material="Platino";
    this.defensa=100;
    this.dureza=50;
    this.peso=25;
    this.damage=5;
}
 public ArmaduraTorso(int Defensa,String Material,int Dureza,float Peso,int Damage){
    this.material=Material;
    this.defensa=Defensa;
    this.dureza=Dureza;
    this.peso=Peso;
    this.damage=Damage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }}
