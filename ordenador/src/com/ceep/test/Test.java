package com.ceep.test;

import com.ceep.domino.*;

public class Test {

    public static void main(String[] args) {
        //Creamos los objetos
        Raton r1 = new Raton("Usb", "Hp");
        Teclado t1 = new Teclado("Pin", "Hp");
        Monitor m1 = new Monitor("LG", 21.5);
        Teclado t2 = new Teclado("bloethot", "logitech");
        System.out.println("t2 = " + t2);

        Computadora c1 = new Computadora("pc1", m1, t2, r1);

        //Agregamos un ordenado
        Orden o1 = new Orden();
        o1.agregarComputadoras(c1);
        o1.mostrarOrden();
    }

}
