
val goleadores = List(     ("Oscar Becerra" , 17),
    ("Luis Amarallia" , 16),
    (" Michael Estrada", 16),
    ("Fidel Martínez", 16), 
    ("Gonzalo Mastriani", 13),
    ("Leonel Vides" , 13),
    ("Rodrigo Aguirre", 12),
    ("Carlos Garces" , 12),
    ("Jonathan Borja" , 11))
val goles = goleadores.map(_._2).map(_.toDouble)
val average=
    (values:List[Double])=>values.sum/values.length
val avgol= average(goles)
goleadores.maxBy(_._2)._1
goleadores.minBy(_._2)._1



/* Mayor al promedio */
val goles1 = goleadores.map(_._2).map(_.toDouble)
val average1=
    (values:List[Double])=>values.sum/values.length
val avgol1= average(goles1)
val mayoresAvg=goleadores.
filter(_._2>avgol1).
map(_._1)


/* Conjuntos
Grupo de valores unicos */
val conj2:Set[Int]=Set()
val conjunto : Set[Int]=Set(1,1,2,2,3,3)

/* Agregar un valor al conjunto */
val conjunto2: Set[Int]=Set(1,2,3)
val conNuevo = conjunto + 6 

/* Concatenar conjuntos Union de conjunto */
val conjunto3: Set[Int]=Set(1,2,3)
val conNuevo2 = conjunto.concat(List(2,3,4,5))

/* Intersect conjunto */
conNuevo.intersect(conjunto)


/* Mapas en Scala */
Map((1,2),(1,100))

/* Convertir una Lista de tupla a mapa */
List ((1,2),(1,100)).toMap

/* Convertir mapa a secuencia de pares */

Map((1,2),(1,100)).toSeq

/* map en Mapas
Funciones */
/* val fruitBasket = Map("manzana"->3, "banana"->2, "pera"->0)
(fruitBasket.map(data=> data match{
    case(fruit,count)=>count*2
})

fruitBasket.map{case(fruit,count)=>(fruit,count*2)}

fruitBasket.map{case(fruit,count)=>(fruit,count,count*2)}.
map{case(fruit,_,count2)=>(fruit,count2/2)}.toMap */

/* Groupby */

/* Seq("camisa","gabra","xaca","pabroi")
groupBy(s=>if(s startsWith"y")1 else 2)
Map[Int,Seq[String]]=Map(1->List(yogurt),2->List("camisa","cabra","caca")) */

List(1,2,3,4,5).groupBy(k=>k%3)

/* Una tupla de jugadores que tiene el mismo numero de goles se clasifica la clave con el numero de goles*/
val goleadores2 = List(     ("Oscar Becerra" , 17),
    ("Luis Amarallia" , 16),
    (" Michael Estrada", 16),
    ("Fidel Martínez", 16), 
    ("Gonzalo Mastriani", 13),
    ("Leonel Vides" , 13),
    ("Rodrigo Aguirre", 12),
    ("Carlos Garces" , 12),
    ("Jonathan Borja" , 11))
    goleadores.groupBy{
        case(_,goals)=> goals
    }





goleadores.groupBy{
    case (_,goals)=> goals
}.map{
    case(goles,lista)=>(goles,lista.size)
}.toList.sortBy(_._2)