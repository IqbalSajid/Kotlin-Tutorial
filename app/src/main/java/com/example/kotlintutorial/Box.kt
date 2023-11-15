package com.example.kotlintutorial

class Box (  val height : Int, val length : Int, val width : Int ){


    val volume
        get() = height*length*width
    var boxname :String = "box name"
        set(value){
            if (value.length < 3){
                println("name cannot be less then three characters")
            }else{
                field = value
            }
        }

    val len
        get() = width+height

    var len1 :Int = 4
        set(value) {
            if (value < 5){
                println("your number is less than 5")

            }else{
                field =value
            }
        }

    fun open(){
        println("Box Open")
    }

    fun fillcontent(){
        println("Box Close")
    }
}

