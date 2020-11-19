fun greet(name: String, msg: String = "Hello") = "$msg $name"

println(greet("Eve"))
println(greet("Eve", "Howdy"))

