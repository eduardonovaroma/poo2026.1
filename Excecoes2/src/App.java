public class App {
    public static void main(String[] args) {
        
        try {
            float resultado = divisao(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Não é possível dividir por zero.");
            System.out.println("Detalhes do erro: " + e.getMessage());
            e.printStackTrace();
        } catch (DivisaoZeroException e) {
            System.out.println("DivisaoZeroException capturado: " + e.getMessage());
        }
        
    }

    public static int divisao(int valor1, int valor2) throws DivisaoZeroException {
        if (valor2 == 0) {
            throw new DivisaoZeroException("Valor2 não pode ser zero.");
        }

        int resultado = valor1 / valor2;
        return resultado;
    }
}
