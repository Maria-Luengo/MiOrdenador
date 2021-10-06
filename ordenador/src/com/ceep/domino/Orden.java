
package com.ceep.domino;

public class Orden {
   private int idOrden;
   Computadora computadoras[];
   private static int contadorOrdenes;
   private static int contadorComputadoras;
   private static int  maxComputadoras;

    public Orden() {
        Orden computadoras[] = new Orden[Orden.maxComputadoras];
    }
   
   public void agregarComputadoras(Computadora ordenador){
       if(Orden.contadorComputadoras<Orden.maxComputadoras){
           computadoras[Orden.contadorOrdenes++] = ordenador;
       }else{
           System.out.println("Has alcanzado el máximo");
       }
       
   }
   
   public void mostrarOrden(){
       System.out.println("idOrden: "+ idOrden);
   }
}
