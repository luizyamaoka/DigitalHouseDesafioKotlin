package br.com.digitalhouse

abstract class Professor(val codigo: Int, val nome: String, val sobrenome: String, val tempoDeCasa: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProfessorTitular && other !is ProfessorAdjunto) return false

        other as Professor

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "Professor #$codigo: $nome $sobrenome"
    }

    override fun hashCode(): Int {
        return codigo
    }
}