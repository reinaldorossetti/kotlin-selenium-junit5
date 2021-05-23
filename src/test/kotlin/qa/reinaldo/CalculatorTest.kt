package qa.reinaldo

import qa.reinaldo.calculadora.Calculator
import io.qameta.allure.Allure.step
import io.qameta.allure.Feature
import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import io.qameta.allure.Step
import io.qameta.allure.model.Status
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.junit5.JUnit5Asserter.assertEquals

/**
 * Classe para Testar a nossa calculadora, estou usando o junit 5, agora precisando colocar o delta
 *
 */

@Feature("Calculadora")
class CalculatorTest {

    @Test
    @Step("Testando a funcao soma")
    @Severity(SeverityLevel.CRITICAL)
    fun testAddition() {
        val calculator = Calculator()
        step("somando dois valores")
        calculator.add(2.0)
        assertEquals(
            "fail to add function", 2.0 , calculator.getResult()
        )
        step("Simple step with status", Status.PASSED)
    }

    @Test
    @DisplayName("Testando a funcao subtracao")
    fun testSubtraction() {
        val calculator = Calculator(5.0)
        step("subtraindo dois valores")
        calculator.sub(2.0)
        assertEquals(
             "fail in sub function",3.0, calculator.displayedValue
        )
    }

    @Test
    @DisplayName("Testando a funcao subtracao")
    fun testMult() {
        val calculator = Calculator(5.0)
        step("multiplicando dois valores")
        calculator.mult(2.0)
        assertEquals(
            "fail in mult function",10.0, calculator.displayedValue
        )
    }

    @Test
    @DisplayName("Testando a funcao de potencia")
    fun testPower() {
        val calculator = Calculator(displayedValue = 2.0)
        step("elevando a potencia 3")
        calculator.power(3.0)
        assertEquals(
            "fail in power function", 8.0, calculator.displayedValue
        )
    }

}