// Nguyễn Thanh Phước - 25810036

fun main() {
    val tuoiKhachHang: Int = 20

    val loaiVe: String = if (tuoiKhachHang < 12) {
        "Vé trẻ em"
    } else if (tuoiKhachHang < 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }
    
    println("Tuổi khách hàng: $tuoiKhachHang")
    println("Loại vé: $loaiVe")
}