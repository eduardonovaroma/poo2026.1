public class App {
    public static void main(String[] args) throws Exception {
        
        Leao leao1 = new Leao(200, "Amarelo"); // instancia da classe Leao
        leao1.fazerBarulho();
        leao1.comer("Carne");
        System.out.println("O Leão: " + leao1);

        Gato gato1 = new Gato(5, "Preto");
        gato1.fazerBarulho();
        gato1.comer("Ração");
        System.out.println("O Gato: " + gato1);

    }
}
