import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    List<String> strList;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testfile1() throws IOException {

        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testfile2() throws IOException {

        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
    
    @Test
    public void testfile3() throws IOException {

        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of("https://hello.com"));
    }
    
    @Test
    public void testfile4() throws IOException {

        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
}