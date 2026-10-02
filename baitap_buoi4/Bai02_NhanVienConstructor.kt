// Nguyễn Thanh Phước - 25810036

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV01", "Nguyễn Văn A", 15000000.0)
    val nv2 = NhanVien("Trần Thị B")
    println("${nv2.ten} - Lương: ${nv2.luongThang}")
}
