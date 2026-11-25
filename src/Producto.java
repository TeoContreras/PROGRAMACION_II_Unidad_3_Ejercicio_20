public class Producto {
    protected String codigo;
    protected String descripcion;
    protected double costoBase;

    public Producto(String codigo, String descripcion, double costoBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoBase = costoBase;
    }

    public double calcularPrecioFinal() {
        return costoBase;
    }

    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo + " - " + descripcion);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}