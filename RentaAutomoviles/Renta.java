/**
 * Esta es la clase principal y en ella se manejan las rentas de automoviles hechas por clientes.
 * @author Puebla Aldama Diego
 */
public class Renta {

    private int maxKilometros;
    private int kilometrosActuales = 0;

    /**
     * Constructor de la clase renta, notese que kilometrosActuales inicia en 0 por defecto.
     * @param maxKM Hace referencia a los kilometros máximos que se establecen en el contrato.
     */
    public Renta(int maxKM){
        this.maxKilometros = maxKM;
    }

    /**
     * Método que imprime en pantalla los atributos del objeto.
     */
    public void imprimirRenta(){
        System.out.println("Max KM: " + maxKilometros + "\nKM Actuales: " + kilometrosActuales);
    }

    /**
     * Método principal o main.
     */
    public static void main(String[]args){

        //Creación de objetos.
        Cliente cliente1 = new Cliente(1, "Diego Puebla Aldama");
        Automovil auto1 = new Automovil(1, "Toyota", "G3");
        Renta renta1 = new Renta(18000);

        //Inicio del reporte de renta.
        System.out.println("Reporte de Renta:\nRenta 1:");
        cliente1.imprimirCliente();
        auto1.imprimirAuto();
        renta1.imprimirRenta();
    }

}