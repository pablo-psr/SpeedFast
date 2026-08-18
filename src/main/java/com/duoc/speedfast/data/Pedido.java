package com.duoc.speedfast.data;

public class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;
    protected String nombreRepartidor; // Agrupado aquí

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método básico/genérico
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor genérico...");
    }

    // Método sobrecargado
    public void asignarRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
        System.out.println("→ Pedido asignado a " + this.nombreRepartidor);
    }

    // Getters y Setters
    public int getIdPedido() { return idPedido; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public String getTipoPedido() { return tipoPedido; }
    public String getNombreRepartidor() { return nombreRepartidor; }
}