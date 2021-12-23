import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TestFileReaderUtility {

    private List<String> readFile(final String file) throws IOException {
        final BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/testfiles/" + file)));
        return reader.lines().collect(Collectors.toList());
    }

    public List<String> fetchData(final String file) throws IOException {
        final TestFileReaderUtility testFileReaderUtility = new TestFileReaderUtility();
        return testFileReaderUtility.readFile(file);
    }

}