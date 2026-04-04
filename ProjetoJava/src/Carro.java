// Classe Carro
public class Carro {

    // Atributos da Classe
    public String marca;
    public String modelo;
    public int ano;

    // Construtores padrão sem parâmetros para criar um objeto sem inicializar os atributos
    public Carro() {
        // TODO: Opcionalmente, você pode inicializar os atributos com valores padrão aqui
    }
    
    // Construtor com parâmetros para inicializar os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos/Ações/Funções

    // Método para acelerar o carro, recebendo a velocidade como parâmetro
    // Com void, o método não retorna nenhum valor
    public void acelerar(int velocidade) {
        System.out.println("O " + modelo + " está acelerando a " + velocidade + " km/h.");
    }

    // Método para frear o carro, recebendo a força do freio como parâmetro
    // Com void, o método não retorna nenhum valor
    public void frear(String forca) {
        System.out.println("O " + modelo + " está freiando " + forca + ".");
    }

    // Método para calcular a idade do carro
    // Com return, o método retorna um valor inteiro representando a idade do carro
    public int calcularIdade() {
        return 2026 - ano;
    }
}
