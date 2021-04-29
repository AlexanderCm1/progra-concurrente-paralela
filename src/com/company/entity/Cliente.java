package com.company.entity;

public class Cliente {
    private String nombre;
    private int[] carritoCompra;

    public String getNombre() {
        return nombre;
    }

    public int[] getCarritoCompra() {
        return carritoCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarritoCompra(int[] carritoCompra) {
        this.carritoCompra = carritoCompra;
    }

    public Cliente(String nombre, int[] carritoCompra) {
        this.nombre = nombre;
        this.carritoCompra = carritoCompra;
    }
}
