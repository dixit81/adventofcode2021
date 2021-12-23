import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class Day3 {

    public int part1(final List<String> input) {

        final int[][] grid = simplifyInput(input);

        int countZeros = 0;
        int countOnes = 0;
        final StringBuilder gammaRate = new StringBuilder();
        final StringBuilder epsilonRate = new StringBuilder();

        for(int k=0; k<input.get(0).length(); k++) {
            for(int l=0; l<grid.length; l++) {
                if(grid[l][k] == 0) {
                    countZeros++;
                } else {
                    countOnes++;
                }
            }

            if (countOnes > countZeros) {
                gammaRate.append(1);
                epsilonRate.append(0);
            } else {
                gammaRate.append(0);
                epsilonRate.append(1);
            }

            countZeros = 0;
            countOnes = 0;
        }

        final Integer gammaDecimalValue = Integer.valueOf(gammaRate.toString(), 2);
        final Integer epsilonDecimalValue = Integer.valueOf(epsilonRate.toString(), 2);

        return gammaDecimalValue * epsilonDecimalValue;
    }

    private int[][] simplifyInput(final List<String> input) {
        final int[][] grid = new int[input.size()][];

        IntStream.range(0, input.size()).forEach(i -> {
            final String bits = input.get(i);
            grid[i] = new int[bits.length()];
            final int[] num = IntStream.range(0, bits.length()).map(j -> bits.charAt(j) - '0').toArray();
            grid[i] = num;
        });
        return grid;
    }


    public static void main(final String[] args) throws IOException {
        final Day3 day3 = new Day3();
        System.out.println("Result is " + day3.part1(new TestFileReaderUtility().fetchData("day3.txt")));
    }
}

