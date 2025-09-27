#language: es
@profile
Característica: Administración del perfil de usuario

  Como usuario registrado
  Quiero poder actualizar mis datos
  Para mantener mi información al día

  Antecedentes:
    Dado que el usuario ha iniciado sesión con el correo y contraseña valida

  Escenario: Actualizar datos del perfil
    Cuando el usuario modifica su nombre y teléfono en la sección de perfil
    Entonces el sistema guarda los cambios y muestra un mensaje de confirmación

  Escenario: Cambiar contraseña desde el panel de usuario
    Cuando el usuario accede a la opción "Cambiar contraseña"
    Y establece una nueva clave segura
    Entonces el sistema confirma que la contraseña fue actualizada correctamente