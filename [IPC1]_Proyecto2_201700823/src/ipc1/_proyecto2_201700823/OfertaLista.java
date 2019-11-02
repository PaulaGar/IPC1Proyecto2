/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1._proyecto2_201700823;

/**
 *
 * @author Paula
 */
public class OfertaLista {
    //objetos clase nodo oferta
    NodoO inicio;
    
    //constructor
    public OfertaLista (){
    //inicializo el inicio a nullo 
    inicio = null;
    }
    
    public void agregar (Oferta o){
        NodoO temporal;
        temporal = new NodoO(o);
   if (inicio==null){
    inicio=temporal;
    inicio.siguiente= null;
    }
   else{
       NodoO aux;
       aux=inicio;
       while(aux.siguiente!=null){
       aux = aux.siguiente;
       }
       aux.siguiente = temporal;
   }   
   
    }
    
    
    
    
    
}//Termina
