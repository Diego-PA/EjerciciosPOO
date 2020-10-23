/**
 * Clase Cliente que tiene ambos setters y un método para mostrar el contenido.
 * @author Diego Puebla Aldama.
 */

public class Cliente {
    
    private int idCliente;
    private String nombre;

    public void setId(int id){
        this.idCliente = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void escribir(){
        System.out.println("ID: " + idCliente + " Nombre: " + nombre);
    }
}
