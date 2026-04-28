import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        FrutasRepositorio frutasRepositorio = new FrutasRepositorio();
        frutasRepositorio.adicionar("Maçã");
        frutasRepositorio.adicionar("Banana");
        frutasRepositorio.adicionar("Laraja");
        frutasRepositorio.listar();
        frutasRepositorio.adicionar("Uva");
        frutasRepositorio.listar();

        frutasRepositorio.remover("Banana");
        frutasRepositorio.listar();
    }









    

    private static void demonstrarRepositorio(String nomeRepositorio, AlunoRepositorio repositorio) {
        System.out.println("\n==============================");
        System.out.println("Repositorio: " + nomeRepositorio);
        System.out.println("==============================");

        repositorio.adicionar(new Aluno("2026001", "Ana"));
        repositorio.adicionar(new Aluno("2026002", "Bruno"));
        repositorio.adicionar(new Aluno("2026003", "Carla"));

        System.out.println("\n1) Lista inicial:");
        imprimirLista(repositorio.listar());

        System.out.println("\n2) Buscar matricula 2026002:");
        Aluno encontrado = repositorio.buscar("2026002");
        System.out.println(encontrado != null ? encontrado : "Aluno nao encontrado");

        System.out.println("\n3) Remover matricula 2026002:");
        boolean removido = repositorio.remover("2026002");
        System.out.println(removido ? "Aluno removido com sucesso" : "Aluno nao encontrado");

        System.out.println("\n4) Lista final:");
        imprimirLista(repositorio.listar());
    }

    private static void imprimirLista(java.util.List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("(lista vazia)");
            return;
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
