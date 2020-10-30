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

    public void modificarCliente(){

    }

    public void consultarCliente(int eIndice){
        System.out.println(aClientes[eIndice].toString());
    }

    public boolean arregloLleno(){
        return ePos == aClientes.length;
    }

    public boolean arregloVacio(){
        return ePos == -1;
    }
}
