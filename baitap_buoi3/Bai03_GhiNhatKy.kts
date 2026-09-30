// Nguyễn Thanh Phước - 25810036

// 1: Khai báo tường minh kiểu trả về là Unit
fun ghiNhatKyCoUnit(hanhDong: String): Unit {
    println("[LOG]: $hanhDong")
}

// 2: Bỏ qua khai báo kiểu trả về Unit
fun ghiNhatKyKhongUnit(hanhDong: String) {
    println("[LOG]: $hanhDong")
}

ghiNhatKyCoUnit("Người dùng đăng nhập thành công")
ghiNhatKyKhongUnit("Người dùng đăng nhập thành công")