
package com.ceep.domino;


public class Monitor{
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //constructores
    public Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    
    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    //set de idMonitor me da error
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", contadorMonitores=" + contadorMonitores + '}';
    }
    
    
}
