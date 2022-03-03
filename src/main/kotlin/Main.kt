fun main() {
    /*
  Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

--Armazenar dados da List
--Remover dados da list;
--Atualizar dados da list.
--Apresentar todos os dados da list.
   */
    var fimPrograma: String = "sim"
    val listaProduto = mutableListOf<String>()

    while (fimPrograma == "sim" || fimPrograma == "SIM") {


        do {
            print("Digite o produto que há no seu estoque: ")
            val produto: String = readLine()!!
            listaProduto.add(produto)

            println("Deseja continuar (sim/não)?")
            val resposta: String = readLine()!!

        } while (resposta == "sim" || resposta == "SIM")
        println("Os produtos do estoque agora são:")

        listaProduto.forEach() {
            println(it)
        }

        do {
            println("Deseja remover algum item do seu estoque? (sim/não)")
            val perguntaRemove: String = readLine()!!


            if (perguntaRemove == "sim" || perguntaRemove == "SIM") {
                print("Digite o item que deseja remover:")
                val produtoRemove: String = readLine()!!
                listaProduto.remove(produtoRemove)
            }


        } while (perguntaRemove == "sim" || perguntaRemove == "SIM")

        println("Os produtos do estoque agora são:")
        listaProduto.forEach() {
            println(it)
        }
        println("Deseja finalizar o programa? (sim/não) ")
        val fimPrograma: String = readLine()!!
        if (fimPrograma == "sim" || fimPrograma == "SIM") {
            print("Programa finalizado com sucesso!\n")
            break
        }

        println("Os produtos FINAIS do estoque agora são:")
        listaProduto.forEach() {
            println(it)
        }

    }



}



