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
}
