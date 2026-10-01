// Nguyễn Thanh Phước - 25810036
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 25000.0

    val tienHang: Double = soLuong.toDouble() * donGia
    val thueVAT: Double = tienHang * 0.08
    val tongTien: Double = tienHang + thueVAT

    println("HÓA ĐƠN MUA HÀNG")
    println("Số lượng sản phẩm : $soLuong")
    println("Đơn giá           : $donGia VNĐ")
    println("Tiền hàng         : $tienHang VNĐ")
    println("Thuế VAT (8%)     : $thueVAT VNĐ")
    println("--------------------------------------")
    println("TỔNG TIỀN PHẢI TRẢ: $tongTien VNĐ")
}
