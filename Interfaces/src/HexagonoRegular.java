class HexagonoRegular implements PoligonoInterface {
    private final double lado;

    public HexagonoRegular(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Hexagono regular";
    }

    @Override
    public int getQuantidadeLados() {
        return 6;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
}
