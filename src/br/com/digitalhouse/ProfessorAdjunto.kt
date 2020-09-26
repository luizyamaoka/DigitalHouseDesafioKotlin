package br.com.digitalhouse

class ProfessorAdjunto(
        codigo: Int,
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int = 0,
        val qtdHorasMonitoria: Int): Professor(codigo, nome, sobrenome, tempoDeCasa) {
}