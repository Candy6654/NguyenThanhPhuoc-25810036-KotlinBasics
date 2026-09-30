// Nguyễn Thanh Phước - 25810036

fun dinhDangDiaChi(
    soNhaVaDuong: String,
    phuongXa: String,
    quanHuyen: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh",
    quocGia: String = "Việt Nam"
): String {
    return "$soNhaVaDuong, $phuongXa, $quanHuyen, $thanhPho, $quocGia"
}

println("---------- KẾT QUẢ ĐỊNH DẠNG ĐỊA CHỈ GIAO HÀNG ----------")

val diaChi1 = dinhDangDiaChi("123 Lê Lợi", "Phường Bến Nghé")
println("Địa chỉ 1: $diaChi1")

val diaChi2 = dinhDangDiaChi(
    "456 CMT8",
    "Phường 10",
    quanHuyen = "Quận 3"
)
println("Địa chỉ 2: $diaChi2")

val diaChi3 = dinhDangDiaChi(
    "789 Nguyễn Văn Cừ",
    "Phường An Khánh",
    quanHuyen = "Quận Ninh Kiều",
    thanhPho = "TP. Cần Thơ"
)
println("Địa chỉ 3: $diaChi3")