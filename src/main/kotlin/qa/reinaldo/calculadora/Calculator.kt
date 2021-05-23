package qa.reinaldo.calculadora


open class Calculator(var displayedValue: Double = 0.0) {

    fun getResult(): Double {
        return displayedValue
    }

    fun add(first_value: Double) {
        displayedValue += first_value
    }

    fun mult(first_value: Double) {
        displayedValue *= first_value
    }

    /*
    Função realiza a subtração de dois valores.
     */
    fun sub(first_value: Double) {
        displayedValue -= first_value
    }

    fun div(first_value: Double) {
        displayedValue /= first_value
    }

    fun power(first_value: Double): Double {
        return Math.pow(displayedValue, first_value)
    }

}

