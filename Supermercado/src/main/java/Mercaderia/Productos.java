package Mercaderia;

public class Productos implements Comparable<Productos>{
    
    protected String nombre;
    protected String contenido;
    protected int precio;
    
    public Productos(){
        
    }
    
   public Productos(String nombre, String contenido, int precio) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
    @Override
    public int compareTo(Productos producto) {
         return this.getPrecio() < producto.getPrecio() ? -1 :
                 (this.getPrecio() == producto.getPrecio() ? 0 : 1);
    }
    }

    
