// Nguyễn Thanh Phước - 25810036

class TaiKhoanNganHang(soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản thành công kèm số dư ban đầu: $soDu")
        }
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("112233", 500000.0)
    val tk2 = TaiKhoanNganHang("445566", -1000.0)
}
