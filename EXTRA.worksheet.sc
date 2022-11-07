/* val cedula = "1108765321" */
var cedula = "1108765321" /* con val solo se aplica una vez no se reasigna y var cuando sea*/
 cedula = "1108765323"
 /* ------------------------------------------------------------------------------------------------ */

(x:Double)=> -math.pow(x,2)+8*x-12
val f1=(x:Double) => -math.pow(x,2)+8*x-12
f1(12)*9/8+3

/* ------------------------------------------------------------------------------------------------ */
((x:Double) => -math.pow(x,2)+8*x-12)(12)*9/8+3  /* otra forma de expresar la funcion de arriba */

/* ------------------------------------------------------------------------------------------------ */
//Asignar a una funcion otra funcion/
def integracion(f : Double => Double , a : Int , b : Int ) : Double = { /* def integracion recibe un Double y saca un double parametro a es entero y b es entero tambien  */
    val intermedio =((a+b)/2.0)
    val fa=f(a)
    val fi =f(intermedio)
    val fb=f(b)
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}
def select(option:Char):(Int,Int)=>Double={
    option match{
        case '+' => (a:Int,b:Int)=>a+b
        case '-' => (a:Int,b:Int)=>a-b
        case '*' => (a:Int,b:Int)=>a*b
        case '/' => (a:Int,b:Int)=>a/b.toDouble
        case _ => (a:Int,b:Int)=>0/(a+b)
    }
}
select('+')(2,1)
val operation = select('+')
operation(2,1)
//Obtener datos de secuencias/
val isEven=(k:Int)=>if (k % 2==0) 1 else 0
def isEven(k:Int):Int=(k % 2)match{ /* Lo mismo de arriba pero con match */
    case 0=> 1
    case 1 =>0 
}
def countEven(s:List[Int]):Int =s.map(isEven).sum

def countEven(s:List[Int]):Int =s.
map (k=>if(k% 2==0) 1 else 0).
sum
def countEven(s:List[Int]):Int =s.
map{k=>if(k% 2==0) 1 else 0}.
sum
//Obtener datos de secuencias/
/* List(1,2,3)
List(1,2,3).sum
List(1,2,3).map(x=>x*x+100*x)
res1:List[Int]=List(101,204,309)
def func1(x:Int):Int = x*x+100*x
List(1,2,3).map(func1)
res3:List[Int]=List(101,204,309)
List(1,2,3)map func//dotless infix */

val nums = List(1,2,3)
nums.maps(x=>x+1)
def add1(a:Int):Int=a+1
nums.map(add1)
nums.map(x=> add1(x))
nums.map(add1(_))
val sumaDos=(a:Int,b:Int)=>a+b
nums.map(x=>sumaDos(x,x))


def isEven(k:Int): Int=(k % 2)match{
    case 0 =>1
    case _ =>1


}
def countEven(s: List[Int]):Int= s.map(isEven).sum