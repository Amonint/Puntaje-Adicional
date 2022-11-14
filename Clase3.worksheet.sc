val nros = List(2.54,4.6)
def promedio(valores:List[Double]):Double= valores.sum/valores.size
def desvEst(valores : List[Double]):Double={
    val avg = promedio(valores)
    
    def varianza(valores:List[Double])= valores.map(x=> Math.pow(x-avg,2)).sum*(1.0/(valores.size-1))
    math.sqrt(varianza(valores ))

}
def clasifica(valores:List [Double])={
    val s= desvEst(valores)
    val avg = promedio (valores)
    (1 to 3).foreach(i=> 
        println(valores.filter(x =>
          x >=(avg -i*s)&& x <=(avg+i*s)).size))
}

//Tuplas
/* Una tupla es un contenedor de datos en donde cada elemento puede ser de diferente tipo */
//Una tupla es un contenedor de datos en donde cada elemento puede ser de diferente tipo
val par=(1,"AMA")
val student =(1,"Abad Ana")
/* val datos = ("jorgaf","m",45,96.4,true)
val student: Tuple2[Int, String]
val datos: Tuple5[String,String,Int,Double,Boolean] */
val (edad, nombre)=student
print(edad)
print(nombre)
student.canEqual(1,"Abad Ana")


/* Una lista es una elemnto similar a los arreglos 
son inmutables listas enlazadas */
val values = List(42,31,243,43)
val names= List("Jorge, rene ,Ma")

val myList= List(10,20,30,40,60,70)
myList.isEmpty
myList.drop(2)
myList.dropWhile(_<25)
myList.slice(2,4)
myList.tail
myList.take(3)
myList.takeWhile(_>3)

/* FoldLeft
Se aplica un operador binario a un valor incial y a todos los elemntos de esta secuencia, de izquierda a derecha. */

myList.foldLeft(0)((x,y)=>x+y)
myList.foldLeft(0)((_+_))

myList.foldRight(0)((x,y)=>x+y)
myList.foldRight(0)((_+_))


def average(valores: Seq[Double]):Double={
    val t =valores.foldLeft((0.0,0))((acc,currVal)=>(acc._1+currVal,acc._2+1))
    t._1/t._2
}

def average2(valores: Seq[Double]):Double={
    val t=valores.foldLeft((0.0,0)) { (acc,currVal)=>
    val sum = acc._1+currVal
    val cont = acc._2+1
    printf("la suma: %f-contador:%d%n",sum,cont)
    (sum,cont)
    }
    t._1/t._2
}