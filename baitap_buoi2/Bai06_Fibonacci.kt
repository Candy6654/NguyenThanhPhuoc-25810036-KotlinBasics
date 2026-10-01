// Nguyễn Thanh Phước - 25810036
fun main() {
    val danhSachFibo = mutableListOf<Int>()
    var soThuNhat: Int = 0
    var soThuHai: Int = 1

    while (soThuNhat < 100) {
        danhSachFibo.add(soThuNhat)
        val tiepTheo: Int = soThuNhat + soThuHai
        soThuNhat = soThuHai
        soThuHai = tiepTheo
    }
    println("---------- DÃY SỐ FIBONACCI NHỎ HƠN 100 ----------")
    for (i in danhSachFibo.indices) {
        println("Vị trí $i: ${danhSachFibo[i]}")
    }
}
