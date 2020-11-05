import java.util.Scanner;

public class PruebaCM {

    public static void main(String[] args) {
        
        CalculadoraMultiple oCalculadora = new CalculadoraMultiple();
        char cOperador;
        Scanner oScanner = new Scanner(System.in);

        System.out.println("Programa que implementa una calculadora con múltiples operaciones.");
        System.out.println("Intrucciones:\nIngresa un número y presiona enter, a continuación\ningresa uno de los siguientes operadores [+ - * /] y presiona enter\ningresa el operador = y da enter para finalizar.");

        System.out.println("Ingresa un número: ");
        oCalculadora.setResultado(oScanner.nextFloat());

        do {

            System.out.println("Ingresa un operador: ");
            cOperador = oScanner.next().charAt(0); //Lee un sólo caracter.

            switch (cOperador) {
                case '+':
                    System.out.println("Ingresa un número: ");
                    oCalculadora.setNumero(oScanner.nextFloat());
                    oCalculadora.setResultado(oCalculadora.getResultado() + oCalculadora.getNumero());
                    break;

                case '-':
                    System.out.println("Ingresa un número: ");
                    oCalculadora.setNumero(oScanner.nextFloat());
                    oCalculadora.setResultado(oCalculadora.getResultado() - oCalculadora.getNumero());
                    break;

                case '*':
                    System.out.println("Ingresa un número: ");
                    oCalculadora.setNumero(oScanner.nextFloat());
                    oCalculadora.setResultado(oCalculadora.getResultado() + oCalculadora.getNumero());
                    break;

                case '/':
                    System.out.println("Ingresa un número: ");
                    oCalculadora.setNumero(oScanner.nextFloat());
                    if (oCalculadora.getNumero() != 0) {
                        oCalculadora.setResultado(oCalculadora.getResultado() + oCalculadora.getNumero());    
                    } else {
                        System.out.println("Error, división entre cero.");
                    }
                    break;

                case '=':
                    System.out.println("El resultado es: " + oCalculadora.getResultado());
                    break;
            
                default:
                    System.out.println("Error, operador no válido.");
                    break;
            }
        } while (cOperador != '=');
    }

}
