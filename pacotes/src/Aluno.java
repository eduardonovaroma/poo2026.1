import entidades.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String email, String telefone, String matricula) {
        super(nome, email, telefone);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
