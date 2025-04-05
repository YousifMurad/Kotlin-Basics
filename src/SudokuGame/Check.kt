package SudokuGame

fun main(){
    test(
        name = "should return False, when there is a repeated number in the same 3x3 subgrid",
        board = listOf(
            listOf('5', '5', '-',    '-', '7', '-',     '9', '-', '2'),
            listOf('-', '-', '2',    '-', '-', '5',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )
    test(
        name = "should return False, when there is a repeated number in the same row",
        board = listOf(
            listOf('5', '-', '-',    '5', '7', '-',     '9', '-', '2'), // number 5 duplicated: invalid row
            listOf('-', '-', '2',    '-', '-', '-',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '-', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )

    test(
        name = "should return False, when there is a repeated number in the same column",
        board = listOf(
            listOf('5', '4', '-',    '-', '7', '-',     '9', '-', '2'),
            listOf('-', '-', '2',    '-', '-', '5',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('9', '5', '-',    '-', '-', '-',     '-', '2', '3'), // 4x1 element
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'), // 7x1 element
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )
    test(
        name = "should return False, when there is an alphabetic character",
        board = listOf(
            listOf('a', '5', '-',    '-', '7', '-',     '9', '-', '2'),
            listOf('-', '-', '2',    '-', '-', '5',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )
    test(
        name = "should return False, when there is a special character except the '-' ",
        board = listOf(
            listOf('/', '5', '-',    '-', '7', '-',     '9', '-', '2'),
            listOf('-', '-', '2',    '-', '-', '5',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )
    test(
        name = "should return False, when there is 0",
        board = listOf(
            listOf('0', '5', '-',    '-', '7', '-',     '9', '-', '2'),// zero
            listOf('-', '-', '2',    '-', '-', '5',     '-', '-', '-'),
            listOf('1', '-', '8',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= false
    )
    test(
        name = "should return True, when number in range between 1 to 9 without repeated number in same row, column and subgrid ",
        board = listOf(
            listOf('-', '-', '-',    '-', '7', '-',     '9', '-', '2'),
            listOf('-', '-', '-',    '-', '-', '5',     '-', '-', '-'),
            listOf('-', '-', '-',    '3', '4', '2',     '5', '-', '7'),

            listOf('-', '5', '-',    '-', '-', '-',     '-', '2', '3'),
            listOf('4', '-', '6',    '8', '-', '3',     '-', '-', '1'),
            listOf('-', '1', '-',    '-', '2', '-',     '8', '5', '-'),

            listOf('9', '6', '1',    '5', '-', '7',     '-', '-', '4'),
            listOf('2', '-', '7',    '4', '1', '9',     '-', '3', '-'),
            listOf('3', '-', '5',    '2', '-', '6',     '1', '-', '9'),
        ),
        expectedResult= true
    )
}

fun test(name: String, board: List<List<Char>>, expectedResult: Boolean){
    val result = isSudokuBoardValid(board)
    println("test type: $name")
    if (result == expectedResult) {
        println("- pass")
    } else {
        println("- failed")
    }
}
