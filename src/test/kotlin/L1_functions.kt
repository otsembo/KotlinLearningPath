import com.android.*
import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.Test


class L1_functionsTest {

    @Test
    fun testSumFunction() {
        assertEquals("Sum function failed for (2, 3)", 5, sum(2, 3))
        assertEquals("Sum function failed for (5, 5)", 10, sum(5, 5))
        assertEquals("Sum function failed for (-5, 5)", 0, sum(-5, 5))
    }

    @Test
    fun testProductFunction() {
        assertEquals("Product function failed for (2, 3)", 6, product(2, 3))
        assertEquals("Product function failed for (5, 5)", 25, product(5, 5))
        assertEquals("Product function failed for (-5, 5)", -25, product(-5, 5))
    }

    @Test
    fun testFactorialFunction() {
        assertEquals("Factorial function failed for 3", 6, factorial(3))
        assertEquals("Factorial function failed for 0", 1, factorial(0))
        assertEquals("Factorial function failed for 1", 1, factorial(1))
    }

    @Test
    fun testHigherOrderFunction() {
        assertEquals("Higher-order function failed for (5, 5) with addition", 10, operateOnNumbers(5, 5) { a, b -> a + b })
        assertEquals("Higher-order function failed for (5, 5) with multiplication", 25, operateOnNumbers(5, 5) { a, b -> a * b })
    }

    @Test
    fun testExtensionFunction() {
        assertEquals("Extension function failed for 5", 25, 5.square())
        assertEquals("Extension function failed for 6", 36, 6.square())
    }

    @Test
    fun testLambdaFunction() {
        val numbers = listOf(1, 2, 3, 4, 5)
        assertEquals("Lambda function failed for sum", 15, numbers.sumOf { it })
        assertEquals("Lambda function failed for fold", 120, numbers.fold(1) { acc, i -> acc * i })
    }

    @Test
    fun testDefaultArgumentsFunction() {
        assertEquals("Default arguments function failed for 2 (default value)", 10, multiplyWithDefaultArgument(2))
        assertEquals("Default arguments function failed for (2, 4)", 8, multiplyWithDefaultArgument(2, 4))
    }

    @Test
    fun testNamedArgumentsFunction() {
        assertEquals("Named arguments function failed for (4, 5)", 20, multiplyWithNamedArguments(a = 4, b = 5))
        assertEquals("Named arguments function failed for (10, 5)", 50, multiplyWithNamedArguments(b = 5, a = 10))
    }

    @Test
    fun testVarargsFunction() {
        assertEquals("Varargs function failed for (1, 2, 3, 4, 5)", 15, sumVarargs(1, 2, 3, 4, 5))
        assertEquals("Varargs function failed for no arguments", 0, sumVarargs())
    }



}
