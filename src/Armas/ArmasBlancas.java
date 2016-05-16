/*
 editado por jeison velasco.
 */
package Armas;

/**
 *
 * @author Sebastian
 */
public class ArmasBlancas {
      int alcance;
    int longitud;
    int daño;
    int velocidadataque;
    String nombre;
    
    
 public ArmasBlancas()
 {
     this.alcance=3;
     this.longitud=6;
     this.daño=5;
     this.velocidadataque=3;
     this. nombre="pate cabra";
 }
 public ArmasBlancas(int Alcance, int Longitud, int Daño, int Velocidadataque, String Nombre)
 {
     this.alcance=Alcance;
     this.longitud=Longitud;
     this.daño=Daño;
     this.velocidadataque=Velocidadataque;
     
 }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVelocidadataque() {
        return velocidadataque;
    }

    public void setVelocidadataque(int velocidadataque) {
        this.velocidadataque = velocidadataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
 
     
};
