
package com.ceep.domino;

//Agrega a Dispositivos de entrada
public class Raton extends DispositivoEntrada{
    
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca, int contadorRatones) {
        super(tipoEntrada, marca);
        this.contadorRatones=++Raton.contadorRatones;
    }
    
    public Raton(int idRaton, int contadorRatones, String tipoEntrada, String marca) {
        
        super(tipoEntrada, marca);
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    
    

    

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
    
    
}
