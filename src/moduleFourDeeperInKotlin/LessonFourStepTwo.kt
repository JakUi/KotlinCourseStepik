package moduleFourDeeperInKotlin

class TextMerger {
    fun mergeText(lines: List<String>): String {
        var result = StringBuilder()
        for (line in lines) {
            result.append(line)
            result.append("\n")
        }
        return result.toString()
    }
}
