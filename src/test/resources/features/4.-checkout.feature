#language: es
@checkout
Característica: Checkout avanzado en la tienda

  Como cliente
  Quiero realizar pagos con diferentes configuraciones
  Para confirmar mis pedidos correctamente

  Antecedentes:
    Dado que el usuario ha iniciado sesión con el correo y contraseña valida

  Escenario: Checkout con dirección de facturación diferente a la de envío
    Dado que el carrito contiene el producto "Bolso de Cuero"
    Cuando el usuario indica una dirección de facturación diferente a la de envío
    Y completa el checkout
    Entonces el sistema confirma el pedido con las direcciones registradas correctamente

  Escenario: Checkout aplicando un cupón de descuento
    Dado que el carrito contiene el producto "Zapatos Deportivos"
    Cuando el usuario aplica el cupón "VERANO20"
    Entonces el total del pedido refleja un 20% de descuento

  Escenario: Checkout seleccionando diferentes métodos de envío
    Dado que el carrito contiene el producto "Pantalón Jeans"
    Cuando el usuario elige el envío "Express 24h"
    Entonces el total del pedido incluye el costo del envío express

  Escenario: Checkout con fallo en el pago y reintento
    Dado que el carrito contiene el producto "Reloj Digital"
    Cuando el usuario intenta pagar con una tarjeta sin fondos
    Entonces el sistema muestra un mensaje de error de pago
    Y el usuario puede reintentar con otra tarjeta exitosa