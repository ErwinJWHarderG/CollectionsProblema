import java.util.TreeMap;
import java.util.Map;

public class SistemaVentas {

    private TreeMap<String, Venta> ventas;

    public SistemaVentas() {
        ventas = new TreeMap<>();
    }

    // Registrar venta
    public void registrarVenta(Venta venta) {
        if(ventas.containsKey(venta.getCodigoProducto())){
            System.out.println("Ya existe una venta con ese código.");
        } else {
            ventas.put(venta.getCodigoProducto(), venta);
            System.out.println("Venta registrada correctamente.");
        }
    }

    // Consultar por código
    public Venta consultarVenta(String codigo) {
        return ventas.get(codigo);
    }

    // Mostrar todas las ventas
    public void mostrarTodasLasVentas() {
        if(ventas.isEmpty()){
            System.out.println("No hay ventas registradas.");
        } else {
            for(Map.Entry<String, Venta> entry : ventas.entrySet()){
                System.out.println(entry.getValue());
            }
        }
    }

    // Eliminar venta
    public void eliminarVenta(String codigo) {
        if(ventas.remove(codigo) != null){
            System.out.println("Venta eliminada.");
        } else {
            System.out.println("No existe venta con ese código.");
        }
    }
}