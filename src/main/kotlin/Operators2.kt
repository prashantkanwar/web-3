fun main() {
    var a = 5
    print("initial value of a = ")
    println(a++) // 5
    print(" post increment the value of a by 1 = ")
    println(a) // 6
    print("pre increment the recent value of a by 1 = ")
    println(++a) // 7
    print("final value of a = ")
    println(a) // 7

    println()

    var b = 4
    print("initial value of b = ")
    println(b--) // 4
    print("post decrement the value of b by 1 = ")
    println(b) // 3
    print("pre decrement the recent value of b by 1 = ")
    println(--b) // 2
    print("final value of b = ")
    println(b) // 2

    println()

    var c = 3
    val d = ++c * c++
    print("The value of d is the multiplication of pre and post increment of c = ")
    println(d) // ?
    println(c)
    var e = 3
    val f = e++ * ++e
    println(f) // ?
    println(e)
}
