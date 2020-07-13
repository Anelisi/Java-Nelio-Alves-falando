public class Aluno {
    private String nome;
    private int nota1, nota2, nota3, soma, falta;
    private String status;

    public Aluno(String nome, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String status(){
        soma = nota1 + nota2 + nota3;

        if (soma > 60){
            this.status = "APROVADO";
            return "APROVADO";
        } else {
            this.status = "REPROVADO";
            falta = 60 - soma;
            return "REPROVADO";
        }

    }
    public void exibeDados(){
        System.out.println("----------------- ALUNO --------------------");
        System.out.println("Nome: " + this.getNome() + "\nTotal de notas do trimestre: " + this.getSoma() + "\nStatus: " + this.getStatus());

        if (getStatus().equals("REPROVADO")){
            System.out.println("Faltou " + this.getFalta() + " pontos para alcançar a média");
        }

        System.out.println("--------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
}
