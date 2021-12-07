import java.util.ArrayList;
import java.util.List;

public class Day1 {

    private List<Integer> input;

    public Day1(final List<Integer> input) {
        this.input = input;
    }

    public int part1() {

        if(input.size() == 0 || input.size() == 1) {
            return 0;
        } else {
            int count = 0;
            for(int i=0; i<input.size()-1; i++) {
                if(input.get(i+1) > input.get(i)) {
                    count++;
                }
            }
            return count;
        }

    }

    public int part2() {
        if(input.size() <= 3) {
            return 0;
        } else {
            final List<Integer> sums = new ArrayList<>();
            int count = 0;
            int sum = 0;

            for(int i=0; i<input.size()-2; i++) {
                sum = input.get(i) + input.get(i+1) + input.get(i+2);
                sums.add(sum);
            }

            for(int i=0; i<sums.size()-1; i++) {
                if(sums.get(i+1) > sums.get(i)) {
                    count++;
                }
            }
            return count;
        }
    }
}
