
# SpeedFast 🚀📦

Sistema de gestión de pedidos desarrollado en Java. Simula la asignación de repartidores para distintos tipos de pedido (comida, encomiendas y compras express), aplicando conceptos de Programación Orientada a Objetos.

## 📋 Descripción

El sistema modela distintos tipos de pedido a partir de una clase base común (`Pedido`), donde cada tipo especializa el proceso de asignación de repartidor según sus propias reglas de negocio (ej: verificar mochila térmica para pedidos de comida, validar peso y embalaje para encomiendas).

## 🧠 Conceptos de POO aplicados

- **Herencia**: `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` heredan de la clase base `Pedido`.
- **Sobrecarga de métodos (overloading)**: `Pedido` define dos versiones de `asignarRepartidor()`, una sin parámetros y otra que recibe el nombre del repartidor.
- **Sobrescritura de métodos (overriding)**: cada subclase redefine ambas versiones de `asignarRepartidor()` con `@Override`, agregando su propia lógica antes de delegar en la clase padre mediante `super`.
- **Polimorfismo**: en `Main`, los objetos se declaran con el tipo de la clase base (`Pedido pedido1 = new PedidoComida(...)`), pero al invocar `asignarRepartidor()` se ejecuta el comportamiento específico de cada subclase.

## 📂 Estructura del proyecto

```
src/main/java/com/duoc/speedfast/
├── data/
│   └── Pedido.java              # Clase base
├── model/
│   ├── PedidoComida.java        # Hereda de Pedido
│   ├── PedidoEncomienda.java    # Hereda de Pedido
│   └── PedidoExpress.java       # Hereda de Pedido
└── ui/
    └── Main.java                # Punto de entrada del programa
```


## ▶️ Clonar  

https://github.com/pablo-psr/SpeedFast.git
```

## 🖥️ Ejemplo de salida

```
[Pedido Comida]
Asignando repartidor...
→ Verificando mochila térmica... OK
→ Pedido asignado a Juan Pérez

[Pedido Encomienda]
Asignando repartidor...
→ Validando peso y embalaje... OK
→ Pedido asignado a Camila Soto

[Pedido Express]
Asignando repartidor...
→ Repartidor más cercano con disponibilidad inmediata encontrado.
→ Pedido asignado a Luis Díaz
```

## 👤 Autor

Pablo Sepulveda
