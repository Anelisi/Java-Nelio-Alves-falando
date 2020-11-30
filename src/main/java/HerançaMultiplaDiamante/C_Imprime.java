package HerançaMultiplaDiamante;

public class C_Imprime extends Dispositvo implements Imprime {

    public C_Imprime(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc) {
        System.out.println("Processo print : " + doc);
    }
    public void imprima(String doc){
        System.out.println("Imprimindo " + doc);
    }

}
