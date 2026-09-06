fun main() {
    println("Ho ten: Doan Ngoc Tuong")
    println("MSV: 2415053122348")

    print("Nhap diem math: ")
    val math = readln().toDouble()

    print("Nhap diem programming: ")
    val programming = readln().toDouble()

    print("Nhap diem database: ")
    val database = readln().toDouble()

    val total = math + programming + database
    val average = total / 3
    val maxScore = maxOf(math, programming, database)

    val result = if (average >= 5.0) {
        "Dat"
    } else {
        "Khong dat"
    }

    println("Tong diem: $total")
    println("Diem trung binh: %.2f".format(average))
    println("Diem cao nhat: $maxScore")
    println("Sinh vien: $result")
}