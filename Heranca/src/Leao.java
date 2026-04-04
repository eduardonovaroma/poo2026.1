// A classe Leao é uma subclasse da classe Animal, o que significa que ela herda os atributos e métodos da classe Animal.
// A classe Leao pode ter seus próprios atributos e métodos, além dos que herda da classe Animal. 
// Neste exemplo, a classe Leao sobrescreve o método fazerBarulho da classe Animal para fornecer uma implementação específica para leões, 
// e também sobrecarrega o método comer para aceitar um parâmetro de comida, permitindo que o leão coma diferentes tipos de comida.
public class Leao extends Animal {

    // O atributo chefe é específico da classe Leao e não é herdado da classe Animal. Ele pode ser utilizado para indicar se o leão é o chefe do grupo ou não.
    public boolean chefe;

    // O construtor da classe Leao é utilizado para criar objetos da classe Leao. 
    // Ele chama o construtor da classe pai (Animal) utilizando a palavra-chave super para inicializar os atributos herdados, 
    // e também pode ser utilizado para inicializar os atributos específicos da classe Leao.
    public Leao(int peso, String cor) {
        super(peso, cor);
    }

    // O método fazerBarulho é sobrescrito para fornecer uma implementação específica para leões, fazendo com que o leão rugia em vez de fazer um barulho genérico.
    public void fazerBarulho() {
        super.fazerBarulho(); // chama o método da classe pai
        System.out.println("O leão está rugindo.");
    }

    // O método comer é sobrecarregado para aceitar um parâmetro de comida, permitindo que o leão coma diferentes tipos de comida.
    public void comer(String comida) {
        super.comer();
        System.out.println("O leão está comendo " + comida);
    }
}
