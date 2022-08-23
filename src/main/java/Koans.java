import java.util.Locale;

public class Koans
{
    public static String greet(String name)
    {
        return "Hello, " + name + ".";
    }

    public static String greet2(String name)
    {
        if (name != null)
        {
            return greet(name);
        } else
        {
            return "Hello, my friend.";
        }
    }

    public static String greet3(String name)
    {
        if (name.toUpperCase().equals(name))
        {
            return "HELLO " + name + "!";
        } else
        {
            return greet2(name);
        }
    }

    public static String greet4(String name)
    {
        return greet3(name);
    }

    public static String greet4(String[] names)
    {
        if (names.length == 2)
        {
            return String.format("Hello, %s and %s", names[0], names[1]);
        } else
        {
            return "Array should have 2 indexes";
        }
    }

}
