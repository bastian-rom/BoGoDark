/*

 */
package Armas;

/* @author Javier117   */
public class ArmasFuego {
    int alcance;
    String nombre;
    int municion;
    int cargador;
    int daño;
    int perforacion;
    boolean equipado;
    int vel_disparo;
    
    public ArmasFuego ()
    {
        this.alcance=0;
        this.cargador=0;
        this.daño=0;
        this.equipado=false;
        this.municion=0;
        this.nombre="Arma a distancia";
    }
    public ArmasFuego(int Alcance,String Nombre,int Municion,int Cargador,int Daño,int Perforacion,
            boolean Equipado,int Vel_disparo)
    {
        this.alcance=Alcance;
        this.cargador=Cargador;
        this.daño=Daño;
        this.equipado=Equipado;
        this.municion=Municion;
        this.nombre=Nombre;
        this.perforacion=Perforacion;
        this.vel_disparo=Vel_disparo;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getCargador() {
        return cargador;
    }

    public void setCargador(int cargador) {
        this.cargador = cargador;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPerforacion() {
        return perforacion;
    }

    public void setPerforacion(int perforacion) {
        this.perforacion = perforacion;
    }

    public boolean isEquipado() {
        return equipado;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }

    public int getVel_disparo() {
        return vel_disparo;
    }

    public void setVel_disparo(int vel_disparo) {
        this.vel_disparo = vel_disparo;
    }
            
}
