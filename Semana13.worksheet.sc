/* Proyecto Integrador 
-Comentarios de entrega n1
-Es necesario realizar limpieza de datos
-Cadenas vacias
-No todas las columnas se deben analizar
-Algunas columnas poseen necesitan un analisis mas cuidadoso, ejemplo:
-Separador no defenido genres cast(nombres)
-Dato estructurado release date(fecha)



Dato estructurado(date)
Columna


import java.time.LocalDate
import java.time.format.DateTimeFormatter
val dateFormatter = DateTimeFormatter.ofPattern, ("yyyy-MM-dd")
val releaseDateList = data
  .map( row => row("release_date"))
  .filter(!_.equals(""))
  .map(text => LocalDate.parse(text, dateFormatter))

--------------------------------------------------------------------
val yearReleaseList = releaseDateList
  .map(_.getYear)
printf("Ano menor: %f\n, yearReleaseList.min)
printf("Ano mayor: %f\n, yearReleaseList.max)
--------------------------------------------------------------------

Representación gráfica
 Ejemplo 1 - Histograma 1
 Necesito ver el lanzamiento de películas por año
libraryDependencies += "io.github.cibotech" %% "evilplot" % "0.8.1"

import com.cibo.evilplot.plot._
import com.cibo.evilplot.plot.aesthetics.DefaultTheme.{DefaultElements, DefaultTheme}



val yearReleaseList = releaseDateList
.map(_.getYear)
.map(_.toDouble)

Histogram(yearReleaseList)
.title("Afios de lanzamiento")
.xAxis()
.yAxis()
.xbounds(1916.0, 2018.0)
.render()
.write(new File("/Users/jorgaf/histoYear.png"))




val productionCompanies = data
.flatMap(row => row.get("production_companies"))
.map(row => Json.parse(row) )
.flatMap(jsonData => jsonData \\ “name")
.map(jsValue => jsValue.as [String] )
.groupBy(identity)
.map { case (keyword, lista) => (keyword, lista.size) }
.toList
.sortBy(_._2)
.reverse

 
val pCompaniesValues = productionCompanies.take(10).map(_._2).map(_.toDouble)
val pCompanieLables = productionCompanies.take(10).map(_._1)

BarChart (pCompaniesValues )
.title("Compafiias productoras")
.xAxis()(pCompanieLables)
.yAxis()
.frame()
.yLabel("Productions")
.bottomLegend()
.render
.write(new File(“<ruta_archivo>.png"))


Par que queden inclinadas
implicit val theme = DefaultTheme.copy(
elements = DefaultElements.copy(categoricalXAxisLabelOrientation = 45))



def replacePattern(original : String) : String = {
var txtOr = original
val pattern: Regex = "(\\s\"(.*?)\",)".r
for(m <- pattern.findAllIn(original)) {
  val textOriginal = m
  val replacementText = m.replace("'", "-uQ027")
  txtOr = txtOr.replace(textOriginal, replacementText)}
  txtor
}

def replacePattern2(original : String) : String = {
var txtOr = original
val pattern: Regex = "(\\s\"(.*?)\",)".r
for(m <- pattern.findAllIn(original)) {
  val textOriginal = m
  val replacementText = m.replace("'", "-uQ027")
  txtOr = txtOr.replace(textOriginal, replacementText)}
  txtor
}

def replacePattern3(original : String) : String = {
var txtOr = original
val pattern: Regex = "(\\s\"(.*?)\",)".r
for(m <- pattern.findAllIn(original)) {
  val textOriginal = m
  val replacementText = m.replace("'", "-uQ027")
  txtOr = txtOr.replace(textOriginal, replacementText)}
  txtor
}


 

val crew = data
.map(row => row("crew"))
.map(replacePattern2)
.map(replacePattern)
.map(replacePattern3)
.map(text => text.replace("'", "\""))
.map(text => text. replace("-ug027", "'"))
.map(text => text. replace("-u0022", "\\\""))
.map(text => Try(Json.parse(text)))
.filter(_.isFailure)
.size


 */
