package br.com.digitalhouse

class Curso(val codigo: Int, val nome: String, val qtdMaxAlunos: Int) {

    var professorTitular : ProfessorTitular? = null
    var professorAdjunto : ProfessorAdjunto? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "Curso #$codigo: $nome"
    }

    override fun hashCode(): Int {
        return codigo
    }

}