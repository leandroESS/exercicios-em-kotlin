package com.example.dio
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

// VERSÃO 1
//USANDO SCANF , SEM TESTAR NULL
// SEM UAR LAÇO DO-WHILE
//InDENTAR CTRL + ALT + L

fun soma(valor1: Float, valor2: Float) {
    println("Você escolheu a opção 1, a opção soma, o resultado é :")
    println(valor1 + valor2)
}

fun sub(valor1: Float, valor2: Float) {
    println("Você escolheu a opção 2, a opção subtração, o resultado é :")
    println(valor1 - valor2)
}

fun multi(valor1: Float, valor2: Float) {
    println("Você escolheu a opção 3, a opção multiplicação, o resultado é :")
    println(valor1 * valor2)
}

fun divi(valor1: Float, valor2: Float) {

    if(valor2 > 0 && valor2 < 0) {
        println("Você escolheu a opção 4, a opção divisão, o resultado é :")
        println(valor1 + valor2)
    }
    else{
        println("Você escolheu a opção 4, a opção divisão, o resultado é :")
        println("Divisão impossível")
    }
}

fun pot(valor1: Float, valor2: Float) {
    println("Você escolheu a opção 5, a opção potenciação, o resultado é :")
    println(valor1.pow(valor2))
}

fun raiz(valor1: Float) {
    println("Você escolheu a opção 6, a opção radiciação, o resultado é :")
    println(sqrt(valor1))
}

fun mod(valor1: Float, valor2: Float) {
    println("Você escolheu a opção 7, a opção módulo, o resultado é :")
    println(valor1%valor2)
}

fun fat(valor1: Float) {
    //valor1.toInt()
    println("Você escolheu a opção 8, a opção fatorial, o resultado é :")
   var fat: Int = valor1.toInt()
    if(fat == 0 || fat == 1){
        print(1)
    }

    for(i in fat - 1 downTo 1){
        fat *=i
    }

    print(fat)


}





fun main() {
    println("Digite dois valores para se calcular")
    //val a = readLine()!! // ele só pega String por isso usei Scanner(System.`in`) e depois converte
    //val b = readLine()!!

    val a = Scanner(System.`in`)
    val b = Scanner(System.`in`)

    val valor1:Float = a.nextFloat()
    val valor2:Float = b.nextFloat()

    print(valor1.javaClass.name)


    println("\nDigite um número correspondente a operação que você deseja")
    println("Observação: Caso for umaoperação unária ele ira considerá apenas o primeiro número\n")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Potenciação")
    println("6 - Raiz quadrada")
    println("7 - Módulo")
    println("8 - fatorial")
    val c = Scanner(System.`in`)

    val operacao:Int = c.nextInt()
    //print(c.javaClass.name) // saber o tipo da variável
    when(operacao){
        1 -> soma(valor1, valor2)
        2 -> sub(valor1,valor2)
        3 -> multi(valor1,valor2)
        4 -> divi(valor1,valor2)
        5 -> pot(valor1,valor2)
        6 -> raiz(valor1)
        7 -> mod(valor1,valor2)
        8 -> fat(valor1)
    }




}


