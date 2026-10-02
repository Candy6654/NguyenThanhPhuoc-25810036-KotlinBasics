// Nguyễn Thanh Phước - 25810036

fun String.demNguyenAm(): Int {
    val nguyenAm = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in this.lowercase()) {
        if (char in nguyenAm) count++
    }
    return count
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println("\"Kotlin\": ${"Kotlin".demNguyenAm()} nguyên âm")
    println("\"Android Studio\": ${"Android Studio".demNguyenAm()} nguyên âm")
    println("\"xyz\": ${"xyz".demNguyenAm()} nguyên âm")

    println("Số 7 là nguyên tố: ${7.laSoNguyenTo()}")
    println("Số 10 là nguyên tố: ${10.laSoNguyenTo()}")
    println("Số 17 là nguyên tố: ${17.laSoNguyenTo()}")
}
