import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import br.com.joao.Calculadora;
import entidades.*;

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();
        float resultado = calc.divisao(10, 3);
        System.out.println("O resultado da divisão é: " + resultado); 

        Cliente cliente = new Cliente("João", "joao@email.com", "123456789", "Rua A, 123");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Email do cliente: " + cliente.getEmail());
        System.out.println("Telefone do cliente: " + cliente.getTelefone());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());

        Gerente gerente = new Gerente("Maria", "maria@email.com", "987654321", "Vendas");
        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Email do gerente: " + gerente.getEmail());
        System.out.println("Telefone do gerente: " + gerente.getTelefone());
        System.out.println("Departamento do gerente: " + gerente.getDepartamento());

        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", "555555555", "Setor B");
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Email do vendedor: " + vendedor.getEmail());
        System.out.println("Telefone do vendedor: " + vendedor.getTelefone());
        System.out.println("Setor do vendedor: " + vendedor.getSetor());

        Administrador administrador = new Administrador("Ana", "ana@email.com", "111111111", "Recursos Humanos");
        System.out.println("Nome do administrador: " + administrador.getNome());
        System.out.println("Email do administrador: " + administrador.getEmail());
        System.out.println("Telefone do administrador: " + administrador.getTelefone());
        System.out.println("Cargo do administrador: " + administrador.getCargo());

        Aluno aluno = new Aluno("Pedro", "pedro@email.com", "999999999", "123456");
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Email do aluno: " + aluno.getEmail());
        System.out.println("Telefone do aluno: " + aluno.getTelefone());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());

        String saudacao = "Olá, seja bem-vindo ao curso de Java!";
        System.out.println(saudacao);

        double raiz = Math.sqrt(16);
        double potencia = Math.pow(8, 3);
        System.out.println("A raiz quadrada de 16 é: " + raiz);
        System.out.println("8 elevado a 3 é: " + potencia);
        
        Date dataAtual = new Date();
        System.out.println("Data atual: " + dataAtual);
        System.out.println("Data Formatada DD/MM/YYYY: " + String.format("%1$td/%1$tm/%1$tY", dataAtual));


        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
