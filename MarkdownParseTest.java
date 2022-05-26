import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class MarkdownParseTest{
    MarkdownParse tests = new MarkdownParse();

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("Error1.md");
        String content = Files.readString(fileName);
        ArrayList<String> output = new ArrayList<>();
        output.add("google.com");
        assertEquals(output , MarkdownParse.getLinks(content)); 
    }
    
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("Error2.md");
        String content = Files.readString(fileName);
        ArrayList<String> output = new ArrayList<>();
        output.add("google.com");
        assertEquals(output , MarkdownParse.getLinks(content)); 
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("Error3.md");
        String content = Files.readString(fileName);
        
        try{MarkdownParse.getLinks(content);
            fail();
        }catch(StringIndexOutOfBoundsException e){} 
    }

    @Test
    public void snip1() throws IOException{
        Path fileName = Path.of("C:/Users/Borna Hemmaty/OneDrive/Documents/GitHub/cse15L-labs/snip1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("google.com");

        assertEquals(expected, links);
    }

    @Test
    public void snip2() throws IOException{
        Path fileName = Path.of("C:/Users/Borna Hemmaty/OneDrive/Documents/GitHub/cse15L-labs/snip2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");

        assertEquals(expected, links);
    }

    @Test
    public void snip3() throws IOException{
        Path fileName = Path.of("C:/Users/Borna Hemmaty/OneDrive/Documents/GitHub/cse15L-labs/snip3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");

        assertEquals(expected, links);
    }
}
