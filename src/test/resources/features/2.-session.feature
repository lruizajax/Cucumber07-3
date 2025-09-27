#language:es
@sesion
  Característica: iniciar session

    Como  ...luis
    Quiero  ... iniciar session
    Para ... actualizar datos

    Esquema del escenario:  iniciar sesion con credenciales validas
      Dado el usuario esta en la pagina de inicio de session "https://magento.softwaretestingboard.com/customer/account/login/"
      Cuando el usuario ingresa su "<correo>" y "<clave>" validos
      Entonces el usuario deberia visualizar el panel de control
      Ejemplos:
      | correo                 | clave        |
      | nicoruiz23@gmail.com   | Humy!b$KTrV2 |
      | admin                  | Admin321     |

    Escenario: inicio de sesion con credenciales validas usando data table
      Dado el usuario esta en la pagina de inicio de session "https://magento.softwaretestingboard.com/customer/account/login/"
      Cuando el usuario ingresa sus credenciales validas
        | nicoruiz23@gmail.com   | Humy!b$KTrV2 |
        | admin                  | Admin321     |
      Entonces el usuario deberia visualizar el panel de control

    Escenario: Inicio de sesión con contraseña incorrecta
      Dado el usuario está en la página de inicio de sesión "https://magento.softwaretestingboard.com/customer/account/login/"
      Cuando el usuario ingresa su correo "nicoruiz23@gmail.com" y una clave incorrecta "ClaveMala123"
      Entonces el sistema muestra un mensaje indicando que el usuario o contraseña son incorrectos

    Escenario: Inicio de sesión con campos vacíos
      Dado el usuario está en la página de inicio de sesión "https://magento.softwaretestingboard.com/customer/account/login/"
      Cuando el usuario intenta iniciar sesión sin completar los campos
      Entonces el sistema muestra mensajes indicando los campos obligatorios

    Escenario: Recuperación de contraseña
      Dado el usuario está en la página de inicio de sesión "https://magento.softwaretestingboard.com/customer/account/login/"
      Cuando el usuario selecciona la opción "¿Olvidaste tu contraseña?"
      Y ingresa su correo "nicoruiz23@gmail.com" para restablecer
      Entonces el sistema envía un correo para recuperación de contraseña
