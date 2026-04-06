##  Expresiones Lambda y Streams en Java

###  Expresiones Lambda

Las expresiones lambda, introducidas en Java 8, permiten definir funciones anónimas de forma concisa. Se utilizan principalmente para implementar interfaces funcionales y escribir código más limpio y legible.

**Sintaxis básica:**

```java
(parametros) -> expresion
```

**Ejemplo:**

```java
(x, y) -> x + y
```

---

### 🔹 Streams

Los Streams representan una secuencia de datos que permite procesar colecciones de manera declarativa y funcional, sin modificar la estructura original.

---

###  Operaciones en Streams

* **Intermedias:** transforman el stream y permiten encadenamiento

  * `filter()` → filtrar elementos
  * `map()` → transformar datos
  * `sorted()` → ordenar

* **Terminales:** producen un resultado final

  * `forEach()` → recorrer elementos
  * `collect()` → recopilar resultados
  * `count()` → contar elementos

---

###  Ejemplo de uso

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

numeros.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 2)
    .forEach(System.out::println);
```

---

###  Resumen

* Las **lambdas** simplifican la escritura de funciones.
* Los **streams** permiten procesar datos de forma eficiente y expresiva.
* Juntos, facilitan un estilo de programación funcional en Java.
