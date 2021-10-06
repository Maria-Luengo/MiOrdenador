package com.ceep.domino;

public class Orden {

    private final int idOrden;
    Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private final static int maxComputadoras = 4;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[Orden.maxComputadoras];
        Orden.contadorComputadoras=0; //No pongo this xq es static 
    }

    public void agregarComputadoras(Computadora ordenador) {
        if (Orden.contadorComputadoras < Orden.maxComputadoras) {
            computadoras[Orden.contadorComputadoras] = ordenador;
        } else {
            System.out.println("Has alcanzado el máximo ("+maxComputadoras+")");
        }
    }

    public void mostrarOrden() {
        System.out.println("idOrden: " + this.idOrden); //se puede poner this por buena práctica
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
