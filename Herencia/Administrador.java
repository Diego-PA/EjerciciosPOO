public class Administrador extends Empleado{
    
    private String departamento;

    public Administrador(String nombre, double salario, MiFecha fechaNacimiento){
        super(nombre, salario, fechaNacimiento);
        this.departamento = departamento;
    }

    public Administrador(String nombre, double salario){
        super(nombre, salario);
        this.departamento = departamento;
    }

    public Administrador(String nombre, String departamento){
        super(nombre);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public String getEmpleado(){
        return (super.getEmpleado() + "\nDepartamento: " + departamento);
    }

}
