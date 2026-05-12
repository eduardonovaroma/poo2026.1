package entidades;

public class Vendedor extends Pessoa {
    private String setor;

    public Vendedor(String nome, String email, String telefone, String setor) {
        super(nome, email, telefone);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
