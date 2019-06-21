package demo

// Fun With Ranges!
// Ranges allow one to define a starting and ending value.
// With ranges one can perform computations of all sorts with ranges.
fun ranges() {

        val oneTo10 = 1..10 // Create a range from 1 -> 10
        val alpha = "A".."Z" //Can be alpha values as well.

        // Testing if a value is within a range.
        println("R in Alpha: ${"R" in alpha}") // Returns Boolean
        println("50 in oneTo10: ${50 in oneTo10}")

        // Can create ranges that will decrement.
        val down = 10.downTo(1)
        println(down)

        val up = 20.rangeTo(40)
        println(up)

        // Stop through a range.
        val rn3 = oneTo10.step(3) //Adds 3 each time.
        println(rn3)

        // Print down
        for(x in down) println(x)

        //Loop through range
        for(x in rn3) println("rng3: $x")

        //Reverse
        for(x in rn3.reversed()) println("Reverse $x")
}

ranges()