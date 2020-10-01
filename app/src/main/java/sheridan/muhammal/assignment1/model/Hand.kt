package sheridan.muhammal.assignment1.model

import android.util.Log

class Hand() {
    // zero means not rolled yet
    var value: Int = 0
        set(n) {
            if (n in 0..3) {
                field = n
            } else {
                Log.e("Hand", "Illegal Hand value $n")
                //throw IllegalArgumentException("Illegal die value $n")
            }
        }

    constructor(n: Int) : this() {
        value = n
    }

    fun shuffle() {
        value = (1..3).random()
    }
}