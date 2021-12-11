import java.io.IOException;
import java.util.List;

public class Day2 {
    public int part1() throws IOException {

        int horizontalCounter = 0;
        int depthCounter = 0;
        final TestFileReaderUtility testFileReaderUtility = new TestFileReaderUtility();
        final List<String> input = testFileReaderUtility.readFile("day2.txt");

        for (final String line : input) {
            String[] strings = line.split(" ");
            String direction = strings[0];
            int magnitude = Integer.parseInt(strings[1]);

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

    public static void main(final String[] args) throws IOException {
        final Day2 day2 = new Day2();
        System.out.println("result: " + day2.part1());
    }
}
