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
            return String.format("Hello, %s and %s.", names[0], names[1]);
        } else
        {
            return "Array should have 2 indexes";
        }
    }

    public static String greet5(String[] names)
    {
        if (names.length == 1)
        {
            return greet4(names[0]);
        }
        if (names.length == 2)
        {
            return greet4(names);
        }
        String greeting = "Hello, ";
        for (int i = 0; i < names.length - 1; i++)
        {
            greeting += names[i] + ", ";
        }
        return greeting += "and " + names[names.length - 1] + ".";
    }

    public static String greet6(String[] names)
    {
        int lowerCaseNameCount = 0, upperCaseNameCount = 0;

        for (int i = 0; i < names.length; i++)
        {
            if (names[i].toUpperCase().equals(names[i]))
            {
                upperCaseNameCount++;
            } else
            {
                lowerCaseNameCount++;
            }
        }

        String[] lowerCaseArray = new String[lowerCaseNameCount];
        String[] upperCaseArray = new String[upperCaseNameCount];

        int iLower = 0, iUpper = 0;

        for (int i = 0; i < names.length; i++)
        {
            if (names[i].toUpperCase().equals(names[i]))
            {
                upperCaseArray[iUpper] = names[i];
                iUpper++;
            } else
            {
                lowerCaseArray[iLower] = names[i];
                iLower++;
            }
        }

        String greeting = "";

        if (iLower > 0)
        {
            greeting = greet5(lowerCaseArray);
        }

        if (iUpper > 0)
        {
            if (iUpper > 1)
            {
                greeting += " AND " + greet4(upperCaseArray);
            } else
            {
                greeting += " AND " + greet3(upperCaseArray[0]);
            }
        }
        return greeting;
    }

    public static String greet7(String[] names)
    {
        int nameCount = getNumberOfNamesInArray(names);
        String[] allNamesArray = new String[nameCount];
        int counter = 0;

        for (int i = 0; i < names.length; i++)
        {
            String[] nameArray = names[i].split(",");
            for (int j = 0; j < nameArray.length; j++)
            {
                allNamesArray[counter] = nameArray[j].trim();
                counter++;
            }
        }
        return greet6(allNamesArray);
    }

    public static String greet8(String[] names)
    {
        int nameCount = getNumberOfNamesInArray(names);
        String[] allNamesArray = new String[nameCount];
        int counter = 0;

        for (int i = 0; i < names.length; i++)
        {
            if (containsCommaDelimiter(names[i]))  // ["Bob", "\"Charlie, Diane\""]
            {
                allNamesArray[counter] = stripCommaDelimiters(names[i]);
                counter++;
            } else
            {
                String[] nameArray = names[i].split(",");
                for (int j = 0; j < nameArray.length; j++)
                {
                    allNamesArray[counter] = nameArray[j].trim();
                    counter++;
                }
            }
        }
        return greet6(allNamesArray);
    }

    public static int getNumberOfNamesInArray(String[] names)
    {
        int nameCount = 0;

        for (int i = 0; i < names.length; i++)
        {
            if (containsCommaDelimiter(names[i]))
            {
                nameCount += 1;
            } else
            {
                nameCount += names[i].split(",").length;
            }
        }
        return nameCount;
    }

    public static boolean containsCommaDelimiter(String s)
    {
        int first = s.indexOf('\"');
        int last = s.lastIndexOf('\"');

        return (first != -1 && last != -1);
    }

    public static String stripCommaDelimiters(String s)
    {
        int first = s.indexOf('\"');
        int last = s.lastIndexOf('\"');

        if (first != -1 && last != -1)
        {
            return s.substring(first + 1, last);
        }
        return s;
    }

}
