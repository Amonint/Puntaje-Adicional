/* Mapeo */
/* def isEven(k:Int): Int=(k % 2)match{
    case 0 =>1
    case _ =>1


}
def countEven(s: List[Int]):Int= s.map(isEven).sum
 */
/* def countEven(s: List[Int]):Int={
    def isEven(k:Int):Int =(k % 2)match{
        case 0 =>1
        case _ =>0
    }
    s.map(isEven).sum
} */
def countEven(s: List[Int]):Int={
    val isEven=(k:Int)=>(k % 2)match{
        case 0 =>1
        case _ =>0
    }
    s.map(isEven).sum
}


/* Mapear una lista de cadenas de texto a lista de enteros que representan la longitud del texto */
val names : List[String]=List("Leo","Sergio","Patricio","P","Leo")
names.map(_.length)

/* Dada una lista de enteros, desarrollar las funciones necesarias que le permitan contar cuantos elementos de la lista son numeros primos: */
val numbers1= List(3,4,5,6,7)
val isPrime=(nro:Int)=>(2 to nro -1).forall(nro%_!=0)
numbers1.map(isPrime(_)match{
    case true =>1
    case  false =>0
}).sum
/* Filtrar y truncar secuencias
Otras operaciones
-sum
-product
-map
-forall------------>devuelve true si y solo si el predicado devuelve true para todos los valores de la lista 
-max
-min
-size
-exits-------------> devuelve true o false
-filter------------> devuelve true o false
-takeWhile---------> devuelve true o false*/

val numbers = List (6,6,6,78,6,45)
numbers.max
numbers.min
numbers.size


/* For All y Exists */
def isPrime1(nro:Int):Boolean =(2 until nro).forall(nro%_!=0)

/* Exists*/
/* def isPrime80(nro:Int):Boolean =!(2 until nro).exists(nro %_==0) */


/* Filter devuelve una lista que unicamente contiene los valores que cumplen el predicado */
List(1,2,3,4,5).filter(k=>k%3!=0)

/* takeWhile-> trunca la lista cuando encuentra un valor que no cumplecon el predicado */
List(1,2,3,4,5).takeWhile(k=>k%3!=0)


/* Map/reduce
Transformar una funcion toma una lista y devuelve otra 
funciones:map, filter,etc.
agregar, toma una lista y devuelve un unico valores
funciones:Max,sum,etc
Escribir programas que concatenan Transformaciones y agregaciones se conocen  */

val numbersEje= List(3,4,5,6,7)
val isPrimeEje=(nro:Int)=>(1 until nro).filter(div=>nro % div ==0)
isPrimeEje(8)


val numbersEje2= List(3,4,5,6,7)
val sumDiv=(nro:Int)=>(1 until nro).filter(div=>nro % div ==0).sum
numbersEje2.filter(nro=> nro==sumDiv(nro)).size

val sumDiv1=(nro:Int)=>(1 until nro).filter(div=>nro % div ==0).sum
numbersEje2.filter(nro=> nro>sumDiv(nro)).size

val sumDiv5=(nro:Int)=>(1 until nro).filter(div=>nro % div ==0).sum
numbersEje2.filter(nro=> nro < sumDiv(nro)).size

(n:Int)=>(1 until n).filter(div=>n % div ==0)
//factorial
def factorialEscalonado(n:Int): Int={
    n%2 match{
       case 0 =>(2 to n by 2).product
       case _ =>(1 to n by 2).product

    }
}
factorialEscalonado(2)

val number8 = (1 to 20).toList
/* Contar los pares */
number8.filter(nro=>nro%2==0).size
numbers.count(nro=>nro %2==0)
/* Contar los impares  */
number8.filter(nro=>nro%2!=0).size
numbers.count(nro=>nro %2==0)

/* Contar primos */

def contarPrimos(nros : List[Int]):Int={
    val isPrime843 = (n:Int)=> (2 until n). forall(n % _!=0)
    nros.filter(isPrime843).size
}
contarPrimos(numbers)

//Presentar 3 factores 
def tresFactores(nros:List[Int]):List[Int]={
    val factores =(n:Int)=>(2 until n ).filter(n%_==0)
    nros.filter(nros=> factores(nros).size==3)
}
tresFactores(nros=(1 to 1000).toList)