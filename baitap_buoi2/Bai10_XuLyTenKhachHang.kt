// Nguyễn Thanh Phước - 25810036
fun xuLyKhachHang(tenKhachHang: String?) {
    println("--- Kiểm tra với dữ liệu: $tenKhachHang ---")
    val doDaiTen: Int? = tenKhachHang?.length
    println("Độ dài tên (Safe call): $doDaiTen")
    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis operator): $tenHienThi")
    if (tenKhachHang != null) {
        val doDaiEpBuoc: Int = tenKhachHang!!.length
        println("Độ dài tên khi chắc chắn không null (!!): $doDaiEpBuoc")
    } else {
        println("Biến đang null, không thể gọi toán tử !! vì sẽ gây lỗi NullPointerException (Crash ứng dụng).")
    }
    println()
}

fun main() {
    xuLyKhachHang("Nguyễn Thanh Phước")
    xuLyKhachHang(null)
}
