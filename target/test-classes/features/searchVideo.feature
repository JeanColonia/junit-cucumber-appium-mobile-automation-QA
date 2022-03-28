#language: es
Característica: Buscar en Youtube
  Yo como usuario de youtube quiero buscar un video en la aplicacion
  para encontrar mi video favorito

  @SEARCH_VIDEO
  Esquema del escenario:  Buscar los videos y validar el resultado
    Dado que me encuentro en la aplicacion de youtube
    Cuando busco el video "<video>"
    Entonces deberia obtener mas de un resultado

    Ejemplos:
      | video               |
      | Appium Tutorial     |
      | Selenium Tutorial   |
      | Cypress vs Selenium |


