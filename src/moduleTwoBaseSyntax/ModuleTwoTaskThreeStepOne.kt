package moduleTwoBaseSyntax

fun main() {
    val inputName = "Input your name:"
    val inputAge = "Input your age"
    val inputSex = "Input your sex"
    val inputHeight = "Input your height"
    val inputWeight = "Input your weight"
    println(inputName)
    val name = readln();
    println(inputAge)
    val age = readln();
    println(inputSex)
    val sex = readln();
    println(inputHeight)
    val height = readln();
    println(inputWeight)
    val weight = readln();
    println(
        "Your name is: " + name + ", your age is: " + age + ", your sex is: " + sex + ", your height is: " + height +
        ", your weight is: " + weight
    )
}
