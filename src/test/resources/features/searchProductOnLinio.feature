#language: es
Característica: Buscar en Linio
Yo como usuario de linio deseo tener informacion sobre un producto en la aplicacion
para realizar una futura  compra

@SEARCH_LINIO
Esquema del escenario:  Buscar los videos y validar el resultado
Dado que estoy en el Home de Linio
Cuando selecciono la barra de busqueda e ingreso un producto "<producto>"
Y selecciono el segundo item del combo con los resultados
Y seleccionamos el primer elemento que nos muestra en la pagina de resultados de busqueda
Y agregamos al carrito de compras dicho elemento seleccionado
Y vamos a nuestro carrito de compras para visualizar elemento
Entonces visualizamos nuestro producto seleccionado con sus detalles

Ejemplos:
  | producto      |
  | Laptop        |
  | Silla Oficina |
  | Escritorio    |
