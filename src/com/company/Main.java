package com.company;
//concurrente
import com.company.entity.Cajera;
import com.company.entity.Cliente;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente("PANCHO",new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Juan", new int[] {1,3,5,1,1});

        Cajera cajera1 = new Cajera("Cajera 01");
        Cajera cajera2 = new Cajera("Cajer 02");

        //tiempo inicial de referencia
        long tiempoInicial = System.currentTimeMillis();
        System.out.println("---------- "+ tiempoInicial +" ---------");
        cajera1.procesarCompra(cliente1, tiempoInicial);
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }
}
