class TrianguloEquilatero implements PoligonoInterface {
    private final double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Triangulo equilatero";
    }

    @Override
    public int getQuantidadeLados() {
        return 3;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) * lado * lado) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}
