package ipc1._proyecto2_201700823;

/**
 *
 * @author Paula
 */
public class UsuariosLista {
    //creo el inicio y el final
    NodoU inicio;
    NodoU fin;
    int tamaño; 
    
    public UsuariosLista(){    
    //al inicio es una lista vacia asi que inicio y fin son nulos
        inicio=null;
        fin=null;
    }
    
    public boolean isEmpty (){
    return tamaño ==0;
    }
    
    public int size(){
    return tamaño;
    }
    
    public void insertar (Usuarios u){
        //objeto tipo nodo
        NodoU nodo= new NodoU(u);
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
    
     public Usuarios buscar(String nickname){
        Usuarios vacio = new Usuarios(); 
        Usuarios perdido = new Usuarios();
      vacio=null;
      perdido=null;
    if (isEmpty()) return vacio;
    NodoU aux = inicio;
    do{
    if(aux.usuario.nickname==nickname){
    return aux.usuario;
    }
    aux=aux.siguiente;
    }while(aux!=inicio);
    return perdido;
   
    }
     
      public void eliminar (String nickname){
    tamaño--; 
    NodoU x = inicio;
    NodoU y = fin;
    do{
        if(x.usuario.nickname==nickname){
        //aqui se cambia el puntero
        y.siguiente=x.siguiente; 
        }
        //en caso de que el id no sea el mismo se tiene que pasar al siguiente 
        x=x.siguiente;
    }while(x!=inicio);
    
    }
    
}
