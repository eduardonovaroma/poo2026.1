class Triangulo implements PoligonoInterface {
    private final double base;
    private final double altura;
    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }

    @Override
    public int getQuantidadeLados() {
        return 3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
