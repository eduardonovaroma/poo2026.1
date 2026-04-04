// A classe Gato é uma subclasse da classe Animal, o que significa que ela herda os atributos e métodos da classe Animal.
// A classe Gato pode ter seus próprios atributos e métodos, além dos que herda da classe Animal. 
// Neste exemplo, a classe Gato sobrescreve o método fazerBarulho da classe Animal para fornecer uma implementação específica para gatos, 
// e também sobrecarrega o método comer para aceitar um parâmetro de comida, permitindo que o gato coma diferentes tipos de comida.
public class Gato extends Animal {

    // O construtor da classe Gato é utilizado para criar objetos da classe Gato. 
    // Ele chama o construtor da classe pai (Animal) utilizando a palavra-chave super para inicializar os atributos herdados, 
    // e também pode ser utilizado para inicializar os atributos específicos da classe Gato.
    public Gato(int peso, String cor) {
        super(peso, cor);
    }

    // O método fazerBarulho é sobrescrito para fornecer uma implementação específica para gatos, fazendo com que o gato mia em vez de fazer um barulho genérico.
    public void fazerBarulho() {
        System.out.println("O gato está miando.");
    }

    // O método comer é sobrecarregado para aceitar um parâmetro de comida, permitindo que o gato coma diferentes tipos de comida.
    public void comer(String comida) {
        System.out.println("O gato está comendo " + comida);
    }
}
