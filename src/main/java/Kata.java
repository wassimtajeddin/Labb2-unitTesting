import java.util.Objects;

public class Kata {

    public static int add(String numbers)
    {
        String[] detailed = numbers.split("[,\n]");
        int sum = 0;

        if(Objects.equals(numbers, ""))
                 return 0;
        for (String string : detailed) {
            sum = sum + Integer.parseInt(string);
        }
        return sum ;
    }
    }

