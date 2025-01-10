package org.example

import org.example.Utiles.*
import org.example.Utiles.readInt
import kotlin.math.log


fun entrada(){
    val line = "_"
    val linea = line.repeat(26)
    println("$GREEN FACTORIAL CALCULATOR!n $RESET")
    println()//Space

}
fun calculoFactorial(){
    var continuar = true
    while (continuar) {
        println("Write (factorial) for calculate factorial, (bits) for calculate bits and (end) to finish the program")
        print("> ")
        val input = readLine()?.trim() ?: ""

        if (input.isEmpty()) {
            println("No instructions have been written")
            continue
        }

        // Procesar las instrucciones del usuario
        when (input) {
            "factorial", "FACTORIAL" -> {
                val number = readInt("Write a inter number", "Is not inter", "Negative number", 0, 1000)
                val result: Long

                result = factorial(number)
                println("Factorial of $number is: $result")
            }
            "bits", "BITS" -> bits()

            "END", "end" -> { // Salir del programa
                println("End of program. Bye!")
                continuar = false
            }

            else -> {
                println("Instruction is not renewed. You wrote a valid instruction.")

            } // Instrucción no válida
        }
    }
}



fun factorial(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else n*factorial(n-1)
}

fun bits(){
    println("Escribe el numero que quieres calcular los bits")
    val x: Double = scan.nextDouble()
    println("Escribe un numero base(para calcular bits la base=2)")
    val base: Double = scan.nextDouble()
    println(log(x, base))
    //.roundToLong()
}