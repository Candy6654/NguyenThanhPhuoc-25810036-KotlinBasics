// Nguyễn Thanh Phước - 25810036

fun binhPhuongDayDu(n: Int): Int {
    return n * n
}
fun binhPhuongRutGon(n: Int): Int = n * n

fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Bình phương 5    -> Đầy đủ: ${binhPhuongDayDu(5)} | Rút gọn: ${binhPhuongRutGon(5)}")
    println("Chu vi cạnh 6.5  -> Đầy đủ: ${chuViHinhVuongDayDu(6.5)} | Rút gọn: ${chuViHinhVuongRutGon(6.5)}")
    println("Kiểm tra 8 chẵn? -> Đầy đủ: ${laSoChanDayDu(8)} | Rút gọn: ${laSoChanRutGon(8)}")
}
