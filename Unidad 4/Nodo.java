public class Nodo {
    
    private String sNombre, sApellido;

    public Nodo(String sNombre, String sApellido){
        setNombre(sNombre);
        setApellido(sApellido);
    }

    public Nodo(){
        
    }

    public void setNombre(String sNombre){
        this.sNombre = sNombre;
    }

    public void setApellido(String sApellido){
        this.sApellido = sApellido;
    }

    public String getNombre(){
        return sNombre;
    }

    public String getApellido(){
        return sApellido;
    }

    public String toString(){
        return (sApellido + " " + sNombre);
    }
}
