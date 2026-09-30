// Nguyễn Thanh Phước - 25810036


fun xuLyVanBan(chuoi: String, hamXuLy: (String) -> String): String {
    return hamXuLy(chuoi)
}


fun chuyenChuHoa(s: String): String {
    return s.uppercase()
}

println("---------- KẾT QUẢ BÀI 08: XỬ LÝ VĂN BẢN ----------")

val vanBanGoc = "lap trinh android kotlin"


val ketQua1 = xuLyVanBan(vanBanGoc, { str -> str.reversed() })
println("Cách 1 (Lambda tại chỗ - Đảo ngược chuỗi): $ketQua1")


val ketQua2 = xuLyVanBan(vanBanGoc, ::chuyenChuHoa)
println("Cách 2 (Function reference ::chuyenChuHoa): $ketQua2")


val ketQua3 = xuLyVanBan(vanBanGoc) { str ->
    str.replace(" ", "_")
}
println("Cách 3 (Trailing lambda - Thay khoảng trắng bằng gạch dưới): $ketQua3")