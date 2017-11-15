import java.lang.Thread.yield
import kotlin.coroutines.experimental.buildSequence

val seq = buildSequence {
    for(i in 1..5) {
        yield(i*i) // Squre

    }
    yieldAll(26..28)
}
fun main(args: Array<String>)
{
   // println("Hello Aliens")
    println(seq.toList())
}
