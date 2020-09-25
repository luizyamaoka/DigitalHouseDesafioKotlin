package br.com.digitalhouse

fun main() {

    val aluno1 = Aluno(1, "Arthur", "Azevedo")
    val aluno2 = Aluno(2, "Bianca", "Brasil")
    val aluno3 = Aluno(3, "Carlos", "Carvalho")
    val aluno4 = Aluno(4, "Danilo", "Dante")
    val aluno5 = Aluno(5, "Elisa", "Eleonora")

    val aluno6 = Aluno(5, "t", "t")

    println(aluno5 == aluno6)
    println(aluno5 == aluno1)

    val curso1 = Curso(20001, "Full Stack")
    val curso2 = Curso(20002, "Android")

    val curso3 = Curso(20002, "teste")

    println(curso1 == curso2)
    println(curso3 == curso2)

}