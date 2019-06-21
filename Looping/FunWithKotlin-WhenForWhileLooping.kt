package demo
// If there is a library in Java we can use the library with Kotlin
import java.util.Random

fun looping(){

        // Here we will cycle through a range.
        for(x in 1..10){
                println("Imma number $x")
        }

        val rand = Random()
        val magicNum = rand.nextInt(50) + 1 //Number from 1 --> 50

        var guess = 0 // Initial number outside of the loop. this is very common in most langeus other than python.
        while(magicNum != guess){
                guess += 1
        }
        println("Magic Num was $guess")

        // Continue and Break.
        // Here we will use the Modulo operator
        for(x in 1..20){
                if(x % 2 == 0){
                        continue
                }
                println("Odd: $x")

                if(x == 15) break // Break out of the loop at 15.
        }

        // Now lets create an array and then iterate through the indicies of the array.
        var array3: Array<Int> = arrayOf(3,6,9)

        for (i in array3.indices){
                println("Mult 3 : ${array3[i]}")
        }

        // Now we are going to obtain both the idnex and the value for the array object and print these to stdout.
        for ((index, value) in array3.withIndex()){
                println("Index: $index Value: $value")
        }
}
looping()