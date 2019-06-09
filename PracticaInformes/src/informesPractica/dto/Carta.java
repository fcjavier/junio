package informesPractica.dto;

/**
 *
 * @author USER
 */
public class Carta {
    
    //Atributos
    private String nomProducto;
    private int precio;
    private String categoria;

    //Constructor
    public Carta(String nomProducto, int precio, String categoria) {
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.categoria = categoria;
    }

    //Getters
    public String getNomProducto() {
        return nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Carta{" + "nomProducto=" + nomProducto + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    

}
