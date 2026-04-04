public class App {

    // Método principal - ponto de entrada do programa
    public static void main(String[] args) throws Exception {
        
        // Criando um objeto da classe Carro usando o construtor com parâmetros
        Carro fiat = new Carro("Fiat", "Fastback", 2020); 
        
        // Chamando os métodos do objeto fiat
        fiat.acelerar(100); // Acelerando o Fiat a 100 km/h
        fiat.frear("fraco"); // Freiando o Fiat com força fraca
        System.out.println("Idade: " + fiat.calcularIdade());


        // Criando outro objeto da classe Carro
        Carro fusca = new Carro("VW", "Fusca", 1988);
        fusca.acelerar(200); // Acelerando o Fusca a 200 km/h (apenas para fins de demonstração, não recomendado na vida real!)
        fusca.frear("forte"); // Freiando o Fusca com força forte
        System.out.println("Idade: " + fusca.calcularIdade()); // Calculando e exibindo a idade do Fusca
        
    }
}
