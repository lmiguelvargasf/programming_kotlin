fun greet(msg: String = "Hello", name: String) = "$msg $name"

println(greet("Bye", "Eve"))
println(greet(name = "Eve" ))

