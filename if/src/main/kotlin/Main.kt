fun main () {
    println("Максимум из двух чисел")
    println("(3, 5)\t${maxNum(3, 5)}" +
            "\n(3, 2)\t${maxNum(3, 2)}" +
            "\n(3, 3)\t${maxNum(3, 3)}")

    println("\nПароль")
    print("(qwerty, qwerty)\t\t\t")
    passCheck("qwerty", "qwerty")
    print("(qwerty, Qwerty)\t\t\t")
    passCheck("qwerty", "Qwerty")
    print("(PythonROCKS, PythonROCKS)\t")
    passCheck("PythonROCKS", "PythonROCKS")

    println("\nЧетное число")
    print("4\t")
    evenNum(4)
    print("3\t")
    evenNum(3)

    println("\nДелимость")
    print("(4, 2)\t")
    divWhole(4, 2)
    print("(3, 2)\t")
    divWhole(3, 2)

    println("\nЗнак числа")
    println("-4\t${sign(-4)}\n" +
            "0\t${sign(0)}\n" +
            "50\t${sign(50)}")

    println("\nТрехзначное число")
    print("21\t\t")
    triDigit(21)
    print("300\t\t")
    triDigit(300)
    print("1995\t")
    triDigit(1995)


}

fun maxNum(num1: Int, num2: Int): Int {
    if (num1 > num2) return num1
    else return num2
}

fun passCheck (password: String, input: String) {
    if (password == input) println("Пароль принят")
    else println("Пароль не принят")
}

fun evenNum (num: Int) {
    if (num % 2 == 0) println("YES")
    else println("NO")
}

fun divWhole (num1: Int, num2: Int) {
    if (num1 % num2 == 0) println("YES")
    else println("NO")
}

fun sign (num: Int): Int {
    when {
        num > 0 -> return 1
        num < 0 -> return -1
        else -> return 0
    }
}

fun triDigit (num: Int) {
    if (num in 100 .. 1000) {
        println("YES")
    }
    else println("NO")
}

fun range1 (num: Int) {

}

fun range2(num: Int) {
    
}
