/*
editado por jeiso velasco.
 */
package Armas;

/**
 *
 * @author Sebastian
 */
public class ArmasRadioactivas {
    int alcance;
    int velocidad;
    int daño;
    int municion;
    int cantidadataque;
    String nombre;
    boolean equipado;
    
    public ArmasRadioactivas ()
    {
        this.alcance=10;
        this.velocidad=8;
        this.daño=20;
        this.municion=15;
        this.cantidadataque=20;
        this.equipado=false;
        
        
    }
    
    public ArmasRadioactivas(int Alcance, int Velocidad, int Daño, int Municion, int Cantidadataque, String Nombre, boolean Equipado )
    {
        this.alcance=Alcance;
        this.velocidad=Velocidad;
        this.daño=Daño;
        this.municion=Municion;
        this.cantidadataque=Cantidadataque;
        this.equipado=Equipado;
        
    }
    
    
    
    
    
    
    
    
    
}
