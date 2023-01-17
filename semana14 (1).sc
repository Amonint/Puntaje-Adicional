
/* Resolucion de ejercicio prueba */
val idNameList = crew
   .filter(_.isSuccess)
   .map(_.get)
   .flatMap(_.as[JsArray].value)
   .map(js0bj => (js0bj("id").as[Int], js0bj ("name").as[String]))
   .groupBy(identity)
   .map {
    case (tupla, list) => (tupla, list.size)
    }
   .filter(_._2 > 1)
   .tolist
   .sortBy(_._2)
   .reverse


/* -------------------------------------------------------------------------------------------- */

/* -Trabajo con una base de datos
-Fundamentación
-Existen diferentes técnicas para trabajar con bases datos
-Pero, todas parten de un principio:
-Conexión a la base
-Enviar sentencias SQL que se ejecutarán
-Recuperar los resultados y trabajar */


/* Trabajo con una base de datos
 Fundamentación
 -En programación, lo único que cambia es quien escribe el SQL
 -Manual
 -Semi-automático
 -Automático
--------------------------------------------------------------------------------------------------------------------------------------- 
Manejo de base datos
Desde el nivel más bajo
Scala primo hermano de Java
Java DataBase Connectivity - JDBC
JDBC estándar, cada base de datos implementa su versión
 */



 Manejo de datos
 sql""
 create table members
                  (
  id serial not null primary key,
  name varchar (64),
  created_at timestamp not null
 )
 .....
   .execute.apply()

 sql"select * from members".map (_. toMap).list.apply()


 libraryDependencies +="org.scalikejdbc" %% "scalikejdbc" % "4.0.0"
 libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
 libraryDependencies += "com.mysql" % "mysql-connector-j" % "8.0.31"




--Conexion y sesion--

import scalikejdbc._

Class.forName("com.mysql.cj.jdbc.Driver")
ConnectionPool.singleton("jdbc:mysq|://localhost:3306/pintegrador", "root", "")
implicit val session: DBSession = AutoSession

--SELECT--
val entities: List[Map[String, Any]] = sql"SELECT * FROM MOVIE m"
.map(_.toMap)
.list.apply()

--INSERT--

Limpiando columna cast
Consumir servicio REST

 
Limpiando Cast
libraryDependencies += "com.lihaoyi" %% "requests" % "0.8.0",



import requests.Response
def actorsNames(dataRaw: String): Option[String] = {
val response: Response = requests
.post("http://api.meaningcloud.com/topics-2.0",
data = Map("key" -> “tu API KEY”,
"lang"—>"en",
"text"—>dataRaw,
an Gee mee -)2t-\
“tt" —> "e"),
headers = Map("content-type" -> "“application/x—www-form-urlencoded") )
Thread. sleep(1000)
if(response.statusCode == 200) {
Option( response. text)
}else
Option.empty
}



val cast = data
.map(row => row("cast"))
.filter(_.nonEmpty)
.map(StringContext.processEscapes)
.take(10)
.map(actorsNames)
.map(json => Try(Json.parse(json.get)))
.filter(_.isSuccess)
.map(_.get)
.flatMap(json => json("entity_list").as[JsArray] . value)
.map(_ ("form") )
.map(data => data.as [String] )
