package casa_do_estudante;

public class Casa_do_estudante {

    double valor;
    int nQuarto;

    public Casa_do_estudante(double valor, int nQuarto) {
        this.valor = valor;
        this.nQuarto = nQuarto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getnQuarto() {
        return nQuarto;
    }

    public void setnQuarto(int nQuarto) {
        this.nQuarto = nQuarto;
    }

    @Override
    public String toString() {
        return "Casa_do_estudante{" +
                "valor=" + valor +
                ", nQuarto=" + nQuarto +
                '}';
    }
}