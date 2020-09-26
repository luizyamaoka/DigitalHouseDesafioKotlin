package br.com.digitalhouse

class DigitalHouseManager() {

    val alunos = mutableSetOf<Aluno>()
    val professores = mutableSetOf<Professor>()
    val cursos = mutableSetOf<Curso>()
    val matriculas = mutableSetOf<Matricula>()

    fun registrarCurso(codigo: Int, nome: String, qtdMaxAlunos: Int) = cursos.add(Curso(codigo, nome, qtdMaxAlunos))

    fun excluirCurso(codigo: Int) : Boolean = cursos.remove(Curso(codigo, "para excluir", 0))

}