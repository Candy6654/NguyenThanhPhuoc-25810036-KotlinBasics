// Nguyễn Thanh Phước - 25810036
fun main() {

    val diemSinhVien: Array<Double> = arrayOf(8.5, 7.0, 9.2, 5.5, 6.8, 4.0, 10.0, 8.0, 7.5, 6.0)

    var tongDiem: Double = 0.0
    var diemCaoNhat: Double = diemSinhVien[0]
    var diemThapNhat: Double = diemSinhVien[0]
    for (diem in diemSinhVien) {
        tongDiem += diem

        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }

        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh: Double = tongDiem / diemSinhVien.size

    println("---------- THỐNG KÊ ĐIỂM SINH VIÊN ----------")
    println("Danh sách điểm : ${diemSinhVien.joinToString(", ")}")
    println("Điểm trung bình: %.2f".format(diemTrungBinh))
    println("Điểm cao nhất  : $diemCaoNhat")
    println("Điểm thấp nhất : $diemThapNhat")
}
