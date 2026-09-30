// Nguyễn Thanh Phước - 25810036
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val dienTich1: Double = tinhDienTich(5.0, 3.0)
val dienTich2: Double = tinhDienTich(12.5, 4.2)

val ketQua1 = println("Hình chữ nhật 1 (5.0 x 3.0) có diện tích là: $dienTich1")
val ketQua2 = println("Hình chữ nhật 2 (12.5 x 4.2) có diện tích là: $dienTich2")