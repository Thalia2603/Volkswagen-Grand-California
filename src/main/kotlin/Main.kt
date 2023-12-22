package org.example
/**
 * Programa principal que calcula el precio final de una furgoneta Volkswagen
 * basado en diferentes opciones proporcionadas por el usuario.
 * @author Thalia Bravo
 * @version 1.0
 */
fun main(){
    // Mensaje de error que se imprimirá dentro de los métodos que lo contengan
    val messageError="Valor incorrecto, vuelva a intentarlo de nuevo"
    // Impresión de un arte ASCII al inicio del programa
    println(
        RED_BOLD+"   ---------------------------.\n" +
                " `/\"\"\"\"/\"\"\"\"/|\"\"|'|\"\"||\"\"|   ' \\.\n" +
                " /    /    / |__| |__||__|      |\n" +
                "/----------=====================|\n" +
                "| \\  /V\\  /    _.               |\n" +
                "|()\\ \\W/ /()   _            _   |\n" +
                "|   \\   /     / \\          / \\  |-( )\n" +
                "=C========C==_| ) |--------| ) _/==] _-{_}_)\n" +
                " \\_\\_/__..  \\_\\_/_ \\_\\_/ \\_\\_/__.__."+RESET)

    // Pregunta al usuario si tiene la Volkswagen Grand California normal o la Camper Full Equip
    println(CYAN_BOLD+"Seleccione una opción:\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip"+ RESET)
    val cotxeUsuari=llegirInt(1, 2,messageError)

    // Pregunta al usuario los kilómetros actuales de su furgoneta
    println(YELLOW_BOLD+"Introduzca los kilómetros actuales del vehiculo, porfavor: (Ex: 0,00)"+RESET)
    val kilometresCotxe=llegirDouble(0, messageError)

    // Pregunta al usuario el estado de los neumáticos
    println(GREEN_BOLD+"Introduca los kilómetros que tienen los neumáticos:"+RESET)
    val estatPneumatics=llegirLong(0,messageError)

    // Pregunta al usuario si la furgoneta dispone o no porta bicicletas
    println(PURPLE_BOLD+"Seleccione una opción según disponga o no de portabicicletas:\n1- Si, dispongo de portabicicletas\n2-No, no dispongo de portabicicletas"+RESET)
    val portabicisUsuari= llegirInt(1,2,messageError)

    // Pregunta al usuario los años de antigüedad de la furgoneta
    println(BLUE_BOLD+"Introduzca los años de antigüedad de su furgoneta:"+RESET)
    val anysFurgo= llegirInt(1,50,messageError)

    // Calcula el precio inicial según el modelo
    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase)
    val preuBici=calculPortabicis(portabicisUsuari,preuFinal)
    val preuAnys=calculPerduaAnys(anysFurgo,preuFinal,kilometresCotxe)

    // Imprime el resultado
    print(RED_BACKGROUND+"El precio final de la furgoneta sera de: "+preuFinal+"€"+ RESET)
}