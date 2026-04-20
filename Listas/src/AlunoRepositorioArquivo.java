import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorioArquivo implements AlunoRepositorio {

    private final Path arquivo;
    private final List<Aluno> alunos;

    public AlunoRepositorioArquivo(String caminhoArquivo) {
        this.arquivo = Paths.get(caminhoArquivo);
        this.alunos = new ArrayList<>();
        inicializarArquivo();
        carregarDoArquivo();
    }

    @Override
    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
        salvarNoArquivo();
    }

    @Override
    public List<Aluno> listar() {
        return new ArrayList<>(alunos);
    }

    @Override
    public boolean remover(String matricula) {
        boolean removido = alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
        if (removido) {
            salvarNoArquivo();
        }
        return removido;
    }

    @Override
    public Aluno buscar(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    private void inicializarArquivo() {
        try {
            Path pasta = arquivo.getParent();
            if (pasta != null) {
                Files.createDirectories(pasta);
            }
            if (!Files.exists(arquivo)) {
                Files.createFile(arquivo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel inicializar o arquivo de alunos.", e);
        }
    }

    private void carregarDoArquivo() {
        try {
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                if (linha == null || linha.isBlank()) {
                    continue;
                }

                String[] partes = linha.split(";", 2);
                if (partes.length == 2) {
                    alunos.add(new Aluno(partes[0], partes[1]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel ler o arquivo de alunos.", e);
        }
    }

    private void salvarNoArquivo() {
        List<String> linhas = new ArrayList<>();
        for (Aluno aluno : alunos) {
            linhas.add(aluno.getMatricula() + ";" + aluno.getNome());
        }

        try {
            Files.write(
                arquivo,
                linhas,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.CREATE
            );
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel salvar o arquivo de alunos.", e);
        }
    }
}
