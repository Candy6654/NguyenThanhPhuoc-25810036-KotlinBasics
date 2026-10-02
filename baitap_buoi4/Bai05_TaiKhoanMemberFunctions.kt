// Nguyễn Thanh Phước - 25810036

class TaiKhoanNganHang(soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) println("So du khong hop le")
    }

    fun napTien(soTien: Double) {
        if (soTien > 0) soDu += soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien
            return true
        }
        return false
    }
}

fun main() {
    val tk = TaiKhoanNganHang("12345", 1000.0)
    
    tk.napTien(500.0)
    println("Số dư sau khi nạp: ${tk.soDu}")
    
    val rutThanhCong = tk.rutTien(300.0)
    println("Rút tiền thành công: $rutThanhCong - Số dư hiện tại: ${tk.soDu}")
    
    val rutThatBai = tk.rutTien(5000.0)
    println("Rút tiền thành công: $rutThatBai - Số dư hiện tại: ${tk.soDu}")
}
