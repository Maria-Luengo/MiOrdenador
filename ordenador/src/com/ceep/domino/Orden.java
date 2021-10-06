
package com.ceep.domino;

public class Orden {
   private int idOrden;
   Computadora computadoras[];
   private static int contadorOrdenes;
   private static int contadorComputadoras;
   private final static int  maxComputadoras =20;

    public Orden() {
        computadoras = new Computadora[Orden.maxComputadoras];
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
       System.out.println("contador ordenes: "+ contadorOrdenes);
       System.out.println("contador computadoras: "+ contadorComputadoras);
   }
}
