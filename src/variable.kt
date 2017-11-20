import java.awt.Rectangle

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

// When
fun describe(obj: Any): String =
        when (obj) {
            1            -> "One"
            "Hello"      -> "Greeting"
            is Long      -> "Long"
            !is String   -> "Not a string"
            else         -> "Unknown"
        }

fun foo(a: Int = 0, b: String = " ") {

    println(a )
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

    // For Loop

    val items = listOf("apple", "banana", "kiwi")
    for (item in items){
        println(item)
    }


    //ANother for loop
    val items1 = listOf("apple", "banana", "kiwi")
    for (index in items1.indices) {  // indices get index list
        println("item at $index is ${items1[index]}")
    }


    //While loop
    val items2 = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items2.size) {
        println("item at $index is ${items2[index]}")
        index++
    }
    println(describe(1))

    //Check whith in a Range
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
    // In Array
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    //println("${list.size}  ${list.indices}")
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    //Iteration
    for (x in 1..5) {
        print(x)

    }
    println()
    println("over a progression: print after every 2 step")
    //or over a progression:
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    println("Run in Reverse Order: print after every 3 step")
    for (x in 9 downTo 0 step 3) {
        print(x)
    }


    println()

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

  //  val rectangle = Rectangle(5.0, 2.0) //no 'new' keyword required
   // val triangle = Triangle(3.0, 4.0, 5.0)

    data class Customer(val name: String, val email: String)
    foo()

//


}