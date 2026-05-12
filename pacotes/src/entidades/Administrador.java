package entidades;

public class Administrador extends Pessoa {
    private String cargo;

    public Administrador(String nome, String email, String telefone, String cargo) {
        super(nome, email, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
