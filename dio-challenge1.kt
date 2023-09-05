class Usuario(val nome: String, var nivel: String)

data class ConteudoEducacional(var nome: String)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    var conteudo1 = ConteudoEducacional("Kotlin")
    var formacao1 = Formacao("Formação em Kotlin", listOf(conteudo1))
    var conteudo2 = ConteudoEducacional("Java")
    var formacao2 = Formacao("Formação em Java", listOf(conteudo2))

    
    var usuario1 = Usuario("João", "Avançado")
    var usuario2 = Usuario("Antonio", "Intermediário")
    var usuario3 = Usuario("Nelma", "Básico")
    var usuario4 = Usuario("Delazir", "Básico")
    var usuario5 = Usuario("Leontina", "Básico")

    
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)
    
    formacao2.matricular(usuario4)
    formacao2.matricular(usuario5)
   

  
    println("Usuários matriculados na ${formacao1.nome}: ")
    for (usuario in formacao1.inscritos) {
        println("${usuario.nome} - Nível: ${usuario.nivel}")
    
   }
   println("") // Linha em branco para separar os blocos de prints    
    
    println("Usuários matriculados na ${formacao2.nome}: ")
    for (usuario in formacao2.inscritos) {
       println("${usuario.nome} - Nível: ${usuario.nivel}")  
   }
 }
