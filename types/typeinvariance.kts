open class Fruit
class Banana : Fruit()
class Orange : Fruit()

fun receiveFruit(fruit: Array<Fruit>) {
    println("Number of fruits: ${fruit.size}")
}

val bananas: Array<Banana> = arrayOf()
receiveFruit(bananas)

