enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
      inscritos.add(usuario)
      println("Matricula de ${usuario.nome} realizada com sucesso na formação: ${nome}.")
    }
}

fun main() {
    
    val conteudo1 = ConteudoEducacional("Introdução à Lógica de programação")
	val conteudo2 = ConteudoEducacional("Introdução à Sintaxe Kotlin", 120)
	val conteudo3 = ConteudoEducacional("Estrutura de Dados", 90)
 
 	var formacao = Formacao("Desenvolvimento backend com Kotlin", listOf(conteudo1, conteudo2, conteudo3))
 
 	val usuario1 = Usuario("Donald Trump")
 	val usuario2 = Usuario("Geraldo Luíz")
    val usuario3 = Usuario("Tiringa")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
 
 	println("")
 	println("Inscritos na Formação ${formacao.nome}: ${formacao.inscritos.map {it.nome} }")
    println("")
    println("Conteúdos Do Curso: ${formacao.conteudos.map {it.nome}}")
}