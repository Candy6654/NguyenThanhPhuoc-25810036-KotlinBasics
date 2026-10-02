// Nguyễn Thanh Phước - 25810036

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int
    
    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 110
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 220
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()
    
    xeMay.moTa()
    oTo.moTa()
}
