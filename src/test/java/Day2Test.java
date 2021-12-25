import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class Day2Test {

    @DisplayName("Day2, part 1")
    @Nested
    class Part1 {

        @Test
        void givenACommandToGoForwardTwoTimesOnlyItReturnsZero() {
            final List<String> input = Collections.singletonList("forward 2");

            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1(input));
        }

        @Test
        void givenACommandToGoDownThreeTimesItReturnsZero() {
            final List<String> input = Collections.singletonList("down 3");


            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1(input));
        }

        @Test
        void givenACommandToGoUpFourTimesItReturnsZero() {
            final List<String> input = Collections.singletonList("up 4");


            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1(input));
        }

        @Test
        void givenACommandToGoUpFourTimesAndHorizontal2TimesItReturnsNegativeEight() {
            final List<String> input = new ArrayList<>();
            input.add("up 4");
            input.add("forward 2");

            final Day2 day2 = new Day2();
            assertEquals(-8, day2.part1(input));
        }
    }

    @DisplayName("Day 2, part 2")
    @Nested
    class part2 {

        @Test
        void givenACommandToGoUpFourTimesAndHorizontal2TimesItReturnsNegative16() {
            final List<String> input = new ArrayList<>();
            input.add("up 4");
            input.add("forward 2");

            final Day2 day2 = new Day2();
            assertEquals(-16, day2.part2(input));
        }

    }
}
