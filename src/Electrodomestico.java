public class Electrodomestico extends Producto {
    private int garantiaMeses;

    public Electrodomestico(String codigo, String descripcion, double costoBase, int garantiaMeses) {
        super(codigo, descripcion, costoBase);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecioFinal() {
        return costoBase * 1.21;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}