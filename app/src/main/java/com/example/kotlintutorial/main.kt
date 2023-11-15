package com.example.kotlintutorial
fun main(args: Array<String>) {
    val tim = Player(name = "Tim")
    tim.show()

    val louise = Player(name = "Louise", level = 5)
    louise.show()

    val gr8 = Player(name = "gr8", level = 4, lives = 8)
    val one2watch = Player(name = "Ace", level = 2, lives = 5, score = 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon(name = "Axe", damageInflicted = 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon(name = "Sword", damageInflicted = 10)
//    println(tim.weapon.name)
    tim.show()

    louise.weapon = tim.weapon
    louise.show()

    tim.weapon = Weapon(name = "Spear", damageInflicted = 14)
//    println(tim.weapon.name)
    tim.show()

    val redPotion = Loot(name = "Red Potion", LootType.POTION, value = 7.50)
    tim.getLoot(redPotion)
    val chestArmor = Loot(name = "+3 Chest Armor", LootType.ARMOR, value = 80.00)
    tim.getLoot(chestArmor)
    tim.showInventory()

    tim.getLoot((Loot(name = "Ring of Protection +2", LootType.RING, value = 40.25)))
    tim.getLoot((Loot(name = "Invisibility Potion", LootType.POTION, value = 35.95)))
    tim.showInventory()

    if (tim.dropLoot(redPotion)) {
        tim.showInventory()
    } else
        println("you don't have a ${redPotion.name}")

    val bluePotion = Loot(name = "Blue Potion", LootType.POTION, value = 6.00)
    if (tim.dropLoot(bluePotion)) {
        tim.showInventory()
    } else {
        println("You don't have ${bluePotion.name}")
    }
    
}
