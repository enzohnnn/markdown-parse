import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException {
        ArrayList<String> tester = new ArrayList<String>();
        tester.add("https://something.com");
        tester.add("https://something.com");
        Path fileName = Path.of("test-file.md");
        System.out.println(fileName.toString());
        List<String> ans = List.of("https://something.com", "some-page.html");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(links, ans);
    }
}