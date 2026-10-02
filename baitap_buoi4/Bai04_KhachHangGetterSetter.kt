// Nguyễn Thanh Phước - 25810036

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ")
            if (parts.isNotEmpty()) {
                ho = parts[0]
                ten = if (parts.size > 1) parts.subList(1, parts.size).joinToString(" ") else ""
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyễn", "Phước")
    kh.ten = "Thanh Phước"
    println(kh.hoTen)

    kh.hoTen = "Trần Lê B"
    println("Họ: ${kh.ho} - Tên: ${kh.ten}")
}
