#language: es
@order
Característica: Visualización y gestión de órdenes

  Como usuario comprador
  Quiero consultar y gestionar mis órdenes
  Para tener control de mis compras

  Antecedentes:
    Dado que el usuario ha iniciado sesión con el correo y contraseña valida

  Escenario: Ver historial de pedidos
    Cuando el usuario accede a la sección "Mis pedidos"
    Entonces puede visualizar la lista de pedidos realizados

  Escenario: Ver detalles de un pedido específico
    Dado que el usuario tiene al menos un pedido en el historial
    Cuando selecciona el pedido más reciente
    Entonces se muestra el detalle del pedido con productos, precios y dirección

  Escenario: Cancelar un pedido antes de ser enviado
    Dado que el usuario tiene un pedido con estado "Procesando"
    Cuando el usuario solicita la cancelación
    Entonces el pedido se cancela y el usuario recibe una confirmación