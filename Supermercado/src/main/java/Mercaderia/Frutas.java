package Mercaderia;

public class Frutas extends Productos{
    
    public Frutas(){
        super();
        
    }
    
    public Frutas(String nombre, int precio, String contenido) {
        super(nombre,contenido,precio);
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+ " /// Precio: $" +precio+ " /// Unidad de venta: " +contenido;
    }
    
    
    
}
