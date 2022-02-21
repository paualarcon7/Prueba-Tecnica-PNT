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

        /*Producto producto = new Producto();
        producto.setNombre("Coca-Cola Zero");
        producto.setContenido("1.5");
        producto.setPrecio(20);
        
        
        Producto producto1 = new Producto();
        producto1.setNombre("Coca-Cola");
        producto1.setCantidad("1.5");
        producto1.setPrecio(18);
        
        
        Producto producto3 = new Producto();
        producto3.setNombre("Shampoo Sedal");
        producto3.setContenido("500");
        producto3.setPrecio(19);
        
        
        Producto producto4 = new Producto();
        producto4.setNombre("Frutillas");
        producto4.setCantidad(1);
        producto4.setPrecio(64);
        
        
        
        System.out.println(producto);
        System.out.println("==================================");
        
        
       List<Producto> listaDeProductos = new ArrayList<>();
      /* listaDeProductos.add(new Producto ("Coca-Cola Zero",1.5,20,"Litros"));
       listaDeProductos.add(new Producto ("Coca-Cola",1.5,18,"Litros"));
       listaDeProductos.add(new Producto ("Shampoo Sedal",500,19,"ml"));
       listaDeProductos.add(new Producto ("Frutillas",1,64,"kilo"));*/
       
       
        
       
        
      /*  for(Producto producto : listaDeProductos){
            System.out.println("");
            System.out.println("Nombre: " + producto1.getNombre());
            System.out.println(producto1.getUnidad() +": " + producto1.getCantidad());
            System.out.println("Precio: $" + producto1.getPrecio());
            
            System.out.println("");
            System.out.println("Nombre: " + producto2.getNombre());
            System.out.println(producto2.getUnidad()+": " + producto2.getCantidad());
            System.out.println("Precio: $" + producto2.getPrecio());
            
            System.out.println("");
            System.out.println("Nombre: " + producto3.getNombre());
            System.out.println("Precio: $" + producto3.getPrecio());
            System.out.println("Contenido: " + producto3.getContenido() + producto3.getUnidad());
            
            System.out.println("");
            System.out.println("Nombre: " + producto4.getNombre());
            System.out.println("Precio: $" + producto4.getPrecio());
            System.out.println("Unidad de venta: " + producto4.getUnidad());*/
            
        }
    }
    
   

