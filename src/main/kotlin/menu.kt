fun main() {

    val listaProduto = mutableListOf<String>()

    while (true) {

        println("1- Adicionar produto no estoque")
        println("2- Remover produto no estoque")
        println("3- Atualizar produtos do estoque")
        println("4- Listar os produtos do estoque")
        println("5- SAIR do programa")

        print("Digite a função desejada")
        val opc: Int = readLine()!!.toInt()

        when (opc) {
                 1 -> {
                print("Adicione um produto no seu estoque: ")
                val produto: String = readLine()!!
                listaProduto.add(produto)

                if (produto.isEmpty()) {
                    println("Valor inválido!")
                }else { println("Produto adicionado!")}
                }


            2 -> {
                print("Digite o item que deseja remover:")
                val produtoRemove: String = readLine()!!
                listaProduto.remove(produtoRemove)

                if (produtoRemove.isEmpty()) {
                    print("Produto Inválido")
                } else{
                    println("$produtoRemove excluído com sucesso.")
                }
            }

            3 ->{
                print("Selecione um produto de 0 a ${listaProduto.size -1 }")
                val pos= readLine()!!.toInt()

                if (pos in 0 ..(listaProduto.size - 1) ){
                print("Agora digite o produto que será atualizado:")
                    val itemnovo = readLine()

                    if (itemnovo != null) {
                        listaProduto[pos] = itemnovo
                    }
                } else { print("Este código não existe")}
            }

            4 -> {
                listaProduto.forEach() {
                    println(it)
                }
                 }

            5 -> {
                println("Deseja finalizar o programa? (sim/não) ")
                val fimPrograma: String = readLine()!!

                if (fimPrograma == "sim" || fimPrograma == "SIM") {
                    print("Programa finalizado com sucesso!\n")
                    break
                }
               }






        }


    }



}
