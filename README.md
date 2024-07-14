
# AluraLatam-Literalura


## Proposito

Se busca mediante este proyecto el desarrollar el backend para consultar a un API REST como es Gutendex,  registrar los datos consultados a una base de datos utilizando PostgreSQL y hacer consultas a los datos registrado en la base dedatos.

## Referencia de la API (https://gutendex.com) utilizada.


```http
  GET https://gutendex.com/books
```


**Ejemplo**

```http
  GET https://gutendex.com/books?search=romeo%20and%20juliet
```
## Caracteristicas

- Consulta HTTP a endpoint.
- Guardado de datos de libros.
- Guardado de datos de autores.
- Consulta a datos guardados **(Autores y libros)**


## Uso 

- **Es necesario instalar las dependencias primarias como Java (JDK 17 )**




En  consola se mostrara el siguiente menu
```Java
----------------------------------------------
Literalura

1 - Buscar libro por titulo
2 - Lista libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un determinado año
5 - Listar libros por idiomas


0 - Salir
----------------------------------------------

## Autor

- Giovanni Roque
