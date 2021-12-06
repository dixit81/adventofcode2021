import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    @Test
    void givenNoDepthThereIsNoIncreaseInDepth() {
        final List<Integer> input = Collections.emptyList();
        final Day1 day1 = new Day1(input);

        assertEquals(0, day1.part1());
    }

    @Test
    void givenADepthThereIsNoIncreaseInDepth() {
        final List<Integer> input = Collections.singletonList(100);
        final Day1 day1 = new Day1(input);

        assertEquals(0, day1.part1());
    }

    @Test
    void givenTwoDepthsInIncreasingOrderItReturnsOneIncreasingDepth() {
        final List<Integer> input = new ArrayList<>();
        input.add(100);
        input.add(101);

        final Day1 day1 = new Day1(input);
        assertEquals(1, day1.part1());
    }

    @Test
    void givenThreeDepthsInIncreasingOrderItReturnsTwoInIncreasingDepth() {
        final List<Integer> input = new ArrayList<>();
        input.add(100);
        input.add(101);
        input.add(102);

        final Day1 day1 = new Day1(input);
        assertEquals(2, day1.part1());
    }

    @Test
    void givenTestInputWithRandomNumbersItShouldReturnAValue() throws IOException {

        final BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/testfiles/day1.txt")));
        final List<Integer> input = reader.lines().map(Integer::parseInt).collect(Collectors.toList());
        final Day1 day1 = new Day1(input);

        assertEquals(1766, day1.part1());
    }
}