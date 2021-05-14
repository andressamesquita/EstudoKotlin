import br.com.alura.bytebank.modelo.Endereco
import exception.SaldoInsuficienteException
import teste.testaExpressao
import java.lang.NumberFormatException

fun main() {
    println("início main")

    funcao1()
    println("fim main")
}



fun funcao1(){
    println("início funcao1")

    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println(e.stackTraceToString())
        println("SaldoInsuficienteException foi pega")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5){
        println(i)
        throw SaldoInsuficienteException("Saldo insuficiente");
    }


    println("fim funcao2")
}