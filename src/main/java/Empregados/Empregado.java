package Empregados;

public class Empregado {
    private int id = 1;
    private String nome;
    private double salario;

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalarial(double porcentagem){
        salario += salario * (1 + porcentagem);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "Id = " + id +
                ",\nNome = " + nome +
                ",\n" + String.format("Salario = R$ %.2f", salario);
    }
}
