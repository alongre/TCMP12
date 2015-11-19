import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Agreen on 11/19/2015.
 */
public class BookReader {


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private String filePath;

    public BookReader(String filePath)
    {
        this.filePath = filePath;
    }

    public HashMap read() throws FileNotFoundException {
        HashMap<Integer,String> bookHash = new HashMap<>();
        Scanner input = new Scanner(new File(filePath));
        while (input.hasNext())
        {
            String word = input.next();
            bookHash.put(word.hashCode(),word);
        }
        return bookHash;
    }

}
