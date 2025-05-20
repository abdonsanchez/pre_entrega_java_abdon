import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Articulo> listaArticulo = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("ingrese una opcion:");
            System.out.println("1. Crear articulo");
            System.out.println("2. Listar articulo");
            System.out.println("3. Modificar articulo");
            System.out.println("4. Eliminar articulo");
            System.out.println("5. exit");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    crearArticulo();
                    break;
                case 2:
                    listarArticulo();
                    break;
                case 3:
                    modificarArticulo();
                    break;
                case 4:
                    eliminarArticulo();
                    break;

            }

        }while (opcion != 5);

        System.out.println("exit");
    }

        static public void crearArticulo(){
            System.out.println("Ingrese el ID: ");
        int id = entrada.nextInt(); entrada.nextLine();
            System.out.println("ingrese la marca: ");
        String marca = entrada.nextLine();
            System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
            System.out.println("Ingrese el precio: ");
        int precio = entrada.nextInt();

        Articulo articuloNuevo = new Articulo(id, marca, nombre, precio);
        listaArticulo.add(articuloNuevo);
        System.out.println("articulo agregado con exito!!");
    }

    static public void listarArticulo(){
        if (listaArticulo.isEmpty()){
            System.out.println("La lista de articulos esta vacia");
        }else {
            for (Articulo a : listaArticulo){
                a.mostar();
            }
        }
    }

    public static void modificarArticulo(){
        System.out.println("ingrese el ID del articulo a modificar:");
        int id = entrada.nextInt();
        for (Articulo articulo : listaArticulo){
            if (articulo.getId() == id){
                entrada.nextLine();
                System.out.println("nueva marca:");
                articulo.setMarca(entrada.nextLine());
                System.out.println("nuevo nombre:");
                articulo.setNombre(entrada.nextLine());
                System.out.println("nuevo precio:");
                articulo.setPrecio(entrada.nextInt()); entrada.nextLine();
            }
        }
    }

    public static void eliminarArticulo(){
        System.out.println("ingrese el ID del articulo a eliminar:");
        int id = entrada.nextInt();
        listaArticulo.removeIf(a -> a.getId() == id);
        System.out.println("articulo eliminado si existia");

    }

}
