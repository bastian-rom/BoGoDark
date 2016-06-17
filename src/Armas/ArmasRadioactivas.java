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
    int damage;
    int municion;
    int cantidadataque;
    String nombre;
    boolean equipado;
    
    public ArmasRadioactivas ()
    {
        this.alcance=10;
        this.velocidad=8;
        this.damage=20;
        this.municion=15;
        this.cantidadataque=20;
        this.equipado=false;
        
        
    }
    
    public ArmasRadioactivas(int Alcance, int Velocidad, int Damage, int Municion, int Cantidadataque, String Nombre, boolean Equipado )
    {
        this.alcance=Alcance;
        this.velocidad=Velocidad;
        this.damage=Damage;
        this.municion=Municion;
        this.cantidadataque=Cantidadataque;
        this.equipado=Equipado;
        
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getCantidadataque() {
        return cantidadataque;
    }

    public void setCantidadataque(int cantidadataque) {
        this.cantidadataque = cantidadataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEquipado() {
        return equipado;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }
    
    
    
    
    
    
    
    
    
}

