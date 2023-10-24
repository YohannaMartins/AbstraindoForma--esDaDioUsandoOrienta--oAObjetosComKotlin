enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação ${nome}.")
    }
}

fun main() {
    // Criando alguns usuários e conteúdos educacionais
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")
    
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Banco de Dados Avançado", 90)
    
    // Criando uma formação e matriculando usuários
    val formacao = Formacao("Desenvolvedor Full Stack", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}