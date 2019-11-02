package ipc1._proyecto2_201700823;

/**
 *
 * @author Paula
 */
public class ColaN {
    NodoN inicio;
    
    public ColaN (){
    inicio=null;
    
    }    
    
      public void agregarnombre (String nombre){
        NodoN temporal;
        temporal = new NodoN(nombre);
   if (inicio==null){
    inicio=temporal;
    inicio.siguiente= null;
    }
   else{
       NodoN aux;
       aux=inicio;
       while(aux.siguiente!=null){
       aux = aux.siguiente;
       }
       aux.siguiente = temporal;
   }   
   
    }
    
}
