import java.util.List;

public interface AlunoRepositorio {
    void adicionar(Aluno aluno);
    List<Aluno> listar();
    boolean remover(String matricula);
    Aluno buscar(String matricula);
}
