// Nguyễn Thanh Phước - 25810036

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuongXa: String = "Phường Bến Nghé",
    quanHuyen: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha $tenDuong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi("123", "Lê Lợi")
    val diaChi2 = dinhDangDiaChi("456", "Nguyễn Huệ", quanHuyen = "Quận 3")
    val diaChi3 = dinhDangDiaChi(
        "789", 
        "Hùng Vương", 
        phuongXa = "Phường An Khánh", 
        quanHuyen = "Quận Ninh Kiều", 
        thanhPho = "TP. Cần Thơ"
    )

    println("Địa chỉ 1: $diaChi1")
    println("Địa chỉ 2: $diaChi2")
    println("Địa chỉ 3: $diaChi3")
}
