public class Cliente {

    // Atributos da classe Cliente
    // Pissíveis modificadores de acesso: public, private, protected
    // O modificador de acesso private significa que os atributos só podem ser acessados e modificados dentro da própria classe Cliente. 
    // Para acessar e modificar esses atributos de fora da classe, 
    // é necessário utilizar os métodos públicos (setters e getters) fornecidos pela classe.
    private String nome;
    private String cpf;
    private String cep;
    private String telefone;
    private String email;

    // Construtor com um parâmetro
    // Inicializa o nome do cliente, enquanto os outros atributos permanecem com seus valores padrão (null)
    public Cliente(String nome) {
        this.nome = nome;
    }

    // Construtor com três parâmetros
    // Inicializa o nome, telefone e CPF do cliente
    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.setCpf(cpf);
    }

    // Setters e Getters
    ///////////////////////////////////////////////////////////
    // O método setNome verifica se o nome tem pelo menos 4 caracteres antes de atribuí-lo ao atributo nome
    // O attributo nome é privado, então só pode ser acessado e modificado através dos métodos setNome e getNome
    public void setNome(String nome) {
        if (nome.length() >= 4) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    // O método getNome retorna o valor do atributo nome
    // O atributo nome é privado, então só pode ser acessado e modificado através dos métodos setNome e getNome
    public String getNome() {
        return nome;
    }

    // O método setCpf verifica se o CPF tem exatamente 11 caracteres antes de atribuí-lo ao atributo cpf
    // O atributo cpf é privado, então só pode ser acessado e modificado através dos métodos setCpf e getCpf
    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    // O método getCpf retorna o valor do atributo cpf
    // O atributo cpf é privado, então só pode ser acessado e modificado através dos métodos setCpf e getCpf
    public String getCpf() {
        return cpf;
    }

    // O método setCep verifica se o CEP tem exatamente 8 caracteres antes de atribuí-lo ao atributo cep
    // O atributo cep é privado, então só pode ser acessado e modificado através dos métodos setCep e getCep
    public void setCep(String cep) {
        if (cep.length() == 8) {
            this.cep = cep;
        } else {
            System.out.println("Cep inválido.");
        }
    }

    // O método getCep retorna o valor do atributo cep
    // O atributo cep é privado, então só pode ser acessado e modificado através dos métodos setCep e getCep
    public String getCep() {
        return cep;
    }

    // O método setTelefone atribui o valor do telefone ao atributo telefone
    // O atributo telefone é privado, então só pode ser acessado e modificado através dos métodos setTelefone e getTelefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // O método getTelefone retorna o valor do atributo telefone
    // O atributo telefone é privado, então só pode ser acessado e modificado através dos métodos setTelefone e getTelefone
    public String getTelefone() {
        return telefone;
    }

    // O método setEmail atribui o valor do email ao atributo email
    // O atributo email é privado, então só pode ser acessado e modificado através dos métodos setEmail e getEmail
    public void setEmail(String email) {
        this.email = email;
    }

    // O método getEmail retorna o valor do atributo email
    // O atributo email é privado, então só pode ser acessado e modificado através dos métodos setEmail e getEmail
    public String getEmail() {
        return email;
    }

}
