package informesPractica.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Ticket {

    //Atributos
    private int numTicket;
    private String fecha;
    private boolean estado;
    private int idMesa;
    private List<Carta> productos;

    //Constructor
    public Ticket(int numTicket, String fecha, boolean estado, int idMesa, List<Carta> lista) {
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.estado = estado;
        this.idMesa = idMesa;
        productos = new ArrayList<Carta>();
        productos.addAll(lista);
    }

    //Getters
    public int getNumTicket() {
        return numTicket;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public List<Carta> getProductos() {
        return productos;
    }

    public boolean agregarProducto(Carta producto) {
        return this.productos.add(producto);
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public void setProductos(List<Carta> productos) {
        this.productos = productos;
    }
    

    @Override
    public String toString() {
        return "Ticket: nº: " + numTicket + ", fecha = " + fecha + ", estado = " + estado + ", idMesa = " + idMesa;
    }

}
