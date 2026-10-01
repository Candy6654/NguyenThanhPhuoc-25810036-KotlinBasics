// Nguyễn Thanh Phước - 25810036
fun main() {
    println("---------- ĐẾM NGƯỢC TỪ 10 VỀ 1 (DÙNG WHILE) ----------")
    var dem: Int = 10
    while (dem >= 1) {
        println("Đếm ngược: $dem")
        dem--
    }
    println("\n---------- LẶP CỐ ĐỊNH 5 LẦN (DÙNG REPEAT) ----------")
    repeat(5) { lanLap ->
        println("Lần ${lanLap + 1}: Lập trình Kotlin cơ bản với Android Studio")
    }
}
