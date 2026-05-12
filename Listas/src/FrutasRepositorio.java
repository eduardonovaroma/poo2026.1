import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FrutasRepositorio {

    private List<String> frutas;

    public FrutasRepositorio() {
        this.frutas = new ArrayList<String>();
    }

    public void adicionar(String fruta) {
        frutas.add(fruta);
    }

    public void listar() {
        System.out.println("Frutas no repositório:");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(i + ": " + frutas.get(i));
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
