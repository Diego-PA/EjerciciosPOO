public class PruebaEnvoltorio {
    public static void main(String[] args) {
        MiFecha fecha = new MiFecha(4, 3, 2008);
        Envoltorio<MiFecha> x1 = new Envoltorio<MiFecha>(fecha);
        Envoltorio<String> x2 = new Envoltorio<String>("nuevo texto");

        String s = x2.get();
        x2.set("otro texto");
        x1.set(new MiFecha(10,3,2008));
        MiFecha f = x1.get();
        System.out.println(x1.get() + " " + x2.get());
    }
}
