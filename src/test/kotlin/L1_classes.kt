import com.android.Person
import com.android.Student
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.DefaultAsserter.assertTrue
import kotlin.test.Test

class ClassTests {

    @Test
    fun testPersonClass() {
        val person = Person("John", 30)

        assertEquals("Failed: Name should be John", "John", person.name)
        assertEquals("Failed: Age should be 30", 30, person.age)
        assertEquals("Failed: getInfo() returned incorrect value", "John is 30 years old.", person.getInfo())

        person.age = 35
        assertEquals("Failed: Age should be updated to 35", 35, person.age)
        assertEquals("Failed: getInfo() returned incorrect value after age update", "John is 35 years old.", person.getInfo())
    }

    @Test
    fun testInheritance() {
        val student = Student("Alice", 20, 123456)

        assertEquals("Failed: Name should be Alice", "Alice", student.name)
        assertEquals("Failed: Age should be 20", 20, student.age)
        assertEquals("Failed: Student ID should be 123456", 123456, student.studentId)
        assertEquals("Failed: getInfo() returned incorrect value", "Alice is a student with ID 123456.", student.getInfo())

        student.age = 22
        assertEquals("Failed: Age should be updated to 22", 22, student.age)
        assertEquals("Failed: getInfo() should not include age", "Alice is a student with ID 123456.", student.getInfo()) // Info doesn't include age
    }

    @Test
    fun testPolymorphism() {
        val animal: Animal = Dog("Buddy")

        assertEquals("Failed: Name should be Buddy", "Buddy", animal.name)
        assertTrue("Failed: animal should be an instance of Dog", animal is Dog)

        assertEquals("Failed: makeSound() returned incorrect value", "Buddy says Woof!", animal.makeSound())
    }

    @Test
    fun testDataClasses() {
        val car1 = Car("Toyota", "Camry", 2020)
        val car2 = Car("Toyota", "Camry", 2020)
        val car3 = Car("Honda", "Accord", 2019)

        assertEquals("Failed: car1 should equal car2", car1, car2)
        assertEquals("Failed: car1 and car2 should have the same hash code", car1.hashCode(), car2.hashCode())
        assertTrue("Failed: car1 should not equal car3", car1 != car3)
    }
}

