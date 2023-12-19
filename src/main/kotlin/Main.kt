package org.example

fun main(){
    //missatge d'error que printar dins dels metodes
    val messageError="Valor incorrecte, torni a intentar"

    //pregunta a l'usuari si te la Volkswagen Grand California normal o la Camper Full Equip
    println("Sel·leccioni una opció:\n1-Volkswagen Grand California\n2-Volkswagen Grand California Camper Full Equip")
    val cotxeUsuari=llegirInt(1, 2,messageError)

    println("Introdueixi els kilometres del vehicle (Ex: 0,00)")
    val kilometresCotxe=llegirDouble(0, messageError)

    //pregunta l'estat dels pneumatics
    println("Introdueixi quants kilometres tenen els pneumatics")
    val estatPneumatics=llegirLong(0,messageError)

    //pregunta a l'usuari si la furgo disposa o ni de portabicis
    println("Sel·leccioni una opció:\n1-Disposa de portabicis\n2-No disposa de portabicis")
    val portabicisUsuari= llegirInt(1,2,messageError)

    //pregunta a l'usuari els anys de la furgo
    println("Introdueixi els anys d'antiguitat de la furgoneta")
    val anysFurgo= llegirInt(1,50,messageError)

    //calcula el preu inicial segons model
    val preuBase=calcularPreuBase(cotxeUsuari)
    val preuFinal=calcularPreuFinal(kilometresCotxe,estatPneumatics,preuBase)
    val preuBici=calculPortabicis(portabicisUsuari,preuFinal)
    val preuAnys=calculPerduaAnys(anysFurgo,preuFinal,kilometresCotxe)



    print("El preu final es: "+preuFinal+"€")

}