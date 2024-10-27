import kotlin.math.pow

fun main() {

    //Задача 3
    val array = arrayOf("Привет","как", null, "дела")
    val cleanArray = array.filterNotNull().toTypedArray()
    println(cleanArray.contentToString())
}

//Функция для задачи 1
fun getMyFavoriteBook(book: String?): String {
    return if (book != null) "Моя любимая книга: $book" else "У меня нет любимой книги"
}

//Функция для задачи 2
fun divideIfWhole(number: Int, divisor: Int): Int? {
    var count: Int? = null
    if (number % divisor == 0) count = 1
    count ?: return null
    while ((number % divisor.toDouble().pow(count)) == 0.0) count++
    return count - 1
}