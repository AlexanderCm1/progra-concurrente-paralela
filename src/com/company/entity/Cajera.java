package com.company.entity;

public class Cajera {

    private String nombre;

    public Cajera(){

    }

    public Cajera(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCompra(Cliente cliente, long tiempoStamp){
        System.out.println("La cajera "+ this.nombre
        + "Comienza a procesar la compra del cliente" + cliente.getNombre()
        + "en el timepo "+ (System.currentTimeMillis() - tiempoStamp)/ 1000 + "seg");

        for (int i = 0; i < cliente.getCarritoCompra().length; i++){
            esperarXsegundo(cliente.getCarritoCompra()[i]);
            //x cada producto un segundo(un retardo)
            System.out.println("Procesando el producto" + (i + 1) + "> en el tiempo :"
            + (System.currentTimeMillis() - tiempoStamp)/1000 + "seg");

        }
        System.out.println("La cajera" + this.nombre + " Ha terminado de procesar la compra de "
        + cliente.getNombre() + "En el tiempo " + (System.currentTimeMillis() - tiempoStamp)/1000 +"seg");
    }
    //crear un retardo en segundos entre cada ejecucion
    public void esperarXsegundo(int segundos) {

        try{
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();

        }
    }
}
