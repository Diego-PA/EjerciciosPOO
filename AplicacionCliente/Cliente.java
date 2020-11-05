/**
 * Clase que define al objeto cliente, con métodos setters y getters.
 * @author Diego Puebla Aldama
 * @version 2.0
 */

public class Cliente {

    private String nombre;
    private String rfc;
    private String domicilio;

    /**
     * Constructor de la clase cliente.
     * @param sNombre El nombre del cliente.
     * @param sRfc El RFC del cliente.
     * @param sDomicilio El domicilio del cliente.
     */
    public Cliente(String sNombre, String sRfc, String sDomicilio){
        
        this.nombre = sNombre;
        this.rfc = sRfc;
        this.domicilio = sDomicilio;

    }

    /**
     * Constructor que inicia el objeto vacío.
     */
    public Cliente(){
        this.nombre = null;
        this.domicilio = null;
        this.rfc = null;
    }

    /**
     * Método que establece el atributo nombre.
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método que establece el atributo rfc.
     * @param rfc RFC del cliente.
     */
    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    /**
     * Método que establece el domicilio del cliente.
     * @param domicilio domicilio del cliente.
     */
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }

    /**
     * Método que permite obtener el nombre del cliente.
     * @return nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método que permite obtener el rfc del cliente.
     * @return rfc del cliente.
     */
    public String getRfc(){
        return rfc;
    }

    /**
     * Método que permite obtener el domicilio del cliente.
     * @return domicilio del cliente.
     */
    public String getDomicilio(){
        return domicilio;
    }

    /**
     * Método que permite escribir los atributos del objeto.
     */
    public String toString(){
        return ("Nombre: " + nombre + " RFC: " + rfc + " Domicilio: " + domicilio);
    }
}
