public class PilaEstatica {
    
    private int eTope;
    private Nodo aPila[];

    public PilaEstatica(int eTamanio){
        eTope = -1;
        aPila = new Nodo[eTamanio];
    }

    public void push(Nodo oNodo){

        if(pilaLlena()){
            System.out.println("Overflow");

        } else {
            eTope++;
            aPila[eTope] = oNodo;
        }
    }

    public Nodo pop(){

        Nodo oNodo;

        if(pilaVacia()){
            System.out.println("Underflow");
            return null;

        } else {
            oNodo = aPila[eTope];
            eTope--;
            return oNodo;
        }
    }

    public boolean pilaVacia(){
        return eTope == -1;
    }

    public boolean pilaLlena(){
        return eTope == aPila.length -1;
    }
}
