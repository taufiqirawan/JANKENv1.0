class Score (){
    var scorePlayer1 = 0
    var scorePlayer2 = 0
    var imbang = 0
    var scorePlayer1PVC = 0
    var scoreComputer = 0
    var imbangPVC = 0

    fun addScorePVP(score:MutableList<String>){
        scorePlayer1 = score.count {
            it.equals("Player 1 Menang", ignoreCase = true)
        }
        scorePlayer2 = score.count {
            it.equals("Player 2 Menang", ignoreCase = true)
        }
        imbang = score.count {
            it.equals("Hasil Seimbang", ignoreCase = true)
        }
    }
    fun addScorePVC(score:MutableList<String>){
        scorePlayer1PVC = score.count {
            it.equals("Player 1 Menang", ignoreCase = true)
        }
        scoreComputer = score.count {
            it.equals("Computer Menang", ignoreCase = true)
        }
        imbangPVC = score.count {
            it.equals("Hasil Seimbang", ignoreCase = true)
        }
    }
    fun cetakScore(){
        println("===================================")
        println("--- Score Janken ---")
        println("+++ Player Vs Player +++")
        println("Player 1 Menang : $scorePlayer1 Kali")
        println("Player 2 Menang : $scorePlayer2 Kali")
        println("Hasil Seimbang  : $imbang Kali")
        println("+++ Player Vs Computer +++")
        println("Player 1 Menang : $scorePlayer1PVC Kali")
        println("Player 2 Menang : $scoreComputer Kali")
        println("Hasil Seimbang  : $imbangPVC Kali")
    }
}