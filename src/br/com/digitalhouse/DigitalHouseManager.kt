package br.com.digitalhouse

class DigitalHouseManager() {

    val alunos = mutableSetOf<Aluno>()
    val professores = mutableSetOf<Professor>()
    val cursos = mutableSetOf<Curso>()
    val matriculas = mutableSetOf<Matricula>()

    fun registrarCurso(codigo: Int, nome: String, qtdMaxAlunos: Int): Boolean = cursos.add(Curso(codigo, nome, qtdMaxAlunos))
    fun excluirCurso(codigo: Int) : Boolean = cursos.remove(Curso(codigo, "para excluir", 0))

    fun registrarProfessorAdjunto(codigo: Int, nome: String, sobrenome: String, qtdHorasMonitoria: Int) : Boolean =
            professores.add(ProfessorAdjunto(codigo, nome, sobrenome, qtdHorasMonitoria=qtdHorasMonitoria))

}