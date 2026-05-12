public class CadastroPessoaService {

    public Pessoa cadastrar(String nome, String cpf, String idadeTexto) throws CampoObrigatorioException, CpfInvalidoException {
        int idade = Integer.parseInt(idadeTexto);
        return new Pessoa(nome, cpf, idade);
    }
}
