// Nguyễn Thanh Phước - 25810036

class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    val sp1 = SanPham("Laptop", 15000000.0, 10)
    val sp2 = SanPham(tenSanPham = "Chuột không dây", gia = 200000.0)

    println("${sp1.tenSanPham} - Giá: ${sp1.gia} - Tồn kho: ${sp1.soLuongTonKho}")
    println("${sp2.tenSanPham} - Giá: ${sp2.gia} - Tồn kho: ${sp2.soLuongTonKho}")
}