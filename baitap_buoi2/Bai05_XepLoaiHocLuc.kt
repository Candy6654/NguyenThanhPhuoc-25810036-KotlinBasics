// Nguyễn Thanh Phước - 25810036
fun main() {
    val diemTrungBinh: Double = 8.6
    val xepLoai: String = when (diemTrungBinh) {
        in 9.0..10.0 -> "Xuất sắc"
        in 8.0..<9.0 -> "Giỏi"
        in 6.5..<8.0 -> "Khá"
        in 5.0..<6.5 -> "Trung bình"
        in 0.0..<5.0 -> "Yếu"
        else -> "Điểm số không hợp lệ"
    }
    println("---------- XẾP LOẠI HỌC LỰC ----------")
    println("Điểm trung bình : $diemTrungBinh")
    println("Xếp loại        : $xepLoai")
}
