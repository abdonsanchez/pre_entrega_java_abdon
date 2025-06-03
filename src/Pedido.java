import java.util.ArrayList;

public class Pedido {

    private static int contadorPedidos = 1;
    private int numeroDePedido;
    private ArrayList<Producto> productos;

    public Pedido(){
        this.numeroDePedido = contadorPedidos++;
        this.productos = new ArrayList<>();
    }

    public int getNumeroDePedido(){
        return numeroDePedido;
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void mostrarPedido(){
        System.out.println("Pedido numero: "+ getNumeroDePedido());
        if (productos.isEmpty()){
            System.out.println("La lista de pedidos esta vacia.");
        }else{
            for (Producto producto : productos){
                producto.mostrarDetalle();  //  polimorfismo aplicado
            }
        }
    }

}
