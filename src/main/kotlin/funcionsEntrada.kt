package org.example

import java.util.*
/**
 * Funciones para leer diferentes tipos de datos desde la entrada estándar,
 * y que a su vez, muestra mensajes de Error si la entrada proporcionada por el usuario es incorrecta
 *
 * @version 1.0
 * @see Scanner
 * @author Thalia Bravo
 */

val scanner=Scanner(System.`in`)

/**
 * Lectura de un valor Integer dentro de un rango asignado
 *
 * @param pMin Valor mínimo permitido.
 * @param pMax Valor máximo permitido.
 * @param pMessError Mensaje de error a mostrar si la entrada no es válida.
 * @return Entero leído desde la entrada estándar.
 */
fun llegirInt(pMin:Int,pMax:Int, pMessError:String):Int{
    val scanner= Scanner(System.`in`)
    var inputCorrecte=true
    var inputUsuari=0
    do {
        if (scanner.hasNextInt()){
            inputCorrecte=true
            inputUsuari=scanner.nextInt()
            if (inputUsuari<pMin||inputUsuari>pMax) {
                println(pMessError)
                inputCorrecte=false
            }
        }else{
            println(pMessError)
            inputCorrecte=false
        }
        scanner.nextLine()
    }while(!inputCorrecte)
    return inputUsuari
}

/**
 *Lectura de un valor Long dentro de un rango asignado
 *
 * @param pMin Valor mínimo permitido.
 * @param pMessError Mensaje de error a mostrar si la entrada no es válida.
 * @return Valor largo leído desde la entrada estándar.
 */
fun llegirLong(pMin:Int,pMessError:String):Long{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean
    var inputUsuari:Long=100
    do {
        if (scanner.hasNextLong()){
            inputCorrecte=true
            inputUsuari=scanner.nextLong()
            if (inputUsuari<=pMin) inputCorrecte=false
        }else{
            println(pMessError)
            inputCorrecte=false
            scanner.nextLine()
        }
        scanner.nextLine()
    }while(!inputCorrecte)
    return inputUsuari
}

/**
 * Lectura de un valor Double dentro de un rango asignado
 *
 * @param pMin Valor mínimo permitido.
 * @param pMessError Mensaje de error a mostrar si la entrada no es válida.
 * @return Valor doble leído desde la entrada estándar.
 */
fun llegirDouble(pMin:Int,pMessError:String):Double{
    val scanner= Scanner(System.`in`)
    var inputCorrecte:Boolean=true
    var inputUsuari:Double=100.00
    do {
        if (scanner.hasNextDouble()){
            inputCorrecte=true
            inputUsuari=scanner.nextDouble()
            if (inputUsuari<pMin){
                inputCorrecte=false
                println(pMessError)
            }
        }else{
            scanner.nextLine()
            println(pMessError)
            inputCorrecte=false
        }
    }while(!inputCorrecte)
    return inputUsuari
}