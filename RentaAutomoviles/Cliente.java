/**
 * Clase de la que se crearán los objetos referentes a los clientes de la compañía.
 * @author Puebla Aldama Diego
 */
public class Cliente {
    
    private int idCliente;
    private String nombre;

    /**
     * Constructor de la clase cliente.
     * @param id Hace referencia al identificador único de cada objeto cliente.
     * @param nombre Hace referencia al nombre completo del cliente.
     */
    public Cliente(int id, String nombre){
        this.idCliente = id;
        this.nombre = nombre;
    }

    /**
     * Método que imprime en pantalla los atributos del objeto.
     */
    public void imprimirCliente(){
        System.out.println("ID: " + idCliente + "\nNombre: " + nombre);
    }
}