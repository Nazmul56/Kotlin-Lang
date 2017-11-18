val a: Int = 1 // immediate assignment

val b = 2 // Int type is inferred

val c: Int = 0

var X: Int = 5 +1
    //X += 1
val PI = 3.14
var R = 0

fun incrementX(){
    X += 1
    R += 1
}

// Comment
/* Hello */
var p = 1
val s1 = "a is $p"
val s2 = "${s1.replace("is", "was")}, but now is $a"

/*fun maxof(a: Int , b: Int): Int{
    if (a > b) {
        return a
    }else{
        return b
    }

}*/
//Avobe maxOf is same
fun maxOf(a: Int, b: Int) = if (a > b) a else b

//Return null
fun parseInt(str: String): Int? {
// ...
    return str.toInt()
   // return null
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
// Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
// x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}
/*fun getStringLength(obj: Any): Int? {
    if (obj is String) {
// `obj` is automatically cast to `String` in this branch
        return obj.length
    }
// `obj` is still of type `Any` outside of the type-checked branch
    return null
}*/
fun getStringLength(obj: Any): Int? {
// `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}
fun main(args: Array<String>)
{
    // println("Hello Aliens")

    println(s2 )
    println("which is bigger")
    println( maxOf(20,10))
    println("Parse Int")
    println(parseInt("10"))
    println(printProduct("10", "2"))
    var name = "Nazmul"
    println(name + " length: " + getStringLength(name))
}