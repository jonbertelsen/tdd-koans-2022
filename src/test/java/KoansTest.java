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
        String expected = "Hello, Jill and Jane.";
        String actual = Koans.greet4(names);
        assertEquals(expected, actual);
    }


    @Test
    void greet5()
    {
        String[] names = {"Amy", "Brian", "Charlotte"};
        String expected = "Hello, Amy, Brian, and Charlotte.";
        String actual = Koans.greet5(names);
        assertEquals(expected, actual);
    }

    @Test
    void greeting6()
    {
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        String actual = Koans.greet6(names);
        assertEquals(expected, actual);
    }

    @Test
    void greet7()
    {
        String[] names = {"Bob", "Charlie, Dianne"};
        String expected = "Hello, Bob, Charlie, and Dianne.";
        String actual = Koans.greet7(names);
        assertEquals(expected, actual);
    }

    @Test
    void greet8()
    {
        String[] names = {"Bob", "\"Charlie, Dianne\""};
        String expected = "Hello, Bob and Charlie, Dianne.";
        String actual = Koans.greet8(names);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfNamesInArray()
    {
        String[] names = {"Bob", "Charlie, Dianne"};
        int expected = 3;
        int actual = Koans.getNumberOfNamesInArray(names);
        assertEquals(expected, actual);
    }
}
