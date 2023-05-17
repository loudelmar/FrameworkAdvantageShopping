Feature:

  Background:
  Given El Usuario se loguea en el Home Page

  Scenario Outline: SC_001_01_EnviarMensaje
    And El Usuario ingresa los datos en los campos de Contactanos "<pDatos>"
    Then El Ususario presiona el botón Enviar
    Examples:
     |pDatos                                                                                                                                   |
     |pNombre, pApellidoPa, pApellidoMa, pEmail, pTelefono, pFax, pDomicilio, pRegion, pCP, pPais, pEstado, pAsunto, pEspecifique, pComentarios|