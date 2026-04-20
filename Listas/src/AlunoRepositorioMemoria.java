import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorioMemoria implements AlunoRepositorio {

    private final List<Aluno> alunos;

    public AlunoRepositorioMemoria() {
        this.alunos = new ArrayList<>();
    }

    @Override
    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public List<Aluno> listar() {
        return new ArrayList<>(alunos);
    }

    @Override
    public boolean remover(String matricula) {
        return alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
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
}
