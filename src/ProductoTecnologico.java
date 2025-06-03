public class ProductoTecnologico extends Articulo {

    private String marca;

    public ProductoTecnologico(int id, String nombre, String marca, double precio){
        super(id, nombre, precio);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    @Override
    public void mostrarDetalle(){
        System.out.println("ID: "+ getId() + " | Nombre: "+ getNombre()+ " | Precio: $"+ getPrecio()+" | Marca: "+getMarca());
    }

}
