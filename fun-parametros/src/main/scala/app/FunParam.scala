package app

class Practica{
  def ejemplo1(f: () => Unit): Unit = {
    f()
  }
  def ejemplo2(cifra1:Int, f:(Int)=>Int):Int = {
    f(cifra1)
  }
}

object Principal{
  def main(args: Array[String]):Unit = {
    var pr1 = new Practica()
    pr1.ejemplo1(() => println("Función pasada como parámetro")) 

    def multi(numero:Int)={
      numero*5
    }
    println(pr1.ejemplo2(cifra1 = 10,multi))
    println(pr1.ejemplo2(10, (x:Int)=>x*20))
  }
}