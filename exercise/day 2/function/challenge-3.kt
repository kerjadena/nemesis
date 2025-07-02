fun konversiSuhu(celcius: Double): Double {
    return (celcius * 9/5) + 32
}

fun main() {
    println ("Masukkan suhu dalam Celcius:")
    val celcius = readLine()?.toDoubleOrNull()?:0.0
    val fahrenheit = konversiSuhu(celcius)
    println("Suhu dalam Fahrenheit: ${String.format("%.2f", fahrenheit)}°F")    
}