import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class Day3Test {

    @Nested
    @DisplayName("Day 3, part 1")
    class Part1 {
        @Test
        void given3BitsFindTheGammaRate() {
            final List<String> input = Arrays.asList("00100", "11110", "10110");

            final Day3 day3 = new Day3();
            assertThat(day3.part1(input)).isEqualTo(198);
        }
    }

    @DisplayName("Day 3, part 2")
    @Nested
    class Part2 {
        @Test
        void filterBasedUponMostCommonBitFromGivenExample() {
            final List<String> input = Arrays.asList("00100"
                    , "11110"
                    , "10110"
                    , "10111"
                    , "10101"
                    , "01111"
                    , "00111"
                    , "11100"
                    , "10000"
                    , "11001"
                    , "00010"
                    , "01010");

            final Day3 day3 = new Day3();
            assertThat(day3.part2(input, 0)).isEqualTo(230);
        }


    }

}
