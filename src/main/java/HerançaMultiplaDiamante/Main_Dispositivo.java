package HerançaMultiplaDiamante;

public class Main_Dispositivo {

    public static void main(String[] args) {

        C_Imprime p = new C_Imprime("1080");
        p.processDoc("My letter");
        p.imprima("My letterrrrr");
        System.out.println("");

        C_Scann s = new C_Scann("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.skan());
        System.out.println("");

        ComboDispositivo c = new ComboDispositivo("1708");
        c.imprima("My dissertation: ");
        c.processDoc("My dissertation: ");
        System.out.println("Result set: " + c.scan());

    }
}
