package es.iesnervion.atellez.ejerciciofragments;

/**
 * Created by atellez on 24/11/16.
 */
//Clase que crea objetos futbolista
public class futbolista {
    private int id;
    private int fotoFutbolista;
    private String nombre;
    private String equipo;
    private int nacionalidad;

    public futbolista(){

    }
    public futbolista(int id, int fotoFutbolista, String nombre, String equipo,int nacionalidad){
        this.id = id;
        this.fotoFutbolista = fotoFutbolista;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nacionalidad = nacionalidad;
    }


    public int getFotoFutbolista() {
        return fotoFutbolista;
    }

    public void setFotoFutbolista(int fotoFutbolista) {
        this.fotoFutbolista = fotoFutbolista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
