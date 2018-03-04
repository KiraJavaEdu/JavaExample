package chapter6;

import java.util.Arrays;
import java.util.List;

public class AssertError {
    public static void main(String [] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int sum = 0;
        for (int i : ints)
            sum += i;
        assert sum == 7;
    }
}
