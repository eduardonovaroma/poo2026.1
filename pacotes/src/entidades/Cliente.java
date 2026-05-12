package entidades;

public class Cliente extends Pessoa {
    private String endereco;

    public Cliente(String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
