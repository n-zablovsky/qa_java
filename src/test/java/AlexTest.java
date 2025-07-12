import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {
    private Feline feline;
    private Alex alex;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        alex = new Alex(feline);
    }

    @Test
    public void testGetFriends() {

        List<String> friends = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void testGetPlaceOfLiving() {

        String placeOfLiving = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", placeOfLiving);
    }

    @Test
    public void testGetKittens() {

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testDoesHaveMane() {

        assertTrue(alex.doesHaveMane());
    }
}

