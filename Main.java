import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaVentas sistema = new SistemaVentas();
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE VENTAS ---");
            System.out.println("1. Registrar venta");
            System.out.println("2. Consultar venta");
            System.out.println("3. Mostrar todas las ventas");
            System.out.println("4. Eliminar venta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Precio unitario: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    Venta venta = new Venta(codigo, nombre, cantidad, precio);
                    sistema.registrarVenta(venta);
                    break;

                case 2:
                    System.out.print("Ingrese código a consultar: ");
                    String codBuscar = sc.nextLine();
                    Venta v = sistema.consultarVenta(codBuscar);
                    if(v != null){
                        System.out.println(v);
                    } else {
                        System.out.println("No encontrada.");
                    }
                    break;

                case 3:
                    sistema.mostrarTodasLasVentas();
                    break;

                case 4:
                    System.out.print("Código a eliminar: ");
                    String codEliminar = sc.nextLine();
                    sistema.eliminarVenta(codEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while(opcion != 5);

        sc.close();
    }
}