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
     * Método quue agrega un objeto cliente al arreglo de forma ordenada.
     * @param oCliente Objeto cliente que ya está preparado para ser agregado.
     */
    
    public void agregarCliente(Cliente oCliente){

        int ePosicion = 0;

        if (arregloLleno()){

            System.out.println("\nNo se pudo agregar al cliente. Overflow\n");

        } else {

            while (ePosicion <= ePos && oCliente.getNombre().compareTo(aClientes[ePosicion].getNombre()) != 0){

                ePosicion++;

            }

            if (ePosicion > ePos){

                ePosicion = ePos;

                while (ePosicion >= 0 && oCliente.getNombre().compareTo(aClientes[ePosicion].getNombre()) < 0){

                    aClientes[ePosicion + 1] = aClientes[ePosicion];
                    ePosicion--;

                }

                aClientes[ePosicion + 1] = oCliente; //ePosicion + 1 si no funciona
                ePos++;

            }

        }

    }

    /**
     * Método para "eliminar" objetos cliente del arreglo.
     * @param eIndice
     */
    public void eliminarCliente(String sNombre){
        
        int ePosicion = 0;

        //Buscar el nombre
        if (arregloVacio()) {
            
            System.out.println("Underflow");
        
        } else {

            while (aClientes[ePosicion].getNombre().compareTo(sNombre) != 0) {
                ePosicion++;
            }

            //Eliminar el contenido
            aClientes[ePosicion].setNombre(null);
            aClientes[ePosicion].setRfc(null);
            aClientes[ePosicion].setDomicilio(null);

            //Si necesita recorrer
            if (ePosicion < ePos) {
                
                Cliente oTemporal = aClientes[ePosicion];

                //Recorrer
                for (int i = ePosicion; i < ePos - 1; i++) {
                    aClientes[ePosicion] = aClientes[ePosicion + 1];
                }

                aClientes[ePosicion + 1] = oTemporal;
            }

        }

    }

    /**
     * Método para modificar los atributos de un cliente.
     * @param sNombre Nombre del cliente a modificar.
     * @param eSeleccion Opcion que elige el usuario, 1 es nombre, 2 es rfc y 3 es domicilio.
     * @param sParametro Nuevo valor del atributo.
     */
    public void modificarCliente(String sNombre, int eSeleccion, String sParametro){
        
        int ePosicion = 0;

        //Buscar el nombre
        if (!arregloVacio()) {
            
            while (aClientes[ePosicion].getNombre().compareTo(sNombre) != 0) {
                ePosicion++;
            }
    
            switch (eSeleccion) {
                case 1: //nombre
                    aClientes[ePosicion].setNombre(sParametro);
                    //ordenar
                    if (ePosicion >= 0 && aClientes[ePosicion - 1].getNombre().compareTo(aClientes[ePosicion].getNombre()) > 0) {
                        Cliente oTemporal = new Cliente();
                        while (ePosicion -1 >= 0) {
    
                            if (aClientes[ePosicion - 1].getNombre().compareTo(aClientes[ePosicion].getNombre()) > 0) {
                                oTemporal = aClientes[ePosicion - 1];
                                aClientes[ePosicion - 1] = aClientes[ePosicion];
                                aClientes[ePosicion] = oTemporal;
                                ePosicion--; 
                            }      
    
                        }
                    } else if (ePosicion <= ePos && aClientes[ePosicion + 1].getNombre().compareTo(aClientes[ePosicion].getNombre()) < 0) {
                        Cliente oTemporal = new Cliente();
                        while (ePosicion + 1 < aClientes.length) {
    
                            if (aClientes[ePosicion + 1].getNombre().compareTo(aClientes[ePosicion].getNombre()) < 0) {
                                oTemporal = aClientes[ePosicion + 1];
                                aClientes[ePosicion + 1] = aClientes[ePosicion];
                                aClientes[ePosicion] = oTemporal;
                                ePosicion++;
                            }
                        }
                    }
                    break;
    
                case 2: //rfc
                    aClientes[ePosicion].setRfc(sParametro);
                    break;
    
                case 3: //domicilio
                    aClientes[ePosicion].setDomicilio(sParametro);
                    break;
            
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } else {
            System.out.println("No tienes clientes.");
        }
        
    }

    /**
     * Método que realiza la consulta del cliente que se le indique.
     * @param eIndice posición del objeto en el arreglo.
     */

    public String consultarCliente(String sNombre){
        
        String sCliente = "";
        int ePosicion = 0;
 
         if (!arregloVacio()){
 
            while (aClientes[ePosicion].getNombre().compareTo(sNombre) != 0) {
                ePosicion++;
            }
 
            if (aClientes[ePosicion].getNombre().compareTo(sNombre) == 0){
 
                sCliente += "\nRFC: " + aClientes[ePosicion].getRfc() + " Nombre: " + aClientes[ePosicion].getNombre() + 
                " Domicilio: " + aClientes[ePosicion].getDomicilio();
 
            }
         }
         return sCliente;
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