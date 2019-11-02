package ipc1._proyecto2_201700823;

/**
 *
 * @author Paula
 */
public class Producto {
   public int id;
   public String nombre;
   public String desc;
   public double precio;
   public  int existencia;
   public String dirimagen;
    
    
    static int contador =1;
    
    //constructor
    public Producto (){
    id = Producto.contador++;// pero esto solo es para el id
    }

   
    
    
}
