public class Articulo {

    private int id;
    private String marca;
    private String nombre;
    private int precio;

    public Articulo(int id, String marca, String nombre, int precio){
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId(){
        return id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void mostar(){
        System.out.println("ID: "+ id + " | Marca: "+ marca + " | Nombre: "+ nombre+ " | Precio: $"+ precio);
    }

}
