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

        Path fileName = Path.of("test2-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
    
    @Test
    public void testfile3() throws IOException {

        Path fileName = Path.of("test3-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of("https://hello.com"));
    }
    
    @Test
    public void testfile4() throws IOException {

        Path fileName = Path.of("test4-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
    
    @Test
    public void testfile5() throws IOException {

        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }
    
    @Test
    public void testfile6() throws IOException {

        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
    
    @Test
    public void testfile7() throws IOException {

        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
    
    @Test
    public void testfile8() throws IOException {

        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }
        
    @Test
    public void testfile9() throws IOException {

        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of("page.com"));
    }
        
    @Test
    public void testfile10() throws IOException {

        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }

    @Test
    public void testfile11() throws IOException {

        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);


        assertEquals(this.strList, List.of());
    }

    @Test
    public void testfile12() throws IOException {

        Path fileName = Path.of("test-file9.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("www.something.com"));
    }
}