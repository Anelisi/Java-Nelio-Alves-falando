package HerançaMultiplaDiamante;

public class ComboDispositivo extends Dispositvo implements Skanner, Imprime{
    public ComboDispositivo(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);

    }

    @Override
    public void imprima(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo Scaneado!!! ";
    }
}
