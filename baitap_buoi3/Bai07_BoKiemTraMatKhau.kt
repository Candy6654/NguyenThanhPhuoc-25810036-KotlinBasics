// Nguyễn Thanh Phước - 25810036

val kiemTraDoDai: (String) -> Boolean = { matKhau ->
    matKhau.length >= 8
}

fun main() {
    val mk1 = "12345"
    val mk2 = "admin123"
    val mk3 = "KotlinAndroid2026"

    println("Mật khẩu \"$mk1\" (>= 8 ký tự): ${kiemTraDoDai(mk1)}")
    println("Mật khẩu \"$mk2\" (>= 8 ký tự): ${kiemTraDoDai(mk2)}")
    println("Mật khẩu \"$mk3\" (>= 8 ký tự): ${kiemTraDoDai(mk3)}")
}
