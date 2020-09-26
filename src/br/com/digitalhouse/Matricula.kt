package br.com.digitalhouse

import java.util.Date

class Matricula(val aluno: Aluno, val curso: Curso, val dataMatricula: Date = Date()) {

    override fun toString(): String {
        return "Matricula($aluno, $curso, data matricula: $dataMatricula)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matricula

        if (aluno != other.aluno) return false
        if (curso != other.curso) return false

        return true
    }

    override fun hashCode(): Int {
        var result = aluno.hashCode()
        result = 31 * result + curso.hashCode()
        return result
    }

}