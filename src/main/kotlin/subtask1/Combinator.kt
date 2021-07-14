package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        val numberOfColors = array[1]
        val postersNumber = array[0]

        var combinationsNumbFinal: Int? = null

        fun factorialCount (numberOfColors: Int): Double {
               if (numberOfColors < 2) {
                   return 1.0
               } else {
                   return numberOfColors * factorialCount(numberOfColors-1)
               }
        }

        for (i in 1..numberOfColors) {
            val combinationNumber = factorialCount(numberOfColors) / (factorialCount(i) * factorialCount(numberOfColors - i))
            if (combinationNumber.toInt()==postersNumber) {
                combinationsNumbFinal = i
                break
            }
        }
        return combinationsNumbFinal
    }

}