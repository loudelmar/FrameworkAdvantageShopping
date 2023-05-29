Feature:

  Background:
  Given El Usuario ingresa en tarjeta ideal

  Scenario Outline: SC_002_01_TarjetaIdeal
    And El Usuario ingresa los datos en los campos de Solicitar Tarjeta Ideal "<pDatos>"
    Then El Usuario presiona checkbox
    Examples:
     |pDatos                                                                                        |
     |pPrimerNombre, pSegundoNombre, pPrimerApellido, pSegundoApellido, pFechaNacimiento, pHomoclave|

  Scenario Outline: SC_002_02_TarjetaIdeal
    And El Usuario ingresa los datos en los campos de Solicitar Tarjeta Ideal "<pDatos>"
    Then El Usuario presiona checkbox
    Examples:
      |pDatos                                                                                        |
      |pPrimerNombre, pSegundoNombre, pPrimerApellido, pSegundoApellido, pFechaNacimiento, pHomoclave|