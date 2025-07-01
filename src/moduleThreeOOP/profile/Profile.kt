package moduleThreeOOP.profile

//fun main(){
//    val first: Person = Person()
//    val second = Person()
////    print("Input your name: ")
////    val name = readln()
////    print("Input your age: ")
////    val age = readln().toInt()
////    println("Name: $name\nage: $age")//
//
//    print("Input 1st name: ")
//    first.name = readln()
//    print("Input 2nd name: ")
//    second.name = readln()
//    print("Input 1st age: ")
//    first.age = readln().toInt()
//    print("Input 2nd age: ")
//    second.age = readln().toInt()
//    print("Input 1st height: ")
//    first.height = readln().toInt()
//    print("Input 2nd height: ")
//    second.height = readln().toInt()
//    print("Input 1st weight: ")
//    first.weight = readln().toInt()
//    print("Input 2nd weight: ")
//    second.weight = readln().toInt()
//    println("1.\nName: ${first.name}\nage: ${first.age}\nheight: ${first.height}\nweight: ${first.weight}")
//    println("2.\nName: ${second.name}\nage: ${second.age}\nheight: ${second.height}\nweight: ${second.weight}")
//
//    first.sayHello()
//    second.sayHello()
//    first.running()
//    second.running()
//}

fun main(){
//    val first = Person()
//    val second = Person()

    print("Input 1st name: ")
    val name = readln()
    print("Input 2nd name: ")
    val name2 = readln()
    print("Input 1st age: ")
    val age = readln().toInt()
    print("Input 2nd age: ")
    val age2 = readln().toInt()
    print("Input 1st height: ")
    val height = readln().toInt()
    print("Input 2nd height: ")
    val height2 = readln().toInt()
    print("Input 1st weight: ")
    val weight = readln().toInt()
    print("Input 2nd weight: ")
    val weight2 = readln().toInt()

//    first.init(name = name, age = age, height = height, weight = weight)
//    second.init(name = name2, age = age2, height = height2, weight = weight2)//
    val first = Person(name = name, height = height, weight = weight)
    val second = Person(name = name2, height = height2, weight = weight2)
    first.age = age
    second.age = age2
    first.printPersonInfo()
    second.printPersonInfo()
    first.age = 0
    second.age = 0
    first.sayHello()
    second.sayHello()
    first.running()
    second.running()
}
