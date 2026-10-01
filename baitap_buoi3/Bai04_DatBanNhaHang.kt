// Nguyễn Thanh Phước - 25810036
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "bàn thường") {
    println("Đặt bàn thành công -> Khách: $tenKhachHang | Số lượng: $soLuongKhach | Loại bàn: $loaiBan")
}

fun main() {
    datBan("Nguyễn Văn A", 4)
    datBan("Trần Thị B", 8, "bàn VIP ngoài trời")
    datBan(loaiBan = "phòng riêng", tenKhachHang = "Lê Văn C", soLuongKhach = 10)
}
