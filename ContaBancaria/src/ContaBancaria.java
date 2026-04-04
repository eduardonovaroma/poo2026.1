public class ContaBancaria {

    // Atributos da classe ContaBancaria
    // O atributo titular é do tipo Cliente, o que significa que ele pode armazenar um objeto do tipo Cliente.
    private Cliente titular;
    private String numeroConta;
    private double saldo;

    // Construtor para inicializar os atributos da conta bancária
    // O construtor recebe um objeto do tipo Cliente para o titular, uma string para o número da conta e um valor double para o saldo inicial
    public ContaBancaria(Cliente titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    // Método para sacar dinheiro da conta, verificando se o saldo é suficiente
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para consultar o saldo da conta
    // Saldo é privado e não pode ser acessado diretamente de fora da classe
    public double consultarSaldo() {
        return saldo;
    }

    // Método para retornar o titular da conta
    // O titular é um objeto do tipo Cliente, e o método retorna esse objeto
    // Titular é privado e não pode ser acessado diretamente de fora da classe, mas pode ser acessado através deste método público
    public Cliente getTitular() {
        return titular;
    }

    // Método para retornar o número da conta
    // O número da conta é privado e não pode ser acessado diretamente de fora da classe, mas pode ser acessado através deste método público
    public String getNumeroConta() {
        return numeroConta;
    }

}
