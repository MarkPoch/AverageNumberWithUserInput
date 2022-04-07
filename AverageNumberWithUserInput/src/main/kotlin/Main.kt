fun main(){
    println("Please enter 5 digits")

    val a = readLine()?.toInt()
    val b = readLine()?.toInt()
    val c = readLine()?.toInt()
    val d = readLine()?.toInt()
    val e = readLine()?.toInt()

    if(a != null && b != null && c != null && d != null && e != null) {

        val sum = (a + b + c + d + e) / 2.0
        println(sum)
    }
}