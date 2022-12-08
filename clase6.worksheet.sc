import scala.io.StdIn
import scala.util.{Success, Try, Failure}

val name = StdIn.readLine("Nombre: ")

val edad = Try{StdIn.readLine("Edad: ").toInt}

object Eza0{
  def main(args: Array[String])= {
    val name = StdIn.readLine("Nombre: ")
    val edad = StdIn.readLine("Edad: ").toInt
    val peso = StdIn.readLine("Pesp: ").toDouble
    printf("Hola %s, tienes %d, anios y pesas %fkg\n", name,
      edad match {
        case Success(v) => v
        case Failure(e) => "Error"
      },peso match {
        case Success(v) => v
        case Failure(e) => "Error"
    })
    }
}
/* ------------------------------------------------- */
object InputData {
  def main(args: Array[String])= {
    val nombre = StdIn.readLine("Nombre: ")
    val edad = Try{StdIn.readLine("Edad: ").toInt}
    val peso = Try{StdIn.readLine("Peso: ").toDouble}

    printf("Hola %s, tienes %d anios y pesas %fkg \n",
      nombre,
      edad match {
        case Success(v) => v
        case Failure(e) => "Error"
      },
      peso match {
        case Success(v) => v
        case Failure(e) => "Error"
    },
    )
  }
}
/* ----------------------------------------------------------- */
object InputDataZ {
  def main(args: Array[String])= {
    val nombre = StdIn.readLine("Nombre: ")
    val edad = Try{StdIn.readLine("Edad: ").toInt}
    val peso = Try{StdIn.readLine("Peso: ").toDouble}

    "Hola %s, tienes %d anios y pesas %fkg \n".format(
      nombre,
      edad match {
        case Success(v) => v
        case Failure(e) => "Error"
          println("Error en la edad trozo de vrg")
      },
      peso match {
        case Success(v) => v
        case Failure(e) => "Error"
          println("Error en el peso trozo de vrg")

    },
    )
  }
}

/* ---------------------------------------------------- */
case object Demo{
  def main(args: Array[String]): Unit = {
    case class User(name: String)
    def getUser(id : Int): Unit = {
      if(Set(1 ,2 ,3).contains(id))
        Some(User(s"User - $id"))
      else
        None
    }

    getUser(1)
    getUser(4)
    getUser(3)
    }
}