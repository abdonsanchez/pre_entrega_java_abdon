public class Articulo extends Producto implements Vendible {

    private double precio;

    public Articulo(int id, String nombre, double precio){
        super(id, nombre);
        this.precio = precio;
    }

    @Override
    public double getPrecio(){
        return precio;
    }
    @Override
    public void setPrecio(double precio){
        this.precio = precio;
    }
    @Override
    public void mostrarDetalle(){
        System.out.println("ID: "+ getId() + " | Nombre: "+ getNombre()+ " | Precio: $"+ getPrecio());
    }

}
