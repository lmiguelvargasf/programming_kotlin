open class Fruit
class Banana(val color: String) : Fruit()
class Orange : Fruit()

fun copyFromTo(from: Array<out Fruit>, to: Array<in Fruit>) {
    for (i in 0 until from.size) {
        to[i] = from[i]
	println((to[i] as Banana).color)
//	println(to[i].color)
    }
}

val things = Array<Any>(3) { _ -> Fruit() }
val bananaBasket = Array<Banana>(3) { _ -> Banana("yellow") }
copyFromTo(bananaBasket, things) //ERROR: type mismatch

