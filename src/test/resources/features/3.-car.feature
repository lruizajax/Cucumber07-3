#language: es
@car
Característica: Manejo del carrito de compras

  Como usuario autenticado
  Quiero administrar mi carrito
  Para preparar mis compras antes del checkout

  Antecedentes:
    Dado que el usuario ha iniciado sesión con el correo y contraseña valida

  Escenario: Añadir múltiples cantidades del mismo producto
    Cuando el usuario añade 3 unidades del producto "Camiseta Negra" al carrito
    Entonces el carrito muestra el producto con cantidad "3" y subtotal actualizado

  Escenario: Eliminar un producto del carrito
    Dado que el carrito contiene el producto "Camiseta Negra"
    Cuando el usuario elimina el producto
    Entonces el carrito queda vacío y muestra el mensaje "Tu carrito está vacío"

  Escenario: Actualizar cantidad del producto desde el carrito
    Dado que el carrito contiene el producto "Zapatos Deportivos" con cantidad "1"
    Cuando el usuario actualiza la cantidad a "2"
    Entonces el carrito muestra el subtotal actualizado correctamente

  Escenario: Vaciar completamente el carrito
    Dado que el carrito contiene varios productos
    Cuando el usuario selecciona "Vaciar carrito"
    Entonces el carrito muestra el mensaje "Tu carrito está vacío"