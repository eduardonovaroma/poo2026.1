import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FrutasRepositorio {

    private List<String> frutas;

    public FrutasRepositorio() {
        this.frutas = new ArrayList<>();
    }

    public void adicionar(String fruta) {
        frutas.add(fruta);
    }

    public void listar() {
        System.out.println("Frutas no repositório:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    public void remover(String fruta) {
        frutas.remove(fruta);
    }

    public String buscar(String fruta) {
        for (String f : frutas) {
            if (f.equals(fruta)) {
                return f;
            }
        }
        return null;
    }
}
