// Nguyễn Thanh Phước - 25810036
fun main() {
    val soDuBanDau: Double = 5000000.0
    var soDuHienTai: Double = soDuBanDau
    println("Số dư ban đầu: $soDuHienTai VNĐ")
    val tienGui: Double = 2000000.0
    soDuHienTai += tienGui
    println("Gửi thêm $tienGui VNĐ -> Số dư hiện tại: $soDuHienTai VNĐ")


    val tienRut: Double = 1500000.0
    soDuHienTai -= tienRut
    println("Rút bớt $tienRut VNĐ -> Số dư hiện tại: $soDuHienTai VNĐ")
    println("Đối chiếu số dư ban đầu: $soDuBanDau VNĐ")
}
