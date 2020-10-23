/**
 * Clase principal que hace uso de la clase Cliente.java, la instancia 3 veces y muestra el resultado.
 * @author Diego Puebla Aldama.
 */
public class MainCliente {
    public static void main(String[] args) {
        //Instancias
        Cliente oCliente1 = new Cliente();
        Cliente oCliente2 = new Cliente();
        Cliente oCliente3 = new Cliente();
        
        //Inicialización
        oCliente1.setId(1);
        oCliente2.setId(2);
        oCliente3.setId(3);

        oCliente1.setNombre("Juliana Morales Ramirez");
        oCliente2.setNombre("Jorge Perez Torres");
        oCliente3.setNombre("Isaac Alonso Ruiz");

        //Resultado
        oCliente1.escribir();
        oCliente2.escribir();
        oCliente3.escribir();
    }
}