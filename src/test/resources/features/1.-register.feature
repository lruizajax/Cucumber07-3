#language:es
@registro
Característica: Registro de nuevos usuarios

    Como visitante del sitio
    Quiero poder crear mi cuenta
    Para realizar compras en la tienda en línea

  Esquema del escenario:  registro de nuevos usuarios
    Dado el visitante esta en la pagina de registro "https://magento.softwaretestingboard.com/customer/account/create/"
    Cuando el visitante completa la informacion de registro "<Firstname>" "<Lastname>" "<Email>" "<Password>"
    Entonces el visitante deberia tener su cuenta creada
    Ejemplos:
    |Firstname | Lastname | Email | Password |
    |John      |Dam       |jdam260625@gmail.com|testPass1|
    |Jhon      |Smith|jsmith@email.com|testPass2|
    |Rutd|Karl|rkarl@email.com|testPass3|
    |Anne|Merl|amerl@email.com|testPass4|

  Esquema del escenario: Registro con correo ya existente
    Dado el visitante está en la página de registro "https://magento.softwaretestingboard.com/customer/account/create/"
    Cuando el visitante completa el formulario con un correo ya registrado "<Firstname>" "<Lastname>" "<Email>" "<Password>"
    Entonces el sistema debe mostrar un mensaje indicando que el correo ya está registrado
    Ejemplos:
      | Firstname | Lastname | Email                   | Password  |
      | Juan      | Perez    | nicoruiz23@gmail.com    | TestPass1 |

  Escenario: Registro con campos obligatorios vacíos
    Dado el visitante está en la página de registro "https://magento.softwaretestingboard.com/customer/account/create/"
    Cuando el visitante intenta registrar sin completar los campos obligatorios
    Entonces el sistema muestra mensajes de error indicando los campos requeridos

  Escenario: Registro con email inválido
    Dado el visitante está en la página de registro "https://magento.softwaretestingboard.com/customer/account/create/"
    Cuando el visitante ingresa un email inválido "juan#correo.com"
    Entonces el sistema muestra un mensaje de error sobre el formato del email

  Escenario: Registro con contraseña débil
    Dado el visitante está en la página de registro "https://magento.softwaretestingboard.com/customer/account/create/"
    Cuando el visitante ingresa una contraseña débil "1234"
    Entonces el sistema muestra un mensaje indicando que la contraseña no cumple con los requisitos