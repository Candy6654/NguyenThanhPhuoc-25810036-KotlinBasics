// Nguyễn Thanh Phước - 25810036

interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hv = HinhVuong(5.0)
    val ht = HinhTron(3.0)
    
    println("Diện tích hình vuông: ${hv.tinhDienTich()}")
    println("Diện tích hình tròn: ${ht.tinhDienTich()}")
}
