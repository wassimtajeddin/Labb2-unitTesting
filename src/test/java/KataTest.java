import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    @DisplayName("An empty string should return 0")
    void anEmptyStringShouldReturn0(){
        int sum = Kata.add("");

        assertEquals(0,sum);

    }
    @Test
    @DisplayName("Two numbers saperated with comma should return sum")
    void twoNumbersSaperatedWithCommaShouldReturnSum(){
        int sum = Kata.add("0,0");

        assertEquals(0, sum);
    }
    @Test
    @DisplayName("Unknown amount of numbers")
    void unknownAmountOfNumbersShouldReturnSum() {
        int sum = Kata.add("3,9,6,7");
        assertEquals(25,sum);
    }
    @Test
    @DisplayName("Allow the Add method to handle new lines between numbers")
    void allowTheAddMethodToHandleNewLinesBetweenNumbers(){
        int sum = Kata.add("1\n2,3");
        assertEquals(6,sum);

    }
    @Test
    @DisplayName("Support different delimiters")
    void theBeginningOfTheStringShouldContainASeparateLine(){
        int sum = Kata.add("//;\n1;2");
        assertEquals(3,sum);
    }
    @Test
    @DisplayName("Calling Add with a negative number will throw an exception")
    void callingAddWithANegativeNumberShouldThrowAnException(){
        var sum = Kata.isNegative("-1,2,-3");
       assertEquals("Negatives not allowed",sum);
    }
    @Test
    @DisplayName("Numbers bigger than 1000 should be ignored")
    void numbersBiggerThan1000ShouldBeIgnored(){
        int sum = Kata.biggerThan1000("2,1001");
        assertEquals(2,sum);
    }
    @Test
    @DisplayName("Delimiters can be of any length")
    void delimitersCanBeOfAnyLength(){
        int sum = Kata.add("//[***]\n1***2***3");
        assertEquals(6,sum);
    }
    @Test
    @DisplayName("Allow multiple delimiters")
    void allowMultipleDelimiters() {
        int sum = Kata.add("//[*][%]\n1*2%3");
        assertEquals(6, sum);
    }

    }
