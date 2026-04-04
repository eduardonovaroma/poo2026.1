public class Animal {

    // Atributos da classe Animal
    private int peso;
    public float altura;
    private String cor;

    // Construtor da classe Animal
    // O construtor é um método especial que é chamado quando um objeto da classe é criado. Ele é utilizado para inicializar os atributos do objeto.
    public Animal(int peso, String cor) {
        this.peso = peso;
        this.cor = cor;
    }

    // Métodos da classe Animal

    // O método comer é protegido, o que significa que ele pode ser acessado dentro da classe Animal e por classes que herdam de Animal, mas não por outras classes fora do pacote.
    protected void comer() {
        System.out.println("O animal está comendo.");
    }

    // O método dormir é público, o que significa que ele pode ser acessado por qualquer classe, independentemente do pacote.
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    // O método andar é público, o que significa que ele pode ser acessado por qualquer classe, independentemente do pacote.
    public void andar() {
        System.out.println("O animal está andando.");
    }

    // O método fazerBarulho é público, o que significa que ele pode ser acessado por qualquer classe, independentemente do pacote.
    public void fazerBarulho(){
        System.out.println("O animal está fazendo barulho.");
    }

    @Override // sobrescreve o método da classe Object
    // O método toString é utilizado para fornecer uma representação em forma de string do objeto. Ele é sobrescrito para retornar uma string que contém os valores dos atributos do objeto.
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                '}';
    }

    // Métodos getters e setters para os atributos da classe Animal
    // O método setPeso é utilizado para definir o valor do atributo peso. 
    // Ele inclui uma validação para garantir que o peso seja maior que 100 e menor que 1000. 
    // Se o valor for válido, ele é atribuído ao atributo peso; caso contrário, uma mensagem de erro é exibida.
    public void setPeso(int peso) {
        if (peso >= 100 && peso < 1000) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido. O peso deve ser maior que 100 e menor que 1000.");
        }
    }

    // O método getPeso é utilizado para obter o valor do atributo peso. Ele retorna o valor atual do peso do animal.
    public int getPeso() {
        return this.peso;
    }
}

