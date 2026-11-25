public class main {
    public static void main(String[] args) {
        ProductoAlimenticio alimento = new ProductoAlimenticio("A01", "Arroz", 2000, 10.5);
        Electrodomestico electro = new Electrodomestico("E01", "Microondas", 150000, 12);
        alimento.mostrarProducto();
        electro.mostrarProducto();
    }
}