/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informesPractica.dto;

/**
 *
 * @author USER
 */
public class Producto {

    private String nomProducto;
    private int precio;
    private String categoria;

    public Producto(String nomProducto, int precio, String categoria) {
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "nomProducto=" + nomProducto + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    
}
