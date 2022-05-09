import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
}
