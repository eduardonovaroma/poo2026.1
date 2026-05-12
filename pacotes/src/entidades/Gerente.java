package entidades;

public class Gerente extends Pessoa {
    private String departamento;

    public Gerente(String nome, String email, String telefone, String departamento) {
        super(nome, email, telefone);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
