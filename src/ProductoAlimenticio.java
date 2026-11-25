public class ProductoAlimenticio extends Producto {
    private double porcentajeImpuesto;

    public ProductoAlimenticio(String codigo, String descripcion, double costoBase, double porcentajeImpuesto) {
        super(codigo, descripcion, costoBase);
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    @Override
    public double calcularPrecioFinal() {
        return costoBase + costoBase * porcentajeImpuesto / 100;
    }
}