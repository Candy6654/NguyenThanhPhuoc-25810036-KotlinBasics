// Nguyễn Thanh Phước - 25810036
fun main() {

    val danhSachSach = mutableListOf(
        "Lập trình Kotlin",
        "Android cơ bản",
        "Cấu trúc dữ liệu",
        "Giải thuật nâng cao",
        "Thiết kế giao diện"
    )

    println("---------- DANH SÁCH SÁCH BAN ĐẦU ----------")
    danhSachSach.forEachIndexed { index, tenSach ->
        println("${index + 1}. $tenSach")
    }
    danhSachSach.add("Học máy cơ bản")
    danhSachSach.add("Kiến trúc phần mềm")
    danhSachSach.remove("Cấu trúc dữ liệu")
    danhSachSach.sort()

    println("\n---------- DANH SÁCH SAU KHI THÊM, XOÁ, SẮP XẾP ----------")
    danhSachSach.forEachIndexed { index, tenSach ->
        println("${index + 1}. $tenSach")
    }
}
