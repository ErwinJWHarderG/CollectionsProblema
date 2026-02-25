public class Venta {

    private String codigoProducto;
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;

    public Venta(String codigoProducto, String nombreProducto, int cantidad, double precioUnitario) {
        if(codigoProducto == null || codigoProducto.isEmpty()){
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Código: " + codigoProducto +
               ", Producto: " + nombreProducto +
               ", Cantidad: " + cantidad +
               ", Precio: " + precioUnitario +
               ", Total: " + calcularTotal();
    }
}