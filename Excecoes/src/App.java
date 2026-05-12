public class App {
    public static void main(String[] args) {
        CadastroPessoaService service = new CadastroPessoaService();

        System.out.println("=== Exemplo 1: cadastro valido ===");
        tentarCadastro(service, "Ana", "529.982.247-25", "23");

        System.out.println("\n=== Exemplo 2: CPF invalido (customizada) ===");
        tentarCadastro(service, "Bruno", "123.456.789-00", "30");

        System.out.println("\n=== Exemplo 3: CPF vazio (customizada) ===");
        tentarCadastro(service, "Carla", "", "19");

        System.out.println("\n=== Exemplo 4: idade invalida (nativa NumberFormatException) ===");
        tentarCadastro(service, "Diego", "529.982.247-25", "vinte");

        System.out.println("\n=== Exemplo 5: idade negativa (nativa IllegalArgumentException) ===");
        tentarCadastro(service, "Eva", "529.982.247-25", "-5");
    }

    private static void tentarCadastro(CadastroPessoaService service, String nome, String cpf, String idadeTexto) {
        try {
            Pessoa pessoa = service.cadastrar(nome, cpf, idadeTexto);
            System.out.println("Cadastro realizado: " + pessoa);
        } catch (CampoObrigatorioException | CpfInvalidoException e) {
            System.out.println("Erro de regra de negocio: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro nativo: idade deve ser numerica. Detalhe: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro nativo: " + e.getMessage());
        }
    }
}
