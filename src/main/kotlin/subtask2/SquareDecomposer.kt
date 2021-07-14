package subtask2

import kotlin.math.sqrt
//import kotlin.math.pow


class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val sqNumber = number * number
        return squareDecomposer(sqNumber, number - 1)
    }

    private fun squareDecomposer(sqNumber: Int, number: Int): Array<Int>? {
        var newSeqNumber: Int

        for (i in number downTo 1) {
            val iterator =  i*i


            val newSqNumber = sqNumber - iterator
            newSeqNumber = sqrt( newSqNumber.toDouble()).toInt()

            if (newSeqNumber >= i) {
                return null
            }
            if (newSqNumber == 0) {
                return arrayOf(i)
            }

            var seqArray = squareDecomposer(newSqNumber, newSeqNumber)

            if (seqArray == null){
                continue
            }

            else {
                seqArray = seqArray.plus(i)
                return seqArray
            }
        }
        return null
    }

}

