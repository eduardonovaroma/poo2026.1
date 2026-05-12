public class Pessoa {
    private final String nome;
    private final String cpf;
    private final int idade;

    public Pessoa(String nome, String cpf, int idade) throws CampoObrigatorioException, CpfInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new CampoObrigatorioException("Nome e obrigatorio.");
        }

        if (idade < 0) {
            throw new IllegalArgumentException("Idade nao pode ser negativa.");
        }

        CpfValidator.validar(cpf);

        this.nome = nome;
        this.cpf = cpf.replaceAll("\\D", "");
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', cpf='" + cpf + "', idade=" + idade + "}";
    }
}
