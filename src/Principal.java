import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Producto> lista = new ArrayList<>();
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("menu de productos y pedidos:");
            System.out.println("1. Crear articulo");
            System.out.println("2. Crear producto tecnologico");
            System.out.println("3. Listar productos");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Cargar pedido");
            System.out.println("7. Listar pedido por numero");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> crearArticulo();
                case 2 -> crearProductoTecnologico();
                case 3 -> listarrProducto();
                case 4 -> modificarProducto();
                case 5 -> eliminarProducto();
                case 6 -> cargarPedido();
                case 7 -> listarPedido();
                case 8 -> System.out.println("saliendo...");
                default -> System.out.println("opcion invalida");
            }

        } while (opcion != 8);

        System.out.println("exit");
    }

    static public void crearArticulo() {
        System.out.println("Ingrese el ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el precio: ");
        int precio = entrada.nextInt();

        Articulo articuloNuevo = new Articulo(id, nombre, precio);
        lista.add(articuloNuevo);
        System.out.println("articulo agregado con exito!!");
    }

    static public void crearProductoTecnologico(){
        System.out.println("ingrese el ID: ");
        int id = entrada.nextInt(); entrada.nextLine();
        System.out.println("ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("ingrese la marca: ");
        String marca = entrada.nextLine();
        System.out.println("ingrese el precio: ");
        double precio = entrada.nextDouble(); entrada.nextLine();

        lista.add(new ProductoTecnologico(id, nombre,marca, precio));
        System.out.println("Producto tecnologico creado.");
    }

    static public void listarrProducto() {
        if (lista.isEmpty()) {
            System.out.println("La lista de articulos esta vacia");
        } else {
            for (Producto p : lista) {
                p.mostrarDetalle();
            }
        }
    }

    public static void modificarProducto() {
        System.out.println("ingrese el ID del articulo a modificar:");
        int id = entrada.nextInt();
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                entrada.nextLine();
                System.out.println("nuevo nombre:");
                producto.setNombre(entrada.nextLine());
                System.out.println("nuevo precio:");
                ((Vendible)producto).setPrecio(entrada.nextDouble());
                entrada.nextLine();
            }
        }
    }

    public static void eliminarProducto() {
        System.out.println("ingrese el ID del articulo a eliminar:");
        int id = entrada.nextInt();
        lista.removeIf(a -> a.getId() == id);
        System.out.println("articulo eliminado si existia");
    }

    public static void cargarPedido() {
        Pedido nuevoPedido = new Pedido();
        while (true) {
            System.out.println("Ingrese el ID del producto a agregar: ");
            int id = entrada.nextInt();
            if (id == 0) break;
            for (Producto producto : lista) {
                if (id == producto.getId()) {
                    nuevoPedido.agregarProducto(producto);
                    System.out.println("producto agregado.");
                    break;
                }
            }
        }
        pedidos.add(nuevoPedido);
        System.out.println("Pedido cargado con ID: " + nuevoPedido.getNumeroDePedido());
    }

    public static void listarPedido() {
        System.out.println("ingrese numero de pedido: ");
        int numeroPedido = entrada.nextInt(); entrada.nextLine();
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroDePedido() == numeroPedido) {
                pedido.mostrarPedido();
                return;
            }
        }
        System.out.println("pedido no encontrado.");
    }

}
