package ClaseMain;

import Mercaderia.Ordenamiento;
import Mercaderia.Productos;
import Mercaderia.Frutas;
import Mercaderia.OtrosProductos;
import java.util.ArrayList;
 

public class TestProducto {

    public static ArrayList<Productos> items = new ArrayList<Productos>();
    
    public static void main(String[] args) {
        
        
        
        Productos cocaZero = new OtrosProductos("Coca-Cola Zero", "Litros: 1.5", 20);
        Productos coca = new OtrosProductos("Coca-Cola", "Litros: 1.5", 18);
        Productos shampooSedal = new OtrosProductos("Shampoo Sedal", "Contenido: 500ml", 19);
        Frutas frutilla = new Frutas ("Frutillas", 64, "kilo");
        
        items.add(cocaZero);
        items.add(coca);
        items.add(shampooSedal);
        items.add(frutilla);
        
        for (Productos items : items) {
            System.out.println(items.toString());
        }
        
        
        Ordenamiento ordenamiento = new Ordenamiento(items);
        ArrayList<Productos> productoOrdenado = ordenamiento.getProductosPorPrecio();
        
        System.out.println("==================================");
 
        System.out.println("Producto más caro: "+productoOrdenado.get(productoOrdenado.size()-1).getNombre()+"\n"
                            + "Producto más barato: "+productoOrdenado.get(0).getNombre());

        }
    }
    
   

