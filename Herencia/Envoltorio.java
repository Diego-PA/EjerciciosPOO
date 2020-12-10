public class Envoltorio<Tipo> {
    
    private Tipo valor;
    
    public Envoltorio(Tipo parametro) {
        valor = parametro;
    }

    public Tipo get() {
        return valor;
    }

    public void set(Tipo parametro) {
        valor = parametro;
    }

}
