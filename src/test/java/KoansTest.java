import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoansTest
{

    @Test
    void greeting()
    {
           String expected = "Hello, Bob.";
           String actual = Koans.greet("Bob");
           assertEquals(expected, actual);
    }


    @Test
    void greeting2()
    {
        String expected = "Hello, my friend.";
        String actual = Koans.greet2(null);
        assertEquals(expected, actual);

        expected = "Hello, Bob.";
        actual = Koans.greet2("Bob");
        assertEquals(expected, actual);
    }

    @Test
    void greet3()
    {
        String expected = "HELLO JERRY!";
        String actual = Koans.greet3("JERRY");
        assertEquals(expected, actual);
    }


    @Test
    void greet4()
    {
        String[] names = {"Jill", "Jane"};
        String expected = "Hello, Jill and Jane";
        String actual = Koans.greet4(names);
        assertEquals(expected, actual);
    }
}
