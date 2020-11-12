/**
 * @author Puebla Aldama Diego
 * Esta es la clase de la que se generan los objetos automovil.
 * Necesaria para las rentas de la compañía.
 */

public class Automovil {
    
    private int idAutomovil;
    private String marca;
    private String modelo;

    public Automovil(){
        
    }

    /**
     * Constructor de la clase automovil.
     * @param id Se refiere al identificador único del automovil.
     * @param marca Se refiere a la marca del automovil.
     * @param modelo Se refiere al modelo del automovil.
     */

    public Automovil(int id, String marca, String modelo){
        this.idAutomovil = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método que imprime en pantalla los atributos del auto.
     */
    public void imprimirAuto(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}