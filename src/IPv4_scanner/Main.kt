package IPv4_scanner

fun main() {
    isIPv4Valid("192.168.0.1")
}

fun isIPv4Valid(address: String): Boolean {

    // should return false, when not contain 3 dots and 4 segments
    val segments = address.split(".")

    if (segments.size != 4) return false

    for (segment in segments) {
        // should return false, when numeric range not between 0 and 255
        val value = segment.toIntOrNull() ?: return false
        if (value !in 0..255) return false

        //  should return false when contain non-numeric except '-'
//        if (!segment.all { it.isDigit() }) return false

        // should return false when, there are one or more leading zero(s) (unless it's exactly "0")
        if (segment.length > 1 && segment.startsWith("0")) return false

    }

    // when segment value between 0 and 255 without blank and leading zero
    return true
}
