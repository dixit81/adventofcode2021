import java.io.IOException;
import java.util.List;

public class Day2 {

    public int part1(final List<String> input) {

        int horizontalCounter = 0;
        int depthCounter = 0;
        for (final String line : input) {
            final String[] strings = line.split(" ");
            final String direction = strings[0];
            final int magnitude = Integer.parseInt(strings[1]);

            if ("forward".equals(direction)) {
                horizontalCounter += magnitude;
            } else if ("down".equals(direction)) {
                depthCounter += magnitude;
            } else if ("up".equals(direction)) {
                depthCounter -= magnitude;
            }
        }
        return horizontalCounter * depthCounter;
    }

    public int part2(final List<String> input) {

        int horizontalCounter = 0;
        int depthCounter = 0;
        int aimCounter = 0;
        for (final String line : input) {
            final String[] strings = line.split(" ");
            final String direction = strings[0];
            final int magnitude = Integer.parseInt(strings[1]);

            if ("forward".equals(direction)) {
                horizontalCounter += magnitude;
                depthCounter += aimCounter * magnitude;
            } else if ("down".equals(direction)) {
                aimCounter += magnitude;
            } else if ("up".equals(direction)) {
                aimCounter -= magnitude;
            }
        }

        return horizontalCounter * depthCounter;
    }


    public static void main(final String[] args) throws IOException {
        final Day2 day2 = new Day2();
        System.out.println("result: " + day2.part2 (new TestFileReaderUtility().fetchData("day2.txt")));
    }


}
