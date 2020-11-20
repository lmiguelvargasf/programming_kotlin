fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = when {
    numberOfLiveNeighbors < 2 -> false
    numberOfLiveNeighbors > 3 -> false
    numberOfLiveNeighbors == 3 -> true 
    else -> alive && numberOfLiveNeighbors == 2
}

println(isAlive(true, 1))
println(isAlive(true, 2))
println(isAlive(true, 3))
println(isAlive(false, 2))

