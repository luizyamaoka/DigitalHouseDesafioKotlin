package br.com.digitalhouse

import java.util.Date

class Matricula(val aluno: Aluno, val curso: Curso, val dataMatricula: Date = Date()) {

    override fun toString(): String {
        return "Matricula($aluno, $curso, data matricula: $dataMatricula)"
    }

}