// Nguyễn Thanh Phước - 25810036

println("---------- PHẦN 1: DÙNG MAP NHÂN ĐÔI PHẦN TỬ ----------")
val danhSachSoNguyen: List<Int> = listOf(1, 3, 5, 7, 10)

val danhSachNhanDoi: List<Int> = danhSachSoNguyen.map { it * 2 }

println("Danh sách gốc       : $danhSachSoNguyen")
println("Danh sách nhân đôi  : $danhSachNhanDoi")


println("\n---------- PHẦN 2: DÙNG FLATTEN GỘP DANH SÁCH LỒNG NHAU ----------")

val danhSachLongNhau: List<List<Int>> = listOf(
    listOf(1, 2, 3),
    listOf(4, 5),
    listOf(6, 7, 8, 9)
)

val danhSachPhang: List<Int> = danhSachLongNhau.flatten()

println("Danh sách lồng nhau : $danhSachLongNhau")
println("Danh sách phẳng     : $danhSachPhang")