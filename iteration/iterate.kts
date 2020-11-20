val array = arrayOf(1, 2, 3)
println(array::class)
println(array.javaClass)

val list = listOf(1, 2, 3)
println(list::class)
println(list.javaClass)

for (e in array) {
    print("$e, ")
}
println()
for (e in list) { print("$e, ") }

