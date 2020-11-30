package HerançaMultiplaDiamante;

public abstract class Dispositvo {
    public String serialNumber;

    public Dispositvo(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void processDoc(String doc);
}
