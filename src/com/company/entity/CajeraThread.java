package com.company.entity;

public class CajeraThread extends  Thread{

    private String nombre;
    private Cliente cliente;
    private long tiempoStamp;


    public CajeraThread(){

    }
    public CajeraThread(String nombre, Cliente cliente, long tiempoStamp) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoStamp = tiempoStamp;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getTiempoStamp() {
        return tiempoStamp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTiempoStamp(long tiempoStamp) {
        this.tiempoStamp = tiempoStamp;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("La cajera "+ this.nombre
                + "Comienza a procesar la compra del cliente" + cliente.getNombre()
                + "en el timepo "+ (System.currentTimeMillis() - tiempoStamp)/ 1000 + "seg");

        for (int i = 0; i < cliente.getCarritoCompra().length; i++){
            esperarXsegundo(cliente.getCarritoCompra()[i]);
            //x cada producto un segundo(un retardo)
            System.out.println("Procesando el producto" + (i + 1) + " > del cliente "+ cliente.getNombre() +" en el tiempo :"
                    + (System.currentTimeMillis() - tiempoStamp)/1000 + "seg");
        }

        System.out.println("La cajera" + this.nombre + " Ha terminado de procesar la compra de "
                + cliente.getNombre() + "En el tiempo " + (System.currentTimeMillis() - tiempoStamp)/1000 +"seg");
    }


    public void esperarXsegundo(int segundos) {
        try{
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();

        }
    }

}
