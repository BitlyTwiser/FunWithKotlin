package demo

//Fun With Arrays!

// 1. Arrays can store multiple values of multiple types.

fun arrays() {

        // Simple array of multiple values
        var myArray = arrayOf(1, 1234, "ImmaName!")

        // Obtain second element within the array!
        println(myArray[2])

        //Change a specific element within the Array
        myArray[1] = 4545

        //Check the length of the array object.
        println("Array Length: ${myArray.size}")

        //Check for selected element within an Array
        println("My Array contains 1?: ${myArray.contains(1)}") // Returns boolean value.

        //Copy elements of an array into another array.
        var partArray = myArray.copyOfRange(0,1)
        println("I am a whole new array! ${partArray[0]}")

        // Another way to obtain the first element of an Array.
        println("First: ${myArray.first()}")

        //Find the index of an element.
        println("Where is 1?: ${myArray.indexOf(1)}")

        // Now lets get a little more fancy and create an array full of squares.
        // This will move through 1 -> 5 and multiple the index times itself. i.e. 1  * 1, 2 * 2 etc...
        var sqArray = Array(5, {x -> x * x})
        println(sqArray[2])

        //Type specific arrays
        // can set only a specific data type per array.
        // Only Int's can be within this array object.
        var arr2: Array<Int> = arrayOf(1,2,3,4)
}

arrays()