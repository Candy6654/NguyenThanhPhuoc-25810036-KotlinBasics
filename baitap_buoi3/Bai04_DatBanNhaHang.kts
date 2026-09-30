// Nguyễn Thanh Phước - 25810036
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "bàn thường") {
    println("Đặt bàn thành công -> Khách: $tenKhachHang | Số lượng: $soLuongKhach người | Loại bàn: $loaiBan")
}

println("---------- KẾT QUẢ ĐẶT BÀN NHÀ HÀNG ----------")

datBan("Nguyễn Văn A", 4)


datBan("Trần Thị B", 8, "bàn VIP ngoài trời")


datBan(loaiBan = "phòng riêng gia đình", tenKhachHang = "Lê Văn C", soLuongKhach = 10)