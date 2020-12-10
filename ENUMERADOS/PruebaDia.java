public class PruebaDia {
    Dia eDia;
    public PruebaDia (Dia eDia) {this.eDia = eDia;}
    public void describeDia(){
        switch (eDia){
            case LUNES: System.out.println("Los lunes ni las gallinas ponen.");
                        break;
            case MARTES: System.out.println("Martes.");
                        break;

            case MIERCOLES: System.out.println("Miercoles");
                         break;

            case JUEVES: System.out.println("Jueves");
                        break;

            case VIERNES: System.out.println("Viernes");
                         break;

            case SABADO: System.out.println("Sabado");
                        break;

            case DOMINGO: System.out.println("Domingo");
                        break;
            default: System.out.println("F");
                        break;
        }
    }

    public static void main(String[] args) {
        PruebaDia oPrimerDia = new PruebaDia(Dia.LUNES);
        oPrimerDia.describeDia();
        PruebaDia oTercerDia = new PruebaDia(Dia.MIERCOLES);
        oPrimerDia.describeDia();
        PruebaDia oQuintoDia = new PruebaDia(Dia.VIERNES);
        oPrimerDia.describeDia();
        PruebaDia oSextoDia = new PruebaDia(Dia.SABADO);
        oPrimerDia.describeDia();
        PruebaDia oSeptimoDia = new PruebaDia(Dia.DOMINGO);
        oPrimerDia.describeDia();
    }

}