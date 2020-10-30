public class ArregloCliente {
    
    private int ePos;
    private Cliente aClientes[];

    public ArregloCliente(int eTamanio){
        ePos = -1;
        aClientes = new Cliente[eTamanio];
    }

    public void agregarCliente(Cliente oCliente){
        if(arregloLleno()){
            System.out.println("Overflow");
        } else {
            ePos ++;
            aClientes[ePos] = oCliente;
        }
    }

    public void eliminarCliente(int eIndice){
        
        Cliente oNodo = new Cliente();

        if(arregloVacio()){
            System.out.println("Underflow");
        } else {
            aClientes[eIndice] = oNodo;
        }

    }

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

    public void consultarCliente(int eIndice){
        System.out.println(aClientes[eIndice].toString());
    }

    public void listarCliente(){
        for (Cliente cliente : aClientes) {
            System.out.println(cliente.toString());
        };
    }

    public boolean arregloLleno(){
        return ePos == aClientes.length;
    }

    public boolean arregloVacio(){
        return ePos == -1;
    }
}
