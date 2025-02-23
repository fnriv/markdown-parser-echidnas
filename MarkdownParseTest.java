import static org.junit.Assert.*; //imports the assert library from JUnit
import org.junit.*; //imports the JUnit library as a whole

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    
    @Test //tells JUnit that the following method is a unit test
    public void Addition() { //test method
        //Asserts that the first and second arguments should be equal
        assertEquals(2, 1 + 1);  
    }

    @Test
    public void testGetLinks() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void testGetLinks2() throws IOException {
        assertEquals(List.of("https://something.com","some-page.html"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }

    @Test
    public void testGetLinks3() throws IOException {
        assertEquals(List.of("https://something.com"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void testGetLinks4() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }

    @Test
    public void testGetLinks5() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }

    @Test
    public void testGetLinks6() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }

    @Test
    public void testGetLinks7() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }

    @Test
    public void testGetLinks8() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    }


    //team koala tests

    @Test
    public void getLinkstestFilePt3FR() throws IOException{
        Path filepath = Path.of("test-file-koala1.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("some-thing.html"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFile4FR() throws IOException{
        Path filepath = Path.of("test-file-koala2.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFileLastLineFR() throws IOException{
        Path filepath = Path.of("test-file-koala3.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://www.coolmathgames.com/", "https://twitter.com/?lang=en"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinksSnippet1() throws IOException{
        Path filepath = Path.of("testSnippet1.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("google.com"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinksSnippet2() throws IOException{
        Path filepath = Path.of("testSnippet2.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("a.com", "example.com"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinksSnippet3() throws IOException{
        Path filepath = Path.of("testSnippet3.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"), MarkdownParse.getLinks(mdFile));
    }
}


