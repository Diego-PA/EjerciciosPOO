/**
 * Clase principal que hace uso de la clase Cliente.java, la instancia 3 veces y muestra el resultado.
 * @author Diego Puebla Aldama.
 */
public class MainCliente {
    public static void main(String[] args) {

        Cliente aClientes[] = new Cliente[3];

        aClientes[0] = new Cliente();
        aClientes[1] = new Cliente();
        aClientes[2] = new Cliente();

        //Inicialización
        aClientes[0].setId(1);
        aClientes[1].setId(1);
        aClientes[2].setId(1);

        aClientes[0].setNombre("Juliana Morales Ramirez");
        aClientes[1].setNombre("Jorge Perez Torres");
        aClientes[2].setNombre("Isaac Alonso Ruiz");

        //Resultado
        aClientes[0].escribir();
        aClientes[1].escribir();
        aClientes[2].escribir();
    }
}