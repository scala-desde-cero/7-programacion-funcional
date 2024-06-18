# 7-programacion-funcional

1. [High Order Functions](#schema1)
20 [Funciones anónimas. Functions Literals](#schema2)


<hr>

<a name="schema1"></a>

## 1. High Order Functions

![](./img/intro.png)

Esto proporciona una manera flexible de componer programas.


<hr>

<a name="schema2"></a>

## 2. Funciones anónimas. Functions Literals

En Scala, las funciones anónimas, también conocidas como funciones lambda o literales de función, son funciones que no tienen nombre y se definen en el lugar donde se utilizan. Estas funciones son útiles para operaciones rápidas y sencillas, como pasar una función como argumento a otro método o trabajar con colecciones.

### **Sintaxis Básica**
La sintaxis básica de una función anónima es:

```scala
(valores_de_entrada) => cuerpo_de_la_función
```
### **Ejemplos de Uso**
1. Función Anónima Básica
```scala
val suma = (a: Int, b: Int) => a + b
println(suma(3, 4))  // Output: 7
```
2. Usando Funciones Anónimas con Colecciones
Las funciones anónimas son frecuentemente utilizadas con métodos de colecciones como map, filter, y reduce.

```scala
val numeros = List(1, 2, 3, 4, 5)

// Usando una función anónima con map
val cuadrados = numeros.map(x => x * x)
println(cuadrados)  // Output: List(1, 4, 9, 16, 25)

// Usando una función anónima con filter
val pares = numeros.filter(x => x % 2 == 0)
println(pares)  // Output: List(2, 4)

// Usando una función anónima con reduce
val sumaTotal = numeros.reduce((a, b) => a + b)
println(sumaTotal)  // Output: 15
```
### **Sintaxis Abreviada**
Scala permite una sintaxis abreviada para funciones anónimas, especialmente útil con colecciones. Si el tipo de los parámetros puede ser inferido, no es necesario declararlos explícitamente.

```scala
val cuadrados = numeros.map(_ * _)
println(cuadrados)  // Output: List(1, 4, 9, 16, 25)
```
### **Funciones Literales**
Una función literal es simplemente una función anónima que se puede pasar como argumento o asignar a una variable. En realidad, la función anónima y el literal de función son la misma cosa en Scala.

```scala
val multiplicarPorDos = (x: Int) => x * 2
println(multiplicarPorDos(5))  // Output: 10
```
### **Funciones de Orden Superior**
Las funciones de orden superior son funciones que toman otras funciones como argumentos o devuelven funciones como resultado. Esto es muy poderoso para crear abstracciones y reducir el código repetitivo.

```scala
def aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) => Int): Int = {
  operacion(a, b)
}

val suma = (a: Int, b: Int) => a + b
val resta = (a: Int, b: Int) => a - b

println(aplicarOperacion(5, 3, suma))  // Output: 8
println(aplicarOperacion(5, 3, resta))  // Output: 2
```
### **Ventajas de las Funciones Anónimas**
1. Concisas: Eliminan la necesidad de definir funciones explícitas por separado, lo que hace el código más corto y claro.
2. Flexibles: Pueden ser usadas en cualquier lugar donde se necesite una función, sin la necesidad de asignar un nombre.
3. Expresivas: Permiten escribir expresiones funcionales complejas de manera más natural.
### **Resumen**
- Funciones Anónimas: Son funciones sin nombre que se definen en el lugar donde se necesitan.
- Sintaxis: (parametros) => cuerpo.
- Uso Común: Métodos de colecciones (map, filter, reduce) y funciones de orden superior.
- Ventajas: Código más conciso, flexible y expresivo.

Las funciones anónimas son una característica poderosa en Scala, que permiten un estilo de programación funcional más limpio y directo.






