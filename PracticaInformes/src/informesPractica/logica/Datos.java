package informesPractica.logica;

import informesPractica.dto.Carta;
import informesPractica.dto.Mesas;
import informesPractica.dto.Ticket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Datos {

    //Formato para convertir después los string en date.
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    public static List<Mesas> ListaDeMesas() {
        List<Mesas> listaMesas = new ArrayList<>();
        listaMesas.add(new Mesas(1, "fila 1 columna 1", 4));
        listaMesas.add(new Mesas(2, "fila 1 columna 2", 4));
        listaMesas.add(new Mesas(3, "fila 1 columna 3", 6));
        listaMesas.add(new Mesas(4, "fila 1 columna 4", 4));
        listaMesas.add(new Mesas(5, "fila 1 columna 5", 4));
        listaMesas.add(new Mesas(6, "fila 2 columna 1", 6));
        listaMesas.add(new Mesas(7, "fila 2 columna 2", 6));
        listaMesas.add(new Mesas(8, "fila 2 columna 3", 4));
        listaMesas.add(new Mesas(9, "fila 2 columna 4", 6));
        listaMesas.add(new Mesas(10, "fila 2 columna 5", 8));
        listaMesas.add(new Mesas(11, "fila 3 columna 1", 6));
        listaMesas.add(new Mesas(12, "fila 3 columna 2", 6));
        listaMesas.add(new Mesas(13, "fila 3 columna 3", 4));
        listaMesas.add(new Mesas(14, "fila 3 columna 4", 10));
        listaMesas.add(new Mesas(15, "fila 3 columna 5", 4));
        listaMesas.add(new Mesas(16, "fila 4 columna 1", 12));
        listaMesas.add(new Mesas(17, "fila 4 columna 2", 6));
        listaMesas.add(new Mesas(18, "fila 4 columna 3", 4));
        listaMesas.add(new Mesas(19, "fila 4 columna 4", 6));
        listaMesas.add(new Mesas(20, "fila 4 columna 5", 8));
        listaMesas.add(new Mesas(21, "fila 5 columna 1", 6));
        listaMesas.add(new Mesas(22, "fila 5 columna 2", 6));
        listaMesas.add(new Mesas(23, "fila 5 columna 3", 4));
        listaMesas.add(new Mesas(24, "fila 5 columna 4", 6));
        listaMesas.add(new Mesas(25, "fila 5 columna 5", 8));
        return listaMesas;
    }

    public static List<Carta> carta() {
        List<Carta> listaProductos = new ArrayList<>();
        listaProductos.add(new Carta("Ensalada", 3, "Primer plato"));
        listaProductos.add(new Carta("Entrantes", 6, "Primer plato"));
        listaProductos.add(new Carta("Tabla de embutidos", 10, "Primer plato"));
        listaProductos.add(new Carta("Consomé", 4, "Primer plato"));
        listaProductos.add(new Carta("Pasta", 3, "Primer plato"));
        listaProductos.add(new Carta("Revuelto de setas", 3, "Primer plato"));
        listaProductos.add(new Carta("Revuelto de ajos tiernos", 3, "Primer plato"));
        listaProductos.add(new Carta("Huevos al plato", 5, "Primer plato"));
        listaProductos.add(new Carta("Flamenquines", 3, "Primer plato"));
        listaProductos.add(new Carta("Espárragos", 3, "Primer plato"));
        listaProductos.add(new Carta("Parrilla de verduras", 5, "Primer plato"));
        listaProductos.add(new Carta("Chipirones", 5, "Primer plato"));
        listaProductos.add(new Carta("Calamares a la romana", 6, "Primer plato"));
        listaProductos.add(new Carta("Rabas de calamar", 7, "Primer plato"));
        listaProductos.add(new Carta("Salpicón de marisco", 6, "Primer plato"));
        listaProductos.add(new Carta("Chuleta de cerdo", 4, "Segundo plato"));
        listaProductos.add(new Carta("Costilla de cerdo", 4, "Segundo plato"));
        listaProductos.add(new Carta("Solomillo de cerdo", 7, "Segundo plato"));
        listaProductos.add(new Carta("Chuleta de buey", 18, "Segundo plato"));
        listaProductos.add(new Carta("Filete de Ternera", 7, "Segundo plato"));
        listaProductos.add(new Carta("Solomillo de buey", 4, "Segundo plato"));
        listaProductos.add(new Carta("Chuleta de cerdo", 18, "Segundo plato"));
        listaProductos.add(new Carta("Merluza a la romana", 4, "Segundo plato"));
        listaProductos.add(new Carta("Bacalao a la riojana", 4, "Segundo plato"));
        listaProductos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        listaProductos.add(new Carta("Trucha", 3, "Segundo plato"));
        listaProductos.add(new Carta("Marmitaco de bonito", 8, "Segundo plato"));
        listaProductos.add(new Carta("Menestra de verduras", 4, "Segundo plato"));
        listaProductos.add(new Carta("Repollo relleno", 4, "Segundo plato"));
        listaProductos.add(new Carta("Escalivada", 5, "Segundo plato"));
        listaProductos.add(new Carta("Cocido madrileño", 6, "Segundo plato"));
        listaProductos.add(new Carta("Chuleta de cordero", 11, "Segundo plato"));
        listaProductos.add(new Carta("Manitas de cordero", 9, "Segundo plato"));
        listaProductos.add(new Carta("Pierna de cordero", 18, "Segundo plato"));
        listaProductos.add(new Carta("Asado de cordero", 16, "Segundo plato"));
        listaProductos.add(new Carta("Quesos variados", 5, "Postre"));
        listaProductos.add(new Carta("Tarta San Marcos", 3, "Postre"));
        listaProductos.add(new Carta("Tarta de almendra", 4, "Postre"));
        listaProductos.add(new Carta("Tarta de fresas", 3, "Postre"));
        listaProductos.add(new Carta("Tarta Helada", 3, "Postre"));
        listaProductos.add(new Carta("Tarta de limón", 3, "Postre"));
        listaProductos.add(new Carta("Helado", 2, "Postre"));
        listaProductos.add(new Carta("Flan", 2, "Postre"));
        listaProductos.add(new Carta("Natillas", 2, "Postre"));
        listaProductos.add(new Carta("Cuajada", 2, "Postre"));
        listaProductos.add(new Carta("Fruta variada", 2, "Postre"));
        listaProductos.add(new Carta("Agua", 2, "Bebidas"));
        listaProductos.add(new Carta("Agua con gas", 2, "Bebidas"));
        listaProductos.add(new Carta("Refresco", 3, "Bebidas"));
        listaProductos.add(new Carta("Cerbeza", 3, "Bebidas"));
        listaProductos.add(new Carta("Vino tinto rioja crianza", 8, "Bebidas"));
        listaProductos.add(new Carta("Vino tinto rivera del duero", 8, "Bebidas"));
        listaProductos.add(new Carta("Vino tinto castilla la mancha", 6, "Bebidas"));
        listaProductos.add(new Carta("Vino tinto de toro", 5, "Bebidas"));
        listaProductos.add(new Carta("Vino tinto de la casa", 4, "Bebidas"));
        listaProductos.add(new Carta("Vino blanco del Penedes", 6, "Bebidas"));
        listaProductos.add(new Carta("Vino blanco rioja", 6, "Bebidas"));
        listaProductos.add(new Carta("Vino blanco de rueda", 5, "Bebidas"));
        listaProductos.add(new Carta("Vino albariño", 8, "Bebidas"));
        listaProductos.add(new Carta("Vino blanco de la casa", 3, "Bebidas"));
        listaProductos.add(new Carta("Vino rosado", 4, "Bebidas"));
        listaProductos.add(new Carta("Café", 2, "Otros"));
        listaProductos.add(new Carta("Té", 2, "Otros"));
        listaProductos.add(new Carta("Infusiones", 2, "Otros"));
        listaProductos.add(new Carta("Licores", 4, "Otros"));
        listaProductos.add(new Carta("Brandy", 7, "Otros"));
        listaProductos.add(new Carta("Coñac", 7, "Otros"));
        listaProductos.add(new Carta("Anises", 5, "Otros"));
        return listaProductos;
    }

    public static List<Ticket> ticket() {      
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm");       
        List<Ticket> listaTickets = new ArrayList<>();
       
        listaTickets.add(new Ticket(1,"12/02/2019 14:20", true, 1, listaTicket1()));        
        listaTickets.add(new Ticket(2,"12/02/2019 15:30", true, 3, listaTicket2()));
        listaTickets.add(new Ticket(3,"12/02/2019 14:40", true, 5, listaTicket3()));
        listaTickets.add(new Ticket(4,"13/02/2019 14:15", false, 12, listaTicket5()));
        listaTickets.add(new Ticket(5,"13/02/2019 14:20", false, 20, listaTicket4()));
        listaTickets.add(new Ticket(6,"13/02/2019 14:40", false, 1, listaTicket6()));
        return listaTickets;
    }

    /**
     * Método que convierte una fecha con formato de cadena de texto en un Date
     *
     * @return Date con la fecha.
     */
    /*private static Date formato(String f) {
        Date fecha = null;
        try {
            fecha = formatoFecha.parse(f);
        } catch (ParseException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }
*/
     public static List<Carta> listaTicket1() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Ensalada", 3, "Primer plato"));
        productos.add(new Carta("Consomé", 4, "Primer plato"));
        productos.add(new Carta("Espárragos", 3, "Primer plato"));
        productos.add(new Carta("Bacalao a la riojana", 4, "Segundo plato"));
        productos.add(new Carta("Chuleta de cerdo", 18, "Segundo plato"));
        productos.add(new Carta("Flan", 2, "Postre"));
        productos.add(new Carta("Tarta de fresas", 3, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino tinto de la casa", 4, "Bebidas"));
        productos.add(new Carta("Café", 2, "Otros"));
        productos.add(new Carta("Licores", 4, "Otros"));
        return productos;
    }

    public static List<Carta> listaTicket2() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Ensalada", 3, "Primer plato"));
        productos.add(new Carta("Revuelto de setas", 3, "Primer plato"));
        productos.add(new Carta("Entrantes", 6, "Primer plato"));
        productos.add(new Carta("Marmitaco de bonito", 8, "Segundo plato"));
        productos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        productos.add(new Carta("Repollo relleno", 4, "Segundo plato"));
        productos.add(new Carta("Helado", 2, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino rosado", 4, "Bebidas"));
        productos.add(new Carta("Café", 2, "Otros"));
        return productos;
    }

    public static List<Carta> listaTicket3() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Flamenquines", 3, "Primer plato"));
        productos.add(new Carta("Consomé", 4, "Primer plato"));
        productos.add(new Carta("Marmitaco de bonito", 8, "Segundo plato"));
        productos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        productos.add(new Carta("Chuleta de cerdo", 18, "Segundo plato"));
        productos.add(new Carta("Helado", 2, "Postre"));
        productos.add(new Carta("Tarta de fresas", 3, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino tinto de la casa", 4, "Bebidas"));
        productos.add(new Carta("Té", 2, "Otros"));
        productos.add(new Carta("Licores", 4, "Otros"));
        return productos;
    }

    public static List<Carta> listaTicket4() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Ensalada", 3, "Primer plato"));
        productos.add(new Carta("Consomé", 4, "Primer plato"));
        productos.add(new Carta("Espárragos", 3, "Primer plato"));
        productos.add(new Carta("Repollo relleno", 4, "Segundo plato"));
        productos.add(new Carta("Chuleta de cerdo", 18, "Segundo plato"));
        productos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        productos.add(new Carta("Helado", 2, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino rosado", 4, "Bebidas"));
        productos.add(new Carta("Café", 2, "Otros"));
        productos.add(new Carta("Licores", 4, "Otros"));
        return productos;
    }

   public static List<Carta> listaTicket5() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Revuelto de setas", 3, "Primer plato"));
        productos.add(new Carta("Flamenquines", 3, "Primer plato"));
        productos.add(new Carta("Entrantes", 6, "Primer plato"));
        productos.add(new Carta("Marmitaco de bonito", 8, "Segundo plato"));
        productos.add(new Carta("Bacalao a la riojana", 4, "Segundo plato"));
        productos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        productos.add(new Carta("Flan", 2, "Postre"));
        productos.add(new Carta("Helado", 2, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino tinto de la casa", 4, "Bebidas"));
        productos.add(new Carta("Té", 2, "Otros"));
        productos.add(new Carta("Licores", 4, "Otros"));
        return productos;
    }
   public static List<Carta> listaTicket6() {
        List<Carta> productos = new ArrayList<>();
        productos.add(new Carta("Ensalada", 3, "Primer plato"));
        productos.add(new Carta("Revuelto de setas", 3, "Primer plato"));
        productos.add(new Carta("Entrantes", 6, "Primer plato"));
        productos.add(new Carta("Marmitaco de bonito", 8, "Segundo plato"));
        productos.add(new Carta("Salmón a la plancha", 6, "Segundo plato"));
        productos.add(new Carta("Repollo relleno", 4, "Segundo plato"));
        productos.add(new Carta("Helado", 2, "Postre"));
        productos.add(new Carta("Agua", 2, "Bebidas"));
        productos.add(new Carta("Vino rosado", 4, "Bebidas"));
        productos.add(new Carta("Café", 2, "Otros"));
        return productos;
    }
}
