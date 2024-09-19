import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    @DisplayName("Missing middle number")
    public void testMissingMiddleNumber() {
        //given
        int[] nums = {5, 2, 1, 4};

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Array with no missing number")
    public void testNoMissingNumber() {
        //given
        int[] nums = {2, 3, 4, 5};

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Array with single element")
    public void testSingleElementArray() {
        //given
        int[] nums = {7};

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Empty array")
    public void testEmptyArray() {
        //given
        int[] nums = new int[]{};

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Array is null")
    public void testArrayIsNull() {
        //given
        int[] nums = null;

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Array with invalid range")
    public void testInvalidRange() {
        //given
        int[] nums = {1, 5, 6};

        //when
        int result = Main.findMissingNumber(nums);

        //then
        assertEquals(-1, result);
    }
}
