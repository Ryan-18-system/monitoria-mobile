package orientacao_objeto


// Questão 1
class Produto {
    var nome: String
    var preco: Double
    constructor(nome:String, preco:Double){
        this.nome = nome
        this.preco = preco
    }
    constructor(nome:String){
        this.preco = 0.0
        this.nome = nome
    }

    override fun toString(): String {
        return  "Nome do produto ${this.nome} e o preço é ${this.preco}"
    }
}
// Questão 2
class Cliente {
    var nome: String = ""
    var idade: Int = 0
        get() = field
        set(value) {
            println("ENTROU NO SET")
            if (value >= 0) {
                field = value
            } else {
                println("Idade não pode ser negativa.")
            }
        }

    fun mostrarIdade(){
        println("Idade do meliante é $idade")
    }
    // Utilize os modificadores de visibilidade para definir os atributos nome e idade conforme especificado na questão

    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
}

// Questão 3
abstract class Personagem {
    // Crie um método abstrato atacar() conforme especificado na questão
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Guerreiro]
        println("ATACANDO COM UMA ESPADA")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Mago
        println("ATACANDO COM MAGIA")

    }
}

// Questão 4
interface FormaGeometrica {
    // Declare um método abstrato calcularArea() conforme especificado na questão
    fun calcularArea() : Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Retangulo conforme especificado na questão
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Circulo conforme especificado na questão
        return Math.PI * (raio * raio)
    }
}

//// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field
        set(value){
            field = value.capitalize()
        }
    private var saldo: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0.0) {
                field = value
            } else {
                println("O saldo não pode ser negativo.")
            }
        }
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("O valor do depósito deve ser positivo.")
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente ou valor de saque inválido.")
        }
    }

    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão

    // Implemente override do setter para o atributo saldo conforme especificado na questão
}
fun main() {
    // Crie instâncias das diferentes classes Produto utilizando os seus construtores e imprima os detalhes de cada produto.
    val produto1 = Produto("maçã",89.0)
    val produto2 = Produto("banana",89.0)
    val produto3 = Produto("uva",89.0)
    println( produto1.toString())
   println( produto2.toString())
    println( produto3.toString())
    // Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.
    val cliente1 = Cliente()
    cliente1.nome = "Ryan"
    cliente1.idade = 22
    cliente1.mostrarIdade()
    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
    val mago = Mago()
    val guerreiro = Guerreiro()
    mago.atacar()
    guerreiro.atacar()
    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
    val retangulo = Retangulo(2.0,2.0)
    val circulo = Circulo(2.0)
    println( retangulo.calcularArea())
    println( circulo.calcularArea())
    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
    val conta = ContaBancaria()
    conta.nomeTitular = "raqueline"
    conta.depositar(100.0)
    conta.sacar(592.00)
}



