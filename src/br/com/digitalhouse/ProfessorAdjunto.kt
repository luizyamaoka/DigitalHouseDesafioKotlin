package br.com.digitalhouse

class ProfessorAdjunto(
        codigo: Int,
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        val qtdHorasMonitoria: Int): Professor(codigo, nome, sobrenome, tempoDeCasa) {
}