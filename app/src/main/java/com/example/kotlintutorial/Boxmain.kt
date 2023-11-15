package com.example.kotlintutorial
//fun main(){
//    val box1 =Box(19,20,16)
//    val box2 = Box(50,60,36)
//
//    println("height: ${box1.height}")
//    println("length: ${box1.length}")
//    println("width: ${box1.width}")
//    println(" -----------------------------------")
//
////    for get
//    println("volume: ${box1.volume}")
//    println("len : ${box1.len}")
//   println(" ----------------------------------")
//
////    for set
//    box1.boxname = "My"
//    println("Name : ${box1.boxname}")
//    box1.len1 = 3
//    println("value: ${box1.len1}")
//    println(" ----------------------------------")
//
//    box1.open()
//    box1.fillcontent()
//    println(" ----------------------------------")
//
//    println("height: ${box2.height}")
//    println("length: ${box2.length}")
//    println("width: ${box2.width}")
//    println(" ----------------------------------")
//
//
//}
//

open class Employee(name:String, age:Int, salary:Int){
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}

class WebDeveloper(name: String, age: Int, salary: Int):Employee(name,age,salary){
    fun website(){
        println("i am  website developer")
        println()
    }

}


class AndroidDeveloper(name: String, age: Int, salary: Int):Employee(name,age,salary){
    fun android(){
        println("i am android developer")
        println()
    }

}

class IosDeveloper(name: String, age: Int, salary: Int):Employee(name,age,salary){
    fun iosapp(){
        println("I am iOS app developer")
        println()

    }
}

//fun main(){
//    val sd = WebDeveloper("Imad Alam",24,40000)
//    sd.website()
//    val md = AndroidDeveloper("Sajid iqbal", 25,80000)
//    md.android()
//    val ns = IosDeveloper("Wajid Iqbal",27,100000)
//    ns.iosapp()
//
//}

//abstract class
abstract class Employee1(val name: String,val experience: Int) { // Non-Abstract
    // Property
    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}
// derived class
class Engineer(name: String,experience: Int) : Employee1(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}
fun main() {
    val sd = WebDeveloper("Imad Alam",24,40000)
    sd.website()
    val md = AndroidDeveloper("Sajid iqbal", 25,80000)
    md.android()
    val ns = IosDeveloper("Wajid Iqbal",27,100000)
    ns.iosapp()

    val eng = Engineer("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}
