// Nguyễn Thanh Phước - 25810036

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sv1 = SinhVien("25810036", "Nguyễn Thanh Phước", 8.0)
    val sv2 = SinhVien("25810036", "Nguyễn Thanh Phước", 8.0)

    println(sv1)
    
    val bangNhau = (sv1 == sv2)
    println("sv1 == sv2: $bangNhau")
    
    val sv3 = sv1.copy(diemTrungBinh = 9.5)
    println(sv3)
}
