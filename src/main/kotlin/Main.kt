fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    print("sum of a and b is =")
    println(sum(3,5))
}

fun sum(a:Int, b:Int): Int{
    return a + b
}