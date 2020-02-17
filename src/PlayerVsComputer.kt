class PlayerVsComputer(){
    var masukan1: String? = null
    var masukan2: String? = null
    var keluar: String? = null
    var error: String? = null


    fun playerVsComputer() {
        if (
            (masukan1.equals("batu", ignoreCase = true) && masukan2.equals("gunting", ignoreCase = true)) ||
            (masukan1.equals("gunting", ignoreCase = true) && masukan2.equals("kertas", ignoreCase = true)) ||
            (masukan1.equals("kertas", ignoreCase = true) && masukan2.equals("batu", ignoreCase = true))
        ) {
            keluar = "Player 1 Menang"
            println(keluar)
        } else if (
            (masukan2.equals("batu", ignoreCase = true) && masukan1.equals("gunting", ignoreCase = true)) ||
            (masukan2.equals("gunting", ignoreCase = true) && masukan1.equals("kertas", ignoreCase = true)) ||
            (masukan2.equals("kertas", ignoreCase = true) && masukan1.equals("batu", ignoreCase = true))
        ) {
            keluar = "Computer Menang"
            println(keluar)
        } else if (
            (masukan1.equals("batu", ignoreCase = true) && masukan2.equals("batu", ignoreCase = true)) ||
            (masukan1.equals("gunting", ignoreCase = true) && masukan2.equals("gunting", ignoreCase = true)) ||
            (masukan1.equals("kertas", ignoreCase = true) && masukan2.equals("kertas", ignoreCase = true))
        ) {
            keluar = "Hasil Seimbang"
            println(keluar)
        } else {
            keluar = "Hasil Eror"
            (println(keluar))
        }
    }
}