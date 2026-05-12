class Retangulo implements PoligonoInterface {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }

    @Override
    public int getQuantidadeLados() {
        return 4;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
