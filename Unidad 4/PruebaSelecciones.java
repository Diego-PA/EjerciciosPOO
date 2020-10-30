import java.util.Scanner;

public class PruebaSelecciones{

    public static void main(String[]args){
        
        float fCalificacion;
        int eMes;
        String sDia;
        Scanner oScanner = new Scanner(System.in);

        System.out.println("Ingresa una calificación: ");
        fCalificacion = oScanner.nextFloat();

        if(fCalificacion >= 6){
            System.out.println("Estás aprobado.");
        } else {
            System.out.println("Estás reprobado.");
        }

        System.out.println("Ingresa un mes");
        eMes = oScanner.nextInt();
        
        switch(eMes){

            case 1:
            System.out.println("Enero");
            break;

            case 2:
            System.out.println("Febrero");
            break;

            case 3:
            System.out.println("Marzo");
            break;

            case 4:
            System.out.println("Abril");
            break;

            case 5:
            System.out.println("Mayo");
            break;

            case 6:
            System.out.println("Junio");
            break;

            case 7:
            System.out.println("Julio");
            break;

            case 8:
            System.out.println("Agosto");
            break;

            case 9:
            System.out.println("Septiembre");
            break;

            case 10:
            System.out.println("Octubre");
            break;

            case 11:
            System.out.println("Noviembre");
            break;

            case 12:
            System.out.println("Diciembre");
            break;

            default:
            System.out.println("No existe el mes " + eMes);
            break;

        }
        oScanner.nextLine();
        System.out.println("Ingresa un día: ");
        sDia = oScanner.nextLine();

        switch(sDia.toLowerCase()){

            case "lunes":
                System.out.println("Día 1");
            break;

            case "martes":
                System.out.println("Día 2");
            break;

            case "miércoles":
                System.out.println("Día 3");
            break;

            case "jueves":
                System.out.println("Día 4");
            break;

            case "viernes":
                System.out.println("Día 5");
            break;

            case "sábado":
                System.out.println("Día 6");
            break;

            case "domingo":
                System.out.println("Día 7");
            break;

            default:
                System.out.println("No existe el día " + sDia);
            break;
        }

    }

}