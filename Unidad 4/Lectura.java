import java.util.Scanner;

public class Lectura {
    public static void main(String[] args){
        int eEntero;
        float fFlotante;
        Scanner oLector = new Scanner(System.in);
        System.out.println("Dame un entero: ");
        eEntero = oLector.nextInt();
        System.out.println("Entero = " + eEntero);
        System.out.println("Ingrese una cadena: ");
        oLector.nextLine();
        String sCadena = oLector.nextLine();
        System.out.println("Cadena: " + sCadena);
        
    }
}
