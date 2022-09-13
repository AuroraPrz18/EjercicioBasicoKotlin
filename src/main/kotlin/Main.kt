import java.awt.font.LineBreakMeasurer
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    mainEjercicio1()
    mainEjercicio2()
    mainEjercicio3()
}

// EJERCICIO 1 - Notificaciones móviles
fun mainEjercicio1(){
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    if (numberOfMessages < 100)
        println("You have $numberOfMessages notifications.")
    else
        println("Your phone is blowing up! You have +99 notifications.")
}

// EJERCICIO 2 - Precio de la entrada de cine
fun mainEjercicio2(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
    return if (age <= 12)
        15
    else if (age <=60 && isMonday)
        25
    else if (age <=60)
        30
    else if (age <=100)
        20
    else -1
}

// EJERCICIO 3 - Conversor de temperatura
val CELSIUS = "Celsius"
val KELVIN = "Kelvin"
val FARENHEIT = "Farenheit"

fun mainEjercicio3(){
    printFinalTemperature(27.0, CELSIUS, FARENHEIT) { measure: Double -> (9.0 / 5.0) * measure + 32.0 }
    printFinalTemperature(350.0, KELVIN, CELSIUS) { measure: Double -> measure - 273.15 }
    printFinalTemperature(10.0, FARENHEIT, KELVIN) { measure: Double -> (5.0 / 9.0) * (measure - 32.0) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) //two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
