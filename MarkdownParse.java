//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
	    if(markdown.indexOf("[", currentIndex-1) == -1){
<<<<<<< HEAD
		    
=======
		    if(toReturn.size() == 0){
			    throw new StringIndexOutOfBoundsException();
		    }
>>>>>>> daccc1d58fe2010d38e9d395712a4a687effb0ff
		    return toReturn;}
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
<<<<<<< HEAD
	    
	    toReturn.add(markdown.substring(openParen + 1, closeParen));
	         currentIndex = closeParen + 1;  
	
=======
	    if(markdown.substring(openParen + 1, closeParen).length() == 0){currentIndex = closeParen + 1;}
	    else{toReturn.add(markdown.substring(openParen + 1, closeParen));
	         currentIndex = closeParen + 1;  
		}
>>>>>>> daccc1d58fe2010d38e9d395712a4a687effb0ff
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}