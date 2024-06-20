package app

object FuncionesComoVariables {

  // Definimos una función y la asignamos a una variable
  val multiplicar = (a: Int, b: Int) => a * b

  // Una función que recibe otra función como parámetro
  def aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) => Int): Int = {
    operacion(a, b)
  }

  // Una función que devuelve otra función
  def obtenerOperacion(operacion: String): (Int, Int) => Int = {
    operacion match {
      case "suma" => (a: Int, b: Int) => a + b
      case "resta" => (a: Int, b: Int) => a - b
      case "multiplicar" => multiplicar
      case _ => (a: Int, b: Int) => 0
    }
  }

  def main(args: Array[String]): Unit = {
    // Usamos la función asignada a la variable
    println(multiplicar(4, 5))  // Output: 20

    // Pasamos una función como parámetro
    println(aplicarOperacion(10, 5, (a, b) => a + b))  // Output: 15
    println(aplicarOperacion(10, 5, (a, b) => a - b))  // Output: 5

    // Usamos una función devuelta por otra función
    val opSuma = obtenerOperacion("suma")
    println(opSuma(3, 4))  // Output: 7

    val opMultiplicar = obtenerOperacion("multiplicar")
    println(opMultiplicar(3, 4))  // Output: 12
  }
}