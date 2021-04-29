package com.company;

import com.company.entity.Cajera;
import com.company.entity.Cliente;

public class RunnableMain implements Runnable{


    private Cliente cliente;
    private Cajera cajera;
    private long tiempoInicial;

    public RunnableMain(Cliente cliente, Cajera cajera, long tiempoInicial) {
        this.cliente = cliente;
        this.cajera = cajera;
        this.tiempoInicial = tiempoInicial;
    }

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("PANCHO",new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Juan", new int[] {1,3,5,1,1});

        Cajera cajera1 = new Cajera("Cajera 01");
        Cajera cajera2 = new Cajera("Cajer 02");

        long tiempoInicial = System.currentTimeMillis();

        Runnable proceso1 = new RunnableMain(cliente1,cajera1,tiempoInicial);
        Runnable proceso2 = new RunnableMain(cliente2,cajera2,tiempoInicial);

        new Thread(proceso1).start();
        new Thread(proceso2).start();
    }

    @Override
    public void run() {
        this.cajera.procesarCompra(cliente,tiempoInicial);
    }
}
