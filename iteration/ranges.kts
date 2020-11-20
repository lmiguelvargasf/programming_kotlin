val oneToFive = 1..5
val aToE = 'a'..'e'
val seekHelp = "hell".."help"
val seekHelp2 : ClosedRange<String> = "hell".."help"

//println(oneToFive::class)
//println(aToE::class)
//println(seekHelp::class)
//println(seekHelp2::class)

//println(seekHelp.contains("helm")) 
//println(seekHelp.contains("helq")) //false
for (i in 1..5) { print("$i, ") } 
println()
for (ch in 'a'..'e') { print(ch) } // abcde
println()
//for (word in "hell".."help") { print("$word, ") } //ERROR
for (i in 5 downTo 1) { print("$i, ") } //5, 4, 3, 2, 1,
println()

