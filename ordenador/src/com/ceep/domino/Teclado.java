
package com.ceep.domino;

//Agrega a Dispositivos de entrada
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private int contadorTeclado;

    public Teclado(int idTeclado, int contadorTeclado, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        this.contadorTeclado = ++contadorTeclado;
    }

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    
    

    

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    
}
