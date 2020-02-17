class Main() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val player = Player()
            val playerVsPlayer = PlayerVsPlayer()
            val playerVsComputer = PlayerVsComputer()
            val gameLog = GameLog()
            val score = Score()

            var input:Any

            do {
                println("===================================")
                println("--- Selamat Datang di Game Suit ---")
                println("1. Player Vs Player")
                println("2. Player Vs Computer")
                println("3. Game Log")
                println("4. Score Janken")
                println("5. Keluar Game")
                print("Masukan Pilihan : ")
                input = readLine()!!.toString()
                when(input){
                    "1"-> {
                        player.plaverVsPlayer()
                        playerVsPlayer.masukan1 = player.player1
                        playerVsPlayer.masukan2 = player.player2
                        println("Hasil : ")
                        playerVsPlayer.playerVsPlayer()
                        playerVsPlayer.keluar?.let { gameLog.addListPVP(it) }
                        gameLog.listPemenangPVP?.let { score.addScorePVP(it) }
                    }
                    "2"-> {
                        player.playerVsComputer()
                        playerVsComputer.masukan1 = player.player1
                        playerVsComputer.masukan2 = player.compAi
                        println("Hasil : ")
                        playerVsComputer.playerVsComputer()
                        playerVsComputer.keluar?.let { gameLog.addListPVC(it) }
                        gameLog.listPemenangPVC?.let { score.addScorePVC(it) }
                    }
                    "3"-> {
                        gameLog.cetakGameLog()
                    }
                    "4"-> {
                        score.cetakScore()
                    }
                    "5"-> {
                        println("\n--- Sampai Jumpa ---")
                    }
                    else -> println("EROR!!! Pilihan Tidak Sesuai")
                }
            }while (input !="5")
        }
    }
}
