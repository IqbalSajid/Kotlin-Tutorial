package com.example.kotlintutorial

fun rolldice(time:Int = 1 , range: IntRange = (1..10)){
    for(i in 0 until time) {
        val result =range.random()
        println(result)
    }
}

fun getsum(vararg nums:Int){
    println(nums.sum())
}

fun getsub(vararg nums:Int): Int {
    return nums.sum()
}

fun makerbarger(size:String, extracheese:Boolean, makeitAmeal:Boolean, type:String){
    println("size : $size")
    println("extracheese : $extracheese")
    println("makeitAmeal: $makeitAmeal")
    println("type : $type")
}

//fun main(){
//    makerbarger(size= "XL", extracheese= true, makeitAmeal= true, type = "chicken")
//    rolldice()
//    getsum(34,5,6,6,4,35)
//    val sum = getsub(1,2,3,3,4)
//    println(sum)

//}
fun rolldice(range: IntRange, time: Int, callback: (result :Int) -> Unit
){
    for (i in 0 until time){
        val result = range.random()
        callback(result)
    }
}

fun main(){
    rolldice(1..6,4){result ->
        println(result)

    }
}
