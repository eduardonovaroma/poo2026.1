public class App {
    public static void main(String[] args) {
       
        PoligonoInterface retangulo = new Retangulo(5, 3);
        PoligonoInterface triangulo = new Triangulo(4, 2, 3, 4, 5);

        MostrarPoligono mostrarRetangulo = new MostrarPoligono(retangulo);
        mostrarRetangulo.exibirCalculos();

        MostrarPoligono mostrarTriangulo = new MostrarPoligono(triangulo);
        mostrarTriangulo.exibirCalculos();
    }
}
