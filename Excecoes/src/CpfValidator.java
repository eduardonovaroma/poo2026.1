public class CpfValidator {

    public static void validar(String cpf) throws CampoObrigatorioException, CpfInvalidoException {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new CampoObrigatorioException("CPF e obrigatorio.");
        }

        String cpfNumerico = cpf.replaceAll("\\D", "");

        if (cpfNumerico.length() != 11) {
            throw new CpfInvalidoException("CPF deve conter 11 digitos.");
        }

        if (todosDigitosIguais(cpfNumerico)) {
            throw new CpfInvalidoException("CPF com todos os digitos iguais e invalido.");
        }

        if (!digitosVerificadoresValidos(cpfNumerico)) {
            throw new CpfInvalidoException("Digitos verificadores do CPF sao invalidos.");
        }
    }

    private static boolean todosDigitosIguais(String cpf) {
        char primeiro = cpf.charAt(0);
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != primeiro) {
                return false;
            }
        }
        return true;
    }

    private static boolean digitosVerificadoresValidos(String cpf) {
        int primeiroDigito = calcularDigito(cpf, 10);
        int segundoDigito = calcularDigito(cpf, 11);

        return primeiroDigito == Character.getNumericValue(cpf.charAt(9))
                && segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }

    private static int calcularDigito(String cpf, int pesoInicial) {
        int soma = 0;
        int limite = pesoInicial - 1;

        for (int i = 0; i < limite; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (pesoInicial - i);
        }

        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }
}
