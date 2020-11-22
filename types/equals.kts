class Animal {
    override operator fun equals(other: Any?) = other is Animal
}

val greet: Any = "Hello"
val odie: Any = Animal()
val toto: Any = Animal()

println(odie == greet)
println(odie == toto)

