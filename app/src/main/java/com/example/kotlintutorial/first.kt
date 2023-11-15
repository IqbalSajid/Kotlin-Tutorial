package com.example.kotlintutorial

//fun main(){
//   println("Hello word")

// var tim : String = " watson"
//println(tim)

//var timsalary : Int = 40
//var monthly : Int = timsalary * 4
//println("tims weekly salary is $timsalary")
//println(monthly)

//println()

//val apple : Int = 6
//val orange : Int = 8
//val fruits :Int =apple + orange
//println(fruits)

//println (fruits/4)

//val weeks : Int = 170
//val years : Double = weeks /50.0
//println(years)

// String Concatenation and Interpolation

//println("my name is" + tim)
//}

// Conditions

fun main(){
    // val lives = 0

    // var isGameOver = (lives <1)
    // println(isGameOver)

    // if (isGameOver){
    //     print("Game Over!")
    // } else{
    //     println("You re Still Alive!")
    // }

    println("How Old Are You: ")
    val age = readLine()!!.toInt()
    print("age is $age")

    val message:String

    message = when {
        age < 18 -> "You re Too Young To Vote"
        age == 100 -> "Congratulations"
        else -> "You Can Vote"

    }
    // if(age <18) {
    //     println()
    //     message = "You re Too Young To Vote"
    // } else if (age == 100){
    //     message = "Congratulations"
    // } else {
    //     println()
    //     message = "You Can Vote"
    // }
    println(message)



}