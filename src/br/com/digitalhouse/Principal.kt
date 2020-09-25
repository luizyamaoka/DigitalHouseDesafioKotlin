package br.com.digitalhouse

fun main() {

    val aluno1 = Aluno(1, "Arthur", "Azevedo")
    val aluno2 = Aluno(2, "Bianca", "Brasil")
    val aluno3 = Aluno(3, "Carlos", "Carvalho")
    val aluno4 = Aluno(4, "Danilo", "Dante")
    val aluno5 = Aluno(5, "Elisa", "Eleonora")

    val aluno6 = Aluno(5, "t", "t")

    println("\n# Aluno")
    println("Deveria ser true: ${aluno5 == aluno6}")
    println("Deveria ser false: ${aluno5 == aluno1}")

    val curso1 = Curso(20001, "Full Stack")
    val curso2 = Curso(20002, "Android")

    val curso3 = Curso(20002, "teste")

    println("\n# Curso")
    println("Deveria ser false: ${curso1 == curso2}")
    println("Deveria ser true: ${curso3 == curso2}")

    val professor1 = ProfessorTitular(1, "Felipe", "Fabregas", 0, "Fortran")
    val professor2 = ProfessorTitular(2, "Gabriela", "Giorgi", 0, "Go")
    val professor3 = ProfessorAdjunto(3, "Henrique", "Hana", 0, 0)
    val professor4 = ProfessorAdjunto(4, "Indiana", "Iorq", 0, 0)

    val professor5 = ProfessorAdjunto(3, "teste", "teste", 0, 0)

    println("\n# Professor")
    println("Deveria ser false: ${professor1 == professor2}")
    println("Deveria ser true: ${professor3 == professor5}")

}