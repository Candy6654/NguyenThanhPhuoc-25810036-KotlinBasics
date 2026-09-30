// Nguyễn Thanh Phước - 25810036

val danhSachNhacCu = listOf("Guitar", "Piano", "Gáo", "Trống", "Ghi-ta điện", "Violin", "Glockenspiel", "Sáo")
val chuCaiBatDau = "G"

println("---------- KẾT QUẢ BÀI 09: SO SÁNH LỌC EAGER VÀ LAZY ----------")
println("Danh sách gốc: $danhSachNhacCu")
println("Lọc các nhạc cụ bắt đầu bằng chữ '$chuCaiBatDau':\n")


val ketQuaEager = danhSachNhacCu.filter { it.startsWith(chuCaiBatDau, ignoreCase = true) }
println("Lọc Eager (filter thông thường): $ketQuaEager")

val ketQuaLazy = danhSachNhacCu
    .asSequence()
    .filter { it.startsWith(chuCaiBatDau, ignoreCase = true) }
    .toList()
println("Lọc Lazy (thông qua Sequence) : $ketQuaLazy")