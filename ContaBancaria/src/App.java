public class App {
    public static void main(String[] args) throws Exception {
        
        // Criando objetos da classe Cliente
        // O construtor com três parâmetros é utilizado para criar o objeto clienteObjeto, inicializando o nome, telefone e CPF do cliente
        // O construtor com um parâmetro é utilizado para criar o objeto clienteObjeto2, 
        // inicializando apenas o nome do cliente, enquanto os outros atributos permanecem com seus valores padrão (null)
        Cliente clienteObjeto = new Cliente("Eduardo", "81-99234-1234", "32351231621");
        Cliente clienteObjeto2 = new Cliente("Maria");

        System.out.println("Nome: " + clienteObjeto.getNome());
        System.out.println("CPF: " + clienteObjeto.getCpf());
        System.out.println("Telefone: " + clienteObjeto.getTelefone());
        System.out.println("CEP: " + clienteObjeto.getCep());


        // Criando objetos da classe ContaBancaria
        // O construtor da classe ContaBancaria é utilizado para criar o objeto conta1,
        // inicializando o titular com o objeto clienteObjeto, o número da conta e o saldo inicial
        ContaBancaria conta1 = new ContaBancaria(clienteObjeto, "12345-6", 1000.00);
        System.out.println("Titular: " + conta1.getTitular().getNome());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo Inicial: R$ " + conta1.consultarSaldo());
       
        conta1.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + conta1.consultarSaldo());
       
        conta1.sacar(200.00);
        System.out.println("Saldo após saque: R$ " + conta1.consultarSaldo());
        // conta1.saldo = 20000;
        conta1.sacar(1500.00); // Tentativa de saque com saldo insuficiente
        System.out.println("Saldo após saque: R$ " + conta1.consultarSaldo());

  
        // Criando outro objeto da classe ContaBancaria utilizando o mesmo clienteObjeto como titular
        // O construtor da classe ContaBancaria é utilizado para criar o objeto conta2,
        // inicializando o titular com o objeto clienteObjeto, o número da conta e o saldo inicial
        ContaBancaria conta2 = new ContaBancaria(clienteObjeto, "65432-1", 2000.00);
        System.out.println("Titular: " + conta2.getTitular().getNome());
        System.out.println("Número da Conta: " + conta2.getNumeroConta());
        System.out.println("Saldo Inicial: R$ " + conta2.consultarSaldo());

        conta2.getTitular().setCpf("12345678901");
        System.out.println("CPF: " + conta2.getTitular().getCpf());
    }
}
