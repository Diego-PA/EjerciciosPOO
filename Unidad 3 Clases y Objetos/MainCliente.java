public class MainCliente {
    public static void main(String[] args) {
        Cliente oCliente1 = new Cliente();
        Cliente oCliente2 = new Cliente();
        Cliente oCliente3 = new Cliente();
        
        oCliente1.setId(1);
        oCliente2.setId(2);
        oCliente3.setId(3);

        oCliente1.setNombre("Juliana Morales Ramirez");
        oCliente2.setNombre("Jorge Perez Torres");
        oCliente3.setNombre("Isaac Alonso Ruiz");

        oCliente1.escribir();
        oCliente2.escribir();
        oCliente3.escribir();
    }
}