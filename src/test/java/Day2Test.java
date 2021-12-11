import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class Day2Test {

    @Mock private TestFileReaderUtility testFileReaderUtility;

    @DisplayName("Day2, part 1")
    @Nested
    class Part1 {

        @Test
        void givenACommandToGoForwardTwoTimesOnlyItReturnsZero() throws IOException {
            final List<String> input = Collections.singletonList("forward 2");
            when(testFileReaderUtility.readFile(any())).thenReturn(input);


            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1());
        }

        @Test
        void givenACommandToGoDownThreeTimesItReturnsZero() throws IOException {
            final List<String> input = Collections.singletonList("down 3");
            when(testFileReaderUtility.readFile(any())).thenReturn(input);

            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1());
        }

        @Test
        void givenACommandToGoUpFourTimesItReturnsZero() throws IOException {
            final List<String> input = Collections.singletonList("up 4");
            when(testFileReaderUtility.readFile(any())).thenReturn(input);

            final Day2 day2 = new Day2();
            assertEquals(0, day2.part1());
        }

        @Test
        void givenACommandToGoUpFourTimesAndHorizontal2TimesItReturnsNegativeEight() throws IOException {
            final List<String> input = new ArrayList<>();
            input.add("up 4");
            input.add("forward 2");
            when(testFileReaderUtility.readFile(any())).thenReturn(input);
            final Day2 day2 = new Day2();
            assertEquals(-8, day2.part1());
        }

    }
}
