/**
 * Clase MiFecha está para crear objetos fecha.
 *
 * @author Martínez Vázquez, Misael
 * @version 1.0
 */
public class MiFecha
{   /**
    *Atributo que almacena el día de la fecha.
    */
    private int eDia = 6;
    /**
    *Atributo que almacena el mes de la fecha.
    */
    private int eMes;
    /**
    *Atributo que almacena el año de la fecha.
    */
    private int eAnio;
    /**
     * Constructor que recibe día, mes y año.
     * @param eDia, día de la fecha.
     * @param eMes, mes de la fecha.
     * @para  eAnio, año de la fecha.
     */
    public MiFecha(int eDia, int eMes, int eAnio){
        this.eDia = eDia;
        this.eMes = eMes;
        this.eAnio = eAnio;
    }
    /**
     * Constructor que recibe una fecha tipo MiFecha.
     * @param oFecha, un objeto fecha tipo MiFecha.
     */
    public MiFecha(MiFecha oFecha){
        this.eDia = oFecha.getDia();
        this.eMes = oFecha.getMes();
        this.eAnio = oFecha.getAnio();
    }
    /**
     * Método que devuelve el día de la fecha.
     * @return día de la fecha.
     */
    public int getDia(){
        return this.eDia;
    }
    /**
     * Método que devuelve el mes de la fecha.
     * @return mes de la fecha.
     */
    public int getMes(){
        return this.eMes;
    }
    /**
     * Método que devuelve el año de la fecha.
     * @return año de la fecha.
     */
    public int getAnio(){
        return this.eAnio;
    }
    /**
     * Método que modifica el valor día de la fecha.
     * @param eDia, nuevo día para la fehca.
     */
    public void setDia(int eDia){
        this.eDia = eDia;
    }
    /**
     * Método que modifica el valor mes de la fecha.
     * @param eMes, nuevo mes para la fecha.
     */
    public void setMes(int eMes){
        this.eMes = eMes;
    }
    /**
     * Método que modifica el valor año de la fecha.
     * @param eAño, nuevo año para la fecha.
     */
    public void setAnio(int eAnio){
        this.eAnio = eAnio;
    }
    /**
     * Método que agrega dóas a la fecha actual y regresa una nueva fecha con los días incrementados.
     * @params eMasDias, indica cuantos días se van a agregar.
     * @return oNuevaFecha, nueva fecha con los días incrementados.
     */
    public MiFecha agregarDias(int eMasDias){
        MiFecha oNuevaFecha = new MiFecha(this);
        oNuevaFecha.setDia(oNuevaFecha.getDia() + eMasDias);
        return oNuevaFecha;
    }
    /**
     * Método que se utiliza para mostrar una fecha en formato dia/mes/año.
     */
    public void escribir(){
        System.out.println(eDia + "/" + eMes + "/" + eAnio);
    }

    
}
