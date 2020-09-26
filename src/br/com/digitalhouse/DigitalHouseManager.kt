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

    fun registrarProfessorTitular(codigo: Int, nome: String, sobrenome: String, especialidade: String) : Boolean =
            professores.add(ProfessorTitular(codigo, nome, sobrenome, especialidade=especialidade))

    fun excluirProfessor(codigo: Int) : Boolean = professores.remove(ProfessorAdjunto(codigo, "excluir", "excluir", qtdHorasMonitoria=0))

    fun matricularAluno(codigo: Int, nome: String, sobrenome: String) : Boolean = alunos.add(Aluno(codigo, nome, sobrenome))

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int): Boolean {
        val aluno = alunos.find { it == Aluno(codigoAluno, "encontrar", "encontrar") }
        if (aluno == null) {
            println("Aluno com $codigoAluno nao encontrado")
            return false
        }

        val curso = cursos.find { it == Curso(codigoCurso, "encontrar", 0) }
        if (curso == null) {
            println("Curso com $codigoCurso nao encontrado")
            return false
        }

        if (matriculas.find { it.curso == curso && it.aluno == aluno } != null) {
            println("$aluno ja matriculado no $curso")
            return false
        } else if (matriculas.filter { it.curso == curso }.size < curso.qtdMaxAlunos) {
            println("$aluno matriculado no $curso com sucesso")
            return matriculas.add(Matricula(aluno, curso))
        } else {
            println("Nao ha vagas disponiveis para o $curso")
            return false
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) : Boolean {
        val curso = cursos.find { it == Curso(codigoCurso, "encontrar", 0) }
        if (curso == null) {
            println("Curso com $codigoCurso nao encontrado")
            return false
        }

        val professorTitular = professores.find { it is ProfessorTitular && it == ProfessorTitular(codigoProfessorTitular, "", "", 0, "") }
        if (professorTitular == null) {
            println("Professor titular com $codigoProfessorTitular nao encontrado")
            return false
        }

        val professorAdjunto = professores.find { it is ProfessorAdjunto && it == ProfessorAdjunto(codigoProfessorAdjunto, "", "", 0, 0) }
        if (professorAdjunto == null) {
            println("Professor adjunto com $codigoProfessorAdjunto nao encontrado")
            return false
        }

        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
        curso.professorTitular = professorTitular as ProfessorTitular
        return true
    }

}