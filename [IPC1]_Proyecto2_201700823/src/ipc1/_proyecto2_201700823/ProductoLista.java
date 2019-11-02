package ipc1._proyecto2_201700823;

/**
 *
 * @author Paula
 */
public class ProductoLista {
    //objetos de la clase nodos
    NodoP inicio;
    NodoP fin;
    //variable del contador del id
    int tamaño;
    
    //constructor
    public ProductoLista(){
    inicio= null;
    fin= null;
    tamaño=0;
    }
    
    public boolean isEmpty (){
    return tamaño ==0;
    }
    
    public int size(){
    return tamaño;
    }
    
    public void insertar (Producto p){
        //objeto tipo nodo
        NodoP nodo= new NodoP(p);
        tamaño++;
        
        if (inicio==null){
        inicio = nodo;
        fin = nodo;                 
        }
        else {
        fin.siguiente = nodo;   // para que el nuevo sea el nodo
        fin = nodo;             // para que el nuevo se conozca como el final
        fin.siguiente = inicio; //para hacerlo circular       
        }
    }
    
    public Producto buscar(int id){
      Producto vacio = new Producto(); 
      Producto perdido = new Producto();
      vacio=null;
      perdido=null;
    if (isEmpty()) return vacio;
    NodoP aux = inicio;
    do{
    if(aux.producto.id==id){
    return aux.producto;
    }
    aux=aux.siguiente;
    }while(aux!=inicio);
    return perdido;
    
    }
    
    public Producto buscarnombre(String nombre){
      Producto vacio = new Producto(); 
      Producto perdido = new Producto();
      vacio=null;
      perdido=null;
    if (isEmpty()) return vacio;
    NodoP aux = inicio;
    do{
        System.out.println(aux.producto.nombre);
    if(aux.producto.nombre.equals(nombre)){
    return aux.producto;
    }
    aux=aux.siguiente;
    }while(aux!=inicio);
    return perdido;
    
    }
    
    public void eliminar (int id){
    tamaño--; 
    NodoP eliminar = inicio;
    NodoP anterior = fin;
    if (anterior!=inicio){
    do{
        if(eliminar.producto.id==id){
        //aqui se cambia el puntero
        anterior.siguiente=eliminar.siguiente; 
        }
        //en caso de que el id no sea el mismo se tiene que pasar al siguiente 
        eliminar=eliminar.siguiente;
        anterior=anterior.siguiente;
    }while(eliminar!=inicio);
    }//FIN DEL IF
    else {
    inicio= inicio.siguiente;
    fin.siguiente = inicio;
    eliminar.siguiente = null;
    
    
    }
    //fin = anterior;
    //inicio = eliminar;
    inicio = anterior;
    
    
   
    }
    
    
    
}//FIN CLASE
