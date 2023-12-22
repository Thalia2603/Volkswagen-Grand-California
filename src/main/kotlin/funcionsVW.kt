package org.example

import kotlin.math.round

/**
 * Calcula el precio base del vehículo.
 *
 * @param pUserCar Tipo de vehículo (1-Volkswagen Grand California, 2-Volkswagen Grand California Camper Full Equip).
 * @return Precio base del vehículo.
 * @author Thalia Bravo
 * @version 1.0
 */
fun calcularPreuBase(pUserCar:Int):Int{
    var preu= 73490
    if (pUserCar==2){
        preu+=20000
    }
    return preu
}

/**
 * Calcula el precio final del vehículo teniendo en cuenta la depreciación.
 *
 * @param pKilometres Kilómetros recorridos por el vehículo.
 * @param pEstatPneumatics Estado de los neumáticos (en kilómetros).
 * @param pPreuBase Precio base del vehículo.
 * @return Precio final del vehículo.
 * @author Thalia Bravo
 * @version 1.0
 * @see calculPerdua
 */

fun calcularPreuFinal(pKilometres:Double, pEstatPneumatics:Long, pPreuBase:Int):Double{
    val devaluacio=calculPerdua(pKilometres,pEstatPneumatics)
    val preuFinal=pPreuBase.toDouble()-devaluacio
    return ((round(preuFinal*100)/100))
}

/**
 * Calcula la pérdida de valor del vehículo dependiendo de los kilómetros y el estado de los neumáticos.
 *
 * @param kilometros Kilómetros recorridos por el vehículo.
 * @param pPneumatics Estado de los neumáticos (en kilómetros).
 * @return Pérdida de valor del vehículo.
 * @author Thalia Bravo
 * @version 1.0
 */

fun calculPerdua (kilometros: Double, pPneumatics:Long): Double {
    var perdua:Double = 0.0
    for (i in 1..kilometros.toInt()) {
        perdua += 0.00001
    }
    if (pPneumatics>=10000){
        perdua+=300
    }else if(pPneumatics>5000){
        perdua+=200
    }
    return perdua
}

/**
 * Calcula el precio final del vehículo con o sin portabicicletas.
 *
 * @param ePneumatics Indica si el vehículo tiene portabicicletas (1) o no (otro valor).
 * @param preuFinal Precio final del vehículo.
 * @return Precio final del vehículo con o sin portabicicletas.
 * @author Thalia Bravo
 * @version 1.0
 * @see calculPreuAmbPortabicis
 */
fun calculPortabicis(ePneumatics:Int,preuFinal:Double): Double {
    if (ePneumatics==1){
        val preuAmbPortabicis=calculPreuAmbPortabicis(preuFinal)
        return preuAmbPortabicis
    }else return preuFinal
}

/**
 * Calcula el precio final del vehículo con portabicicletas.
 *
 * @param preuFinal Precio final del vehículo sin portabicicletas.
 * @return Precio final del vehículo con portabicicletas.
 * @author Thalia Bravo
 * @version 1.0
 */
fun calculPreuAmbPortabicis(preuFinal: Double):Double{
    val preuFinalPortabicis=preuFinal+250
    return preuFinalPortabicis
}

/**
 * Calcula la pérdida de valor del vehículo en función de la antigüedad.
 *
 * @param antiguitat Antigüedad del vehículo en años.
 * @param preuFurgo Precio actual del vehículo.
 * @param kmCotxe Kilómetros recorridos por el vehículo.
 * @return Pérdida de valor del vehículo en función de la antigüedad.
 * @author Thalia Bravo
 * @version 1.0
 */
fun calculPerduaAnys(antiguitat:Int,preuFurgo:Double,kmCotxe:Double):Double{
    var preuPerdua:Double = 0.0
    var preuFurgoPerdua:Double=0.0
   if (antiguitat in 0..5){
       return preuFurgo
   }else if (antiguitat in 6..10){
       preuPerdua=kmCotxe*0.0002
       preuFurgoPerdua -= preuPerdua
       return preuFurgoPerdua
   }else if (antiguitat >10){
        preuPerdua=kmCotxe*0.0004
       preuFurgoPerdua-=preuPerdua
       return preuFurgoPerdua
   }
    return preuFurgo
}