package br.com.digitalhouse

fun main() {

//    println("\n# Matricula")
//
//    val matricula1 = Matricula(aluno1, curso1)
//    val matricula2 = Matricula(aluno2, curso1)
//    val matricula3 = Matricula(aluno3, curso2)
//    val matricula4 = Matricula(aluno4, curso2)
//    val matricula5 = Matricula(aluno5, curso2)

//    println("$matricula1")

    println("\n# Manager")
    val manager = DigitalHouseManager()

    println("\n# Curso")

    manager.registrarCurso(20001, "Full Stack", 3)
    manager.registrarCurso(20002, "Android", 2)

    println("${manager.cursos}")

    manager.excluirCurso(20001)

    println("${manager.cursos}")

    println("\n# Professor")

    manager.registrarProfessorTitular(1, "Felipe", "Fabregas", "Fortran")
    manager.registrarProfessorTitular(2, "Gabriela", "Giorgi", "Go")
    manager.registrarProfessorAdjunto(3, "Henrique", "Hana", 0)
    manager.registrarProfessorAdjunto(4, "Indiana", "Iorq", 0)

    println("${manager.professores}")

    manager.excluirProfessor(1)
    manager.excluirProfessor(4)

    println("${manager.professores}")

    println("\n# Aluno")

    manager.matricularAluno(1, "Arthur", "Azevedo")
    manager.matricularAluno(2, "Bianca", "Brasil")
    manager.matricularAluno(3, "Carlos", "Carvalho")
    manager.matricularAluno(4, "Danilo", "Dante")
    manager.matricularAluno(5, "Elisa", "Eleonora")

    println("${manager.alunos}")

}