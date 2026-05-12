public class MostrarPoligono {
	private final PoligonoInterface poligono;

	public MostrarPoligono(PoligonoInterface poligono) {
		this.poligono = poligono;
	}

	public void exibirCalculos() {
		System.out.printf(
			"%s (%d lados) -> area: %.2f | perimetro: %.2f%n",
			poligono.getNome(),
			poligono.getQuantidadeLados(),
			poligono.calcularArea(),
			poligono.calcularPerimetro()
		);
	}
}
