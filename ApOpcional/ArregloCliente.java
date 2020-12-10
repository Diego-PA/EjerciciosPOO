/**
 * Clase que define al objeto con el arreglo de cliebtes y es la interfaz entre AplicacionCliente y Cliente.
 * @author Diego Puebla Aldama
 * @version 2.0
 */
public class ArregloCliente {
    
    private int ePos;
    private Cliente aClientes[];

    /**
     * Método constructor que recibe el tamaño del arreglo.
     * @param eTamanio Tamaño del arreglo.
     */
    public ArregloCliente(int eTamanio){
        ePos = -1;
        aClientes = new Cliente[eTamanio];
    }

    /**
     * Método quue agrega un objeto cliente al arreglo.
     * @param oCliente Objeto cliente que ya está preparado para ser agregado.
     */
    public void agregarCliente(Cliente oCliente){
        if(arregloLleno()){
            System.out.println("Overflow");
        } else {
            ePos ++;
            aClientes[ePos] = oCliente;
        }
    }

    /**
     * Método para "eliminar" objetos cliente del arreglo.
     * @param eIndice
     */
    public void eliminarCliente(int eIndice){
        
        Cliente oNodo = new Cliente();

        if(arregloVacio()){
            System.out.println("Underflow");
        } else {
            aClientes[eIndice] = oNodo;
        }

    }

    /**
     * Método para modificar los atributos de un cliente. Se me acaba de ocurrir uno que actualice los 3 parametros juntos.
     * @param eIndice Posición del objeto a modificar.
     * @param eSeleccion Opcion que elige el usuario, 1 es nombre, 2 es rfc y 3 es domicilio.
     * @param sParametro Nuevo valor del atributo.
     */
    public void modificarCliente(int eIndice, int eSeleccion, String sParametro){
        
        switch (eSeleccion) {
            case 1: //nombre
                aClientes[eIndice].setNombre(sParametro);
                break;

            case 2: //rfc
                aClientes[eIndice].setRfc(sParametro);
                break;

            case 3: //domicilio
                aClientes[eIndice].setDomicilio(sParametro);
                break;
        
            default:
                System.out.println("Opción no valida.");
                break;
        }

    }

    /**
     * Método que realiza la consulta del cliente que se le indique.
     * @param eIndice posición del objeto en el arreglo.
     */
    public void consultarCliente(int eIndice){
        System.out.println(aClientes[eIndice].toString());
    }

    /**
     * Método que lista todo el contenido del arreglo con un for mejorado.
     */
    public void listarCliente(){
        for (Cliente cliente : aClientes) {
            System.out.println(cliente.toString());
        };
    }

    /**
     * Método que indica si el arreglo está lleno.
     * @return Si está lleno será true, si no será false.
     */
    public boolean arregloLleno(){
        return ePos == aClientes.length;
    }

    /**
     * Método que indica si el arreglo está vacío.
     * @return Si está vacío será true, sino será false.
     */
    public boolean arregloVacio(){
        return ePos == -1;
    }
}
