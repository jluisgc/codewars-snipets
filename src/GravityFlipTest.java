import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GravityFlipTest {

    public int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);
        if (dir == 'L') {
            return Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        }
        return arr;
    }

    @Test
    public void test() {
        int[] boxes = new int[]{3, 2, 1, 2};
        int[] result = new int[]{1, 2, 2, 3};
        assertArrayEquals(flip('R', boxes), result);

        int[] boxes1 = new int[]{1, 4, 5, 3, 5};
        int[] result1 = new int[]{5, 5, 4, 3, 1};
        assertArrayEquals(flip('L', boxes1), result1);
    }

}