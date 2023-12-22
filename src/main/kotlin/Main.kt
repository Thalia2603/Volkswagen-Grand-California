package org.example
fun main(){
    //missatge d'error que printar dins dels metodes
    val messageError="Valor incorrecte, torni a intentar"

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

    //pregunta a l'usuari si te la Volkswagen Grand California normal o la Camper Full Equip
    println(CYAN_BOLD+"Sel·leccioni una opció:\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip"+ RESET)
    val cotxeUsuari=llegirInt(1, 2,messageError)

    println(YELLOW_BOLD+"Introdueixi els kilometres del vehicle (Ex: 0,00)"+RESET)
    val kilometresCotxe=llegirDouble(0, messageError)

    //pregunta l'estat dels pneumatics
    println(GREEN_BOLD+"Introdueixi quants kilometres tenen els pneumatics"+RESET)
    val estatPneumatics=llegirLong(0,messageError)

    //pregunta a l'usuari si la furgo disposa o ni de portabicis
    println(PURPLE_BOLD+"Sel·leccioni una opció:\n1-Disposa de portabicis\n2-No disposa de portabicis"+RESET)
    val portabicisUsuari= llegirInt(1,2,messageError)

    //pregunta a l'usuari els anys de la furgo
    println(BLUE_BOLD+"Introdueixi els anys d'antiguitat de la furgoneta"+RESET)
    val anysFurgo= llegirInt(1,50,messageError)

    //calcula el preu inicial segons model
    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase)
    val preuBici=calculPortabicis(portabicisUsuari,preuFinal)
    val preuAnys=calculPerduaAnys(anysFurgo,preuFinal,kilometresCotxe)

    print(RED_BACKGROUND+"El preu final es: "+preuFinal+"€"+ RESET)
}