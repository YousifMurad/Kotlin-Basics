package IPv4_scanner

fun main(){
//      -------------Extra segment/ dot---------------
    test(
        name ="should return false when, there is an extra dot(s) except the standard 3 dots ",
        address = ".192.168..0.1.", // three extra dots
        expectedResult = false,
    )
    test(
        name ="should return false when, there is an extra segment(s) ",
        address = "192.168.0.0.1.1", // two extra byte with their dots
        expectedResult = false,
    )
//          ------------Range rules---------------
    test(
        name ="should return false, when, a segment exceed the 255 ",
        address = "256.0.0.0",
        expectedResult = false,
    )
    test(
        name ="should return false, when, a segment below 0 ",
        address = "-1.0.0.0",
        expectedResult = false,
    )
//         ----------Invalid Input type------------
    test(
        name ="should return false when, the segment not-numeric (alphabetic character) ",
        address = "a.0.0.0",
        expectedResult = false,
    )
    test(
        name ="should return false when, the segment not-numeric (special-character except 'dot') ",
        address = "/.0.0.0",
        expectedResult = false,
    )
    test(
        name ="should return false when, the segment has blank ",
        address = " 192 . 0 . 0 . 0",
        expectedResult = false,
    )

//      -------------Leading zero --------------
    test(
        name ="should return false when, there is one or more leading zero ",
        address = "192.168.0.01", // leading zero in  01
        expectedResult = false,
    )

    test(
        name ="should return true, when segment value between 0 and 255 without blank and leading zero",
        address = "192.168.0.1",
        expectedResult = true,
    )
}

fun test(name: String, address: String, expectedResult: Boolean){
    val result= isIPv4Valid(address)
    println("test type: $name")
    if (result == expectedResult) {
        println("-pass")
    } else {
        println("- failed")
    }
}