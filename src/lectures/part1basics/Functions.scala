package lectures.part1basics

object Functions extends App{
  def aFunction(a:String, b:Int): String =
    a + " " + b
  println(aFunction("Your number is", 5))
//A function can inherit the type
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

//  A recursive function cannot inherit the type and needs a type to work
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
// We use a function with side effects when we don't require to do an computation, for example just print a message


  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */
  def greetingFunction(name:String, age:Int):String =
    "Hello my name is " +name+ " and I'm " +age+ "Years old"
  println(greetingFunction("Manuel", 27))

  def factorialFunction(number:Int): Int =
    if(number<0) 1
    else number * factorialFunction(number-1)
  println(factorialFunction(5))

  def fibonacciFunction(number:Int):Int =
    if(number<2) 1
    else fibonacciFunction(number -1)+ fibonacciFunction(number-2)
  println(fibonacciFunction(9))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}