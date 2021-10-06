package com.ceep.domino;

public class DispositivoEntrada  {

    protected String tipoEntrada; //podemos poner protected
    protected String marca;

    //constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //G&S
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "tipoEntrada=" + tipoEntrada + ", marca=" + marca ;
    }

}
