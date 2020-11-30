package HerançaMultiplaDiamante;

public class C_Scann extends Dispositvo implements Skanner {
    public C_Scann(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc) {
        System.out.println("Processo scaneado : " + doc);
    }

    public String skan() {
        return "Conteúdo scaneado!!!";
    }

    @Override
    public String scan() {
        return null;
    }
}
