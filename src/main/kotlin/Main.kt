package org.example
/**
 * Programa principal que calcula el precio final de una furgoneta Volkswagen
 * basado en diferentes opciones proporcionadas por el usuario.
 */
fun main(){
    // Mensaje de error a imprimir dentro de los métodos
    val messageError="Valor incorrecto, intente de nuevo"
    // Impresión de un arte ASCII al inicio del programa
    println(
        RED_BOLD+"  .--.            .--.\n" +
                " ( (`\\\\.\"--``--\".//`) )\n" +
                "  '-.   __   __    .-'\n" +
                "   /   /__\\ /__\\   \\\n" +
                "  |    \\ 0/ \\ 0/    |\n" +
                "  \\     `/   \\`     /\n" +
                "   `-.  /-\"\"\"-\\  .-`\n" +
                "     /  '.___.'  \\\n" +
                "     \\     I     /\n" +
                "      `;--'`'--;`\n" +
                "        '.___.'"+RESET)

    // Pregunta al usuario si tiene la Volkswagen Grand California normal o la Camper Full Equip
    println(CYAN_BOLD+"Seleccione una opción para calcular el precio de su Volkswagen:\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip"+ RESET)
    val cotxeUsuari=llegirInt(1, 2,messageError)

    // Pregunta al usuario los kilómetros actuales de su vehículo
    println(YELLOW_BOLD+"Introduzca los kilómetros actuales de su vehículo"+RESET)
    val kilometresCotxe=llegirDouble(0, messageError)

    // Pregunta al usuario el estado de los neumáticos
    println(GREEN_BOLD+"Introduzca los kilómetros que tienen los neumáticos"+RESET)
    val estatPneumatics=llegirLong(0,messageError)

    // Pregunta al usuario si la furgoneta tiene o no portabicicletas
    println(PURPLE_BOLD+"Seleccione una opción según si su furgoneta dispone o no de portabicicletas: \n1-Si, dispone de portabicicletas\n2-No, no dispone de portabicicletas"+RESET)
    val portabicisUsuari= llegirInt(1,2,messageError)

    // Pregunta al usuario los años de la furgoneta
    println(BLUE_BOLD+"Itroduzca el año de matriculación de la furgoneta"+RESET)
    val anysFurgo= llegirInt(1,50,messageError)

    // Calcula el precio inicial según el modelo
    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase)
    val preuBici=calculPortabicis(portabicisUsuari,preuFinal)
    val preuAnys=calculPerduaAnys(anysFurgo,preuFinal,kilometresCotxe)

    // Imprime el resultado
    print(RED_BACKGROUND+"Según las opciones que ha indicado, el precio final de su furgoneta sera de\n "+preuFinal+"€"+ RESET)
}