package informesPractica.dto;

/**
 *
 * @author USER
 */
public class Mesas {

    //Atributos
    private int id;
    private String localizacion;
    private int capacidad;

    //Constructor
    public Mesas(int id, String localizacion, int capacidad) {
        this.id = id;
        this.localizacion = localizacion;
        this.capacidad = capacidad;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    

    @Override
    public String toString() {
        return "Mesas: id = " + id + ", localizacion = " + localizacion + ", capacidad = " + capacidad;
    }

}
