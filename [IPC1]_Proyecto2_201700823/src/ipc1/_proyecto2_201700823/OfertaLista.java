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
    int tamaño=0;
    
    //constructor
    public OfertaLista (){
    //inicializo el inicio a nullo 
    inicio = null;
    }
    
    public void agregar (Oferta o){
        NodoO temporal;
        temporal = new NodoO(o);
        tamaño++;
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
    
    public void eliminaroferta(){
        tamaño --;
        inicio = inicio.siguiente;
        
    }
    
    public double buscarid(int idp, double pp){
    NodoO buscar = inicio;
    double np; //nuevo precio
    for(int m=0; m<tamaño; m++){
    if (idp==buscar.oferta.id){
    np=pp-(pp*buscar.oferta.descuento);
    
    return np;  
    
    }//fin if
    buscar=buscar.siguiente;
    }//fin for
    return pp;
    
    }//fin met
    
    
    
    
}//Termina
