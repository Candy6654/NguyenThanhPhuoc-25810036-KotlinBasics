// Nguyễn Thanh Phước - 25810036

fun main() {
    val danhSachNhacCu = listOf("Guitar", "Piano", "Gáo", "Trống", "Ghi-ta điện", "Violin", "Sáo")
    val chuCaiBatDau = "G"
    val ketQuaEager = danhSachNhacCu.filter { it.startsWith(chuCaiBatDau, ignoreCase = true) }
    val ketQuaLazy = danhSachNhacCu
        .asSequence()
        .filter { it.startsWith(chuCaiBatDau, ignoreCase = true) }
        .toList()

    println("Danh sách gốc: $danhSachNhacCu")
    println("Lọc thông thường (Eager): $ketQuaEager")
    println("Lọc qua Sequence (Lazy) : $ketQuaLazy")
}
