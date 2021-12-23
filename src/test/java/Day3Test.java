import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class Day3Test {

    @Mock
    private TestFileReaderUtility testFileReaderUtility;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Nested
    @DisplayName("Day 3, part 1")
    class Part1 {
        @Test
        void given3BitsFindTheGammaRate() throws IOException {
            final List<String> input = Arrays.asList("00100", "11110", "10110");
            when(testFileReaderUtility.fetchData(any())).thenReturn(input);

            final Day3 day3 = new Day3();
            assertThat(day3.part1(input)).isEqualTo(0);
        }
    }

}
