// Nguyễn Thanh Phước - 25810036
fun ghiNhatKyCoUnit(hanhDong: String): Unit {
    println("[LOG]: $hanhDong")
}

fun ghiNhatKyKhongUnit(hanhDong: String) {
    println("[LOG]: $hanhDong")
}

fun main() {
    ghiNhatKyCoUnit("Người dùng đăng nhập thành công")
    ghiNhatKyKhongUnit("Người dùng đăng nhập thành công")
}
