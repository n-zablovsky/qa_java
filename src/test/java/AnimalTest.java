import com.example.Animal; // Импортируем класс Animal, который мы будем тестировать.
import org.junit.Test; // Импортируем аннотацию @Test из JUnit, которая обозначает метод как тест.
import java.util.List; // Импортируем класс List, так как метод getFood возвращает список.
import static org.junit.Assert.assertEquals; // Импортируем метод assertEquals, который используется для проверки равенства ожидаемого и фактического результата.
import static org.junit.Assert.assertThrows; // Импортируем метод assertThrows, который проверяет, что метод выбрасывает исключение.

public class AnimalTest {

    @Test
    public void testGetFoodHerbivore() throws Exception {

        Animal animal = new Animal();

        List<String> food = animal.getFood("Травоядное");

        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void testGetFoodPredator() throws Exception {

        Animal animal = new Animal();

        List<String> food = animal.getFood("Хищник");

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFoodUnknownType() {

        Animal animal = new Animal();

        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Непонятное животное");
        });

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test
    public void testGetFamily() {

        Animal animal = new Animal();

        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}


