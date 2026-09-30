// Nguyễn Thanh Phước - 25810036

//Tính bình phương một số
fun binhPhuong(n: Int): Int {
    return n * n
}
//rút gọn
fun binhPhuongRutGon(n: Int): Int = n * n

//Tính chu vi hình vuông
//đầy đủ:
fun chuViHinhVuong(canh: Double): Double {
    return canh * 4
}
//rút gọn
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

//Kiểm tra số chẵn
//đầy đủ
fun laSoChan(n: Int): Boolean {
    return n % 2 == 0
}
//rút gọn
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

println("---------- SO SÁNH KẾT QUẢ BÀI 06 ----------")
println("Bình phương của 5:")
println(" - Bản đầy đủ : ${binhPhuong(5)}")
println(" - Bản rút gọn: ${binhPhuongRutGon(5)}")

println("\nChu vi hình vuông cạnh 6.5:")
println(" - Bản đầy đủ : ${chuViHinhVuong(6.5)}")
println(" - Bản rút gọn: ${chuViHinhVuongRutGon(6.5)}")

println("\nKiểm tra số 8 có phải số chẵn:")
println(" - Bản đầy đủ : ${laSoChan(8)}")
println(" - Bản rút gọn: ${laSoChanRutGon(8)}")