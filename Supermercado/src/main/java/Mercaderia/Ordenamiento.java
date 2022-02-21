package Mercaderia;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {
    
    ArrayList<Productos> productos = new ArrayList<>();
    
    public Ordenamiento(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
    public ArrayList<Productos> getProductosPorPrecio() {
        Collections.sort(productos); //metodo para ordenar mis prod
        return productos;
    }
}
    
