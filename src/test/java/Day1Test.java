import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    @Nested
    class part1 {
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

    @Nested
    class part2 {
        @Test
        void givenThreeMeasurementsItShouldReturnZero() {
            final List<Integer> input = new ArrayList<>();
            input.add(100);
            input.add(101);
            input.add(102);

            final Day1 day1 = new Day1(input);
            assertEquals(0, day1.part2());
        }

        @Test
        void givenFourMeasurementsItShouldReturnOne() {
            final List<Integer> input = new ArrayList<>();
            input.add(100);
            input.add(101);
            input.add(102);
            input.add(103);

            final Day1 day1 = new Day1(input);
            assertEquals(1, day1.part2());
        }

        @Test
        void givenFiveMeasurementsItShouldReturnTwo() {
            final List<Integer> input = new ArrayList<>();
            input.add(100);
            input.add(101);
            input.add(102);
            input.add(103);
            input.add(104);

            final Day1 day1 = new Day1(input);
            assertEquals(2, day1.part2());
        }

        @Test
        void givenTestExampleAndItShouldReturnFive() {
            final ArrayList<Integer> input = new ArrayList<>();
            input.add(199);
            input.add(200);
            input.add(208);
            input.add(210);
            input.add(200);
            input.add(207);
            input.add(240);
            input.add(269);
            input.add(260);
            input.add(263);

            final Day1 day1 = new Day1(input);
            assertEquals(5, day1.part2());
        }

        @Test
        void givenTestInputWithRandomNumbersItShouldReturnAValue() throws IOException {

            final BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/testfiles/day1.txt")));
            final List<Integer> input = reader.lines().map(Integer::parseInt).collect(Collectors.toList());
            final Day1 day1 = new Day1(input);

            assertEquals(1797, day1.part2());
        }

    }

}