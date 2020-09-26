package br.com.digitalhouse

fun main() {

    println("\n# Manager")
    val manager = DigitalHouseManager()

    println("\n# Curso")

    manager.registrarCurso(20001, "Full Stack", 3)
    manager.registrarCurso(20002, "Android", 2)
    manager.registrarCurso(20003, "Node.js", 10)

    println("${manager.cursos}")

    manager.excluirCurso(20003)

    println("${manager.cursos}")

    println("\n# Professor")

    manager.registrarProfessorTitular(1, "Felipe", "Fabregas", "Fortran")
    manager.registrarProfessorTitular(2, "Gabriela", "Giorgi", "Go")
    manager.registrarProfessorAdjunto(3, "Henrique", "Hana", 0)
    manager.registrarProfessorAdjunto(4, "Indiana", "Iorq", 0)

    manager.registrarProfessorTitular(5, "Julia", "Janarelli", "Go")
    manager.registrarProfessorAdjunto(6, "Kevin", "Kani", 0)

    println("${manager.professores}")

    manager.excluirProfessor(5)
    manager.excluirProfessor(6)

    println("${manager.professores}")

    println("\n# Aluno")

    manager.matricularAluno(1, "Arthur", "Azevedo")
    manager.matricularAluno(2, "Bianca", "Brasil")
    manager.matricularAluno(3, "Carlos", "Carvalho")
    manager.matricularAluno(4, "Danilo", "Dante")
    manager.matricularAluno(5, "Elisa", "Eleonora")

    println("${manager.alunos}")

    println("\n# Matricula")

    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)
    manager.matricularAluno(3, 20002)
    manager.matricularAluno(4, 20002)
    manager.matricularAluno(5, 20002)

    println("${manager.matriculas}")

    println("\n# Alocacao professor")

    manager.alocarProfessores(20001, 1, 3)
    manager.alocarProfessores(20002, 2, 4)

    println(manager.cursos.first().professorTitular)
    println(manager.cursos.first().professorAdjunto)

}