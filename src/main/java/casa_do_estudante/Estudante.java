package casa_do_estudante;

public class Estudante {
    String nome, email;
    int idade, matricula;
    Casa_do_estudante quarto;

    public Estudante(String nome, String email, int idade, int matricula, Casa_do_estudante quarto) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.matricula = matricula;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Casa_do_estudante getQuarto() {
        return quarto;
    }

    public void setQuarto(Casa_do_estudante quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", quarto=" + quarto +
                '}';
    }
}
