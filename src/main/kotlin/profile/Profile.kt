package org.example.profile


fun main(){
    val person1 = Person("Hon", "Jui", 185, 94)
    val person2 = Person("Hon", "Jui", 185, 94)
    val person3 = person1.copy(name = "Al")
    val people = setOf<Person>(person1, person2, person3)
    for (person in people) {
        println(person)
    }
}
