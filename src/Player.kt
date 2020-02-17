class Player(){
    var player1: String? = null
    var player2: String? = null
    var compAi: String? = null

    fun plaverVsPlayer(){
        println("===================================")
        println("--- Player Vs Player ---")
        print("Masukan Player 1 : ")
        player1 = readLine()!!.toString()
        print("Masukan Player 2 : ")
        player2 = readLine()!!.toString()
    }
    fun playerVsComputer(){
        println("===================================")
        println("--- Player Vs Computer ---")
        print("Masukan Player 1 : ")
        player1 = readLine()!!.toString()
        val random = listOf("Batu", "Kertas", "Gunting")
        compAi = random.random()
        println("Masukan Computer : $compAi")
    }
}