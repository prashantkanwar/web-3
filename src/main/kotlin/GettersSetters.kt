class GettersSetters {

    var description = "empty"
        get() {
            return if (field == "empty") "" else field
        }
        set(value) {
            field = if (value.isEmpty()) "empty" else value
        }

}

fun main() {
    val a = GettersSetters()
    //print empty line
    println(a.description)

    a.description = ""
    //print empty line
    println(a.description)
}
