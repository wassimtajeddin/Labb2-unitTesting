
import java.util.Objects;

public class Kata {

    public static int add(String numbers) {

        String[] detailed = numbers.replaceAll("[^\\d]", "").split("");
        int sum = 0;
        if (Objects.equals(numbers, ""))
            return 0;
        for (String string : detailed)
            sum = sum + Integer.parseInt(string);
return sum;

            }
    public static int biggerThan1000(String numbers) {

        String[] detailed = numbers.split(",");
        int sum = 0;
        for (String string : detailed)
            sum = sum + Integer.parseInt(string);
        for (String string : detailed) {
            if (Integer.parseInt(string) > 1000)
                return sum - Integer.parseInt(string);
        }
        return sum;

    }
    public static String isNegative(String numbers){
        String[] detailed = numbers.split(",");
        int sum = 0;
        for (String string : detailed)
            sum = sum + Integer.parseInt(string);
        for(String string : detailed){
            if(Integer.parseInt(string)< 0)
                return "Negatives not allowed";
        }return null;
    }
}