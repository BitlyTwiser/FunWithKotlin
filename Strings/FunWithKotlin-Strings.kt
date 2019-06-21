package hello

//Super Simple hello world!
fun hello_world():
    println("Hello World")

hello_world()

fun main() {

    //Setting var's to type INT.
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Big value: $bigInt")
    println("Big value: $smallInt")

    var stuff: Int = 12345 * 12
    var items: String = "Asdasd"

    println("$stuff")
    println("$items")

    //Casting
    println("3.14 to Int: "+(3.14.toInt()))
    println("A to Int: "+('A'.toInt()))
    println(1235.toString())
}

fun strings() {
    //Val for immutable variable.
    // One Does not have to cast the string due to inference.
    val name : String = "Josh"
    val longString = """This is a much " +
            "longer string and stuff!"""
    println("My Name is $name")
    println("A longer string is $longString")

    var fName: String = "Poop"
    var lName : String = "Butt"
    println("Saying name first time $fName")
    // reset variable
    fName = "Sally"
    println("Saying name again after reset $fName")

    var fullName = fName + " " + lName
    var fullName2 = "$fName $lName"
    println("$fullName2")
    println("$fullName")

    //One can peform mathmatical operations within the println statement.
    println("1+2 = ${1+2}")
    //Using Variables
    var one: Int = 123
    var two: Int = 654
    println("num*num = ${one*two}")

    //Getting length of strings:
    var length: String = "ImmaTestingString"
    println("String Length: ${length.length}")

    //Compare two strings
    var str1: String = "aDog"
    var str2: String = "Adog"
    println("Strings equal: ${str1.equals(str2)}") //Boolean will be returned.
    //You can also use a compareto() method
    println("Compare: ${"A".compareTo("B")}") //Instead of boolean you will receive a -1 or 0. (0 if match, else -1)

    //Getting Char at index location within the string
    println("2nd Index: ${str1[2]}")
    // Kotlin can also slice usilizing subSequence method
    println("Index 1-3: ${str1.subSequence(0,3)}")
    //Check substrings
    println("Contains Random: ${str1.contains("A")}") //Returns Boolean Value
}

println("Now printing the main functions!")
main()
println("Im Outside of the functions! \n")
println("Now Printing fun with strings!")
strings()