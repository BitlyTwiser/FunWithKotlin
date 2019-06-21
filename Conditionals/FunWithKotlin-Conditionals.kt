package demo

// Lets start with conditional oparators:
// < > = >= <= !=
// Now we also have logical operators:
// && || !=
// All of these operators are allowed in Kotlin.

fun conditionals() {

        // Remember from the strings lesson that val is immutable.
        val age = 20

        if(age < 5){println("Go to Preschool!")}
        else if(age == 5){println("Go to kindergaten!")}
        else if((age > 5) && (age <= 17)){
                val grade = age - 5
                println("Go to Grade $grade")}
        else {println("Go to College!")}

        // When works like switch statements in alternate languages.
        // This is essentially the same as above, but using when.
        when(age){
                0,1,2,3,4 -> println("Go To Preschool")
                5 -> println("Go To Kindergarten")

                in 6..17 -> {
                        val grade = age - 5
                        println("Go To Grade $grade")
                }

                else -> println("Go To College")
        }

}
conditionals()