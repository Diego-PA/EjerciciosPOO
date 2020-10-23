public class ObjetosFecha {
    public static void main(String[] args){
        
        MiFecha oFecha1 = new MiFecha(14,1,2019);
        MiFecha oFecha2 = new MiFecha(19,2,2020);
        MiFecha oFecha3 = new MiFecha(23,7,2018);

        MiFecha oFecha4 = oFecha3;

        oFecha1.escribir();
        oFecha2.escribir();
        oFecha3.escribir();
        oFecha4.escribir();
    }
}
