public class Empleado {
    
    private String nombre;
    private double salario;
    private MiFecha fechaNacimiento;

    public Empleado(String nombre, double salario, MiFecha fechaNacimiento){
        this(nombre, salario);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado(String nombre, double salario){
        this(nombre);
        this.salario = salario;
    }

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSalario(){
        return this.salario;
    }

    public MiFecha getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setFechaNacimiento(MiFecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmpleado(){
        return "Nombre: " + nombre + " Salario: " + salario + "\nFecha de Nacimiento: " + fechaNacimiento;
    }

}
