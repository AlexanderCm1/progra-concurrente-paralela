package com.company;

import com.company.entity.Cajera;
import com.company.entity.CajeraThread;
import com.company.entity.Cliente;

public class ThreadMain {
    public static void main(String[] args) {
        //tiempo inicial de referencia
        long tiempoInicial = System.currentTimeMillis();

        // write your code here
        Cliente cliente1 = new Cliente("PANCHO",new int[] {2,2,1,5,2,3}); //15
        Cliente cliente2 = new Cliente("Juan", new int[] {1,3,5,1,1}); //11

        CajeraThread cajera1 = new CajeraThread("Cajera 01", cliente1,tiempoInicial);
        CajeraThread cajera2 = new CajeraThread("Cajer 02", cliente2, tiempoInicial);


        //inician al mismo instante
        System.out.println("---------- "+ tiempoInicial +" ---------");
        cajera1.start();
        cajera2.start();

    }
}
