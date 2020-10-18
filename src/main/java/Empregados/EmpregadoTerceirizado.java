package Empregados;

public class EmpregadoTerceirizado extends Empregado {

    private double adicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(int id, String nome, double salario, double adicional) {
        super(id, nome, salario);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
