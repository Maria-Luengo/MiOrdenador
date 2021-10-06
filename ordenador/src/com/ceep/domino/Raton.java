package com.ceep.domino;

//Agrega a Dispositivos de entrada
public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString()+"idRaton=" + idRaton;
        //añadimos el toString de la clase padre
    }
}
