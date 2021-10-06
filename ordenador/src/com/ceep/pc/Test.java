package com.ceep.pc;

import com.ceep.domino.*;

public class Test {

    public static void main(String[] args) {
        //Creamos los objetos
        Raton r1 = new Raton("Usb", "Hp");
        Teclado t1 = new Teclado("Pin", "Hp");
        Monitor m1 = new Monitor("LG", 21.5);

        Computadora c1 = new Computadora(m1, t1, r1);
        
        Orden o1 = new Orden();
        o1.agregarComputadoras(c1);
        o1.mostrarOrden();
    }

}
