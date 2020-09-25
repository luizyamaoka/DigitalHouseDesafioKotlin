package br.com.digitalhouse

class ProfessorTitular(
        codigo: Int,
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        val especialidade: String): Professor(codigo, nome, sobrenome, tempoDeCasa) {
}