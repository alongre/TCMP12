import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Agreen on 11/19/2015.
 */
public class BookSearch {

    private HashMap<Integer,LinkedList<String>> bookHash;
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private String filePath;

    public BookSearch(String filePath)
    {
        this.filePath = filePath;
        bookHash = new HashMap<>();
    }

    public HashMap read() throws FileNotFoundException {

        Scanner input = new Scanner(new File(filePath));
        while (input.hasNext())
        {
            String word = input.next();
            LinkedList wordList = bookHash.get(word.hashCode());
            if (wordList == null) wordList = new LinkedList();
            wordList.add(word);
            bookHash.put(word.hashCode(),wordList);
        }
        return bookHash;
    }
    public int countUniqeWords()
    {
        return bookHash.size();
    }
    public int countTotalWords()
    {
        Iterator iterator =  bookHash.entrySet().iterator();
        int count=0;
        while (iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry)iterator.next();
            LinkedList<String> list = (LinkedList<String>)pair.getValue();
            count += list.size();

        }
        return count;
    }
    public boolean contains(String word)
    {
        return bookHash.containsKey(word.hashCode());
    }
    public int count(String word)
    {
        LinkedList<String> list = bookHash.get(word.hashCode());
        if (list == null) return 0;
        return list.size();
    }
    public void printWordDuplications(int duplicationCount)
    {
        Iterator iterator =  bookHash.entrySet().iterator();
        Collection<LinkedList<String>> values =  bookHash.values();
        Collections.sort(values,);
        HashSet<Integer,String>
        while (iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry)iterator.next();
            LinkedList<String> list = (LinkedList<String>)pair.getValue();
            if (list.size()>0)
                System.out.println(list.getFirst());

        }
    }


}
