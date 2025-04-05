package SudokuGame

import kotlin.math.sqrt

fun main() {
}

fun isSudokuBoardValid(board: List<List<Char>>): Boolean {
    val size = board.size
    val boxSize = sqrt(size.toDouble()).toInt()

    val rows = Array(size) { mutableSetOf<Char>() }
    val columns = Array(size) { mutableSetOf<Char>() }
    val boxes = Array(size) { mutableSetOf<Char>() }

    for (row in 0..< size) {
        for (col in 0..< size) {
            val value = board[row][col]
            if (value == '-') continue

            if (!isValidDigit(value)) return false

            val boxIndex = (row / boxSize) * boxSize + (col / boxSize)

            if (
                !rows[row].add(value) ||
                !columns[col].add(value) ||
                !boxes[boxIndex].add(value)
            ) {
                return false
            }
        }
    }
    return true
}

private fun isValidDigit(ch: Char): Boolean {
    return ch in '1'..'9'
}
