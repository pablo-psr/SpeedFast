package com.duoc.speedfast.ui;

import com.duoc.speedfast.data.Pedido;
import com.duoc.speedfast.model.PedidoComida;
import com.duoc.speedfast.model.PedidoEncomienda;
import com.duoc.speedfast.model.PedidoExpress;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: La referencia es de la clase base Pedido (ubicada en data)
        Pedido pedido1 = new PedidoComida(101, "Av. Providencia 1234");
        Pedido pedido2 = new PedidoEncomienda(102, "Calle Las Condes 567");
        Pedido pedido3 = new PedidoExpress(103, "Av. Vitacura 890");

        // Ejecución de métodos sobrecargados y sobrescritos
        pedido1.asignarRepartidor("Juan Pérez");
        System.out.println();

        pedido2.asignarRepartidor("Camila Soto");
        System.out.println();

        pedido3.asignarRepartidor("Luis Díaz");
    }
}