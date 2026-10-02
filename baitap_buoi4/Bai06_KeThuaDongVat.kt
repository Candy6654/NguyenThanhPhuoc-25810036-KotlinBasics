// Nguyễn Thanh Phước - 25810036

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Âm thanh động vật"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat = listOf(Cho("Cậu Vàng"), Meo("Mimi"))
    
    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten} kêu: ${dongVat.keu()}")
    }
}
