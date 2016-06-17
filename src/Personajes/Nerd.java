/*
 editado por jeison velasco
 */
package Personajes;


public class Nerd {
    
    int inteligencia;
    int damage;
    int sabiduria;
    int velocidad;
    int vida;
    String nombre;
    int defensa;
    
    
    public Nerd (String Nombre)
    {
    this.damage = 10;
    this.inteligencia=100;
    this.nombre="lambon";
    this.sabiduria=80;
    this.velocidad=20;
    this.vida=100;
    
    }
    
    public Nerd (String Nombre, int Damage, int Inteligencia, int Sabiduria, int Velocidad, int Vida,int Defensa)
    {
     this.damage=Damage;
     this.inteligencia=Inteligencia;
     this.nombre=Nombre;
     this.sabiduria=Sabiduria;
     this.velocidad=Velocidad;
     this.vida=Vida;
     this.defensa=Defensa;
     
     
     
    
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}

   

    
