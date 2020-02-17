class GameLog () {
    var listPemenangPVP = mutableListOf<String>()
    var listPemenangPVC = mutableListOf<String>()


    fun addListPVP(player:String){
        this.listPemenangPVP.add(player)
    }

    fun addListPVC(computer:String){
        this.listPemenangPVC.add(computer)
    }
    fun cetakGameLog() {
        println("===================================")
        println("--- Game Log Janken ---")
        println("+++ Player Vs Player +++")
        listPemenangPVP.forEachIndexed { index, s ->
            println("Game ke ${index+1} : $s")
        }
        println("\n+++ Player Vs Computer +++")
        listPemenangPVC.forEachIndexed { index, s ->
            println("Game ke ${index+1} : $s")
        }
    }
}