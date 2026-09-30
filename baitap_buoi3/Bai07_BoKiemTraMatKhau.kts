// Nguyễn Thanh Phước - 25810036

val kiemTraDoDai: (String) -> Boolean = { matKhau ->
    matKhau.length >= 8
}
println("---------- KIỂM TRA ĐỘ DÀI MẬT KHẨU (LAMBDA) ----------")

val mk1 = "12345"
val mk2 = "admin123"
val mk3 = "thanhphuoc123"

println("Mật khẩu: \"$mk1\" -> Hợp lệ (>= 8 ký tự): ${kiemTraDoDai(mk1)}")
println("Mật khẩu: \"$mk2\" -> Hợp lệ (>= 8 ký tự): ${kiemTraDoDai(mk2)}")
println("Mật khẩu: \"$mk3\" -> Hợp lệ (>= 8 ký tự): ${kiemTraDoDai(mk3)}")