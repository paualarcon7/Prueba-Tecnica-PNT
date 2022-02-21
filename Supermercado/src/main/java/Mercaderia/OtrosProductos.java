package Mercaderia;

public class OtrosProductos extends Productos {
    
    public OtrosProductos(){
        super();
        
    }
    
    public OtrosProductos(String nombre, String contenido, int precio){
        super(nombre,contenido,precio);
        
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+ " /// " +contenido+ "/// Precio: $"+precio;
    }
    
    
    
    
}
