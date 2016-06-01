/*
 editado por jeison velasco
 */
package Personajes;


public class Nerd {
    
    int inteligencia;
    int daño;
    int sabiduria;
    int velocidad;
    int vida;
    String nombre;
    
    
    public Nerd ()
    {
    this.daño = 10;
    this.inteligencia=100;
    this.nombre="lambon";
    this.sabiduria=80;
    this.velocidad=20;
    this.vida=100;
    
    }
    
    public Nerd (String Nombre, int Daño, int Inteligencia, int Sabiduria, int Velocidad, int Vida)
    {
     this.daño=Daño;
     this.inteligencia=Inteligencia;
     this.nombre=Nombre;
     this.sabiduria=Sabiduria;
     this.velocidad=Velocidad;
     this.vida=Vida;
     
     
     
    
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
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

        
        
    
}
