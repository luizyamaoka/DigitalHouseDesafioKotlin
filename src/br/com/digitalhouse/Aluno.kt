package br.com.digitalhouse

class Aluno(val codigo: Int, val nome: String, val sobrenome: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigo != other.codigo) return false

        return true
    }

}