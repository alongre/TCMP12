import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Agreen on 11/19/2015.
 */
public class BookSearch {

    private HashMap<Integer, LinkedList<WordInfo>> bookHash;
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
            LinkedList<WordInfo> list = bookHash.get(word.hashCode());
            WordInfo wordInfo = new WordInfo(word,1);
            if (list == null)
            {
                list = new LinkedList<>();
                list.add(wordInfo);
                bookHash.put(word.hashCode(), list);
            }
            else
                list.add(wordInfo);
        }
        return bookHash;
    }
    private Collection<WordInfo> sort()
    {
        List<WordInfo> sortedWordRepetitions = new ArrayList<>(bookHash.values());
        Collections.sort(sortedWordRepetitions,new ValueComparor());
        return sortedWordRepetitions;
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
            WordInfo word = (WordInfo)pair.getValue();
            count += word.getCount();

        }
        return count;
    }
    public boolean contains(String word)
    {
        return bookHash.containsKey(word.hashCode());
    }
    public int count(String word)
    {
        WordInfo wordApp = bookHash.get(word.hashCode());
        if (wordApp == null) return 0;
        return wordApp.getCount();
    }
    public void printWordRepetitions(int repetitionsCount)
    {

        for (WordInfo word :sort())
        {
            if (word.getCount()>=repetitionsCount)
                System.out.println("The word: (" + word.getValue() + ") appears " + word.getCount() + " times");
        }
    }
    public int removeUpperCase()
    {
        Iterator iterator =  bookHash.entrySet().iterator();
        int countRemoved = 0;
        ArrayList<Integer> keysToRemove = new ArrayList<>();
        while (iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry)iterator.next();
            WordInfo word = (WordInfo)pair.getValue();
            String value = word.getValue();
            if (isAllUpperCase(value))
            {
                keysToRemove.add((int)pair.getKey());
                countRemoved+= word.getCount();
            }


        }
        for (Integer key:keysToRemove)
        {
            WordInfo word = bookHash.get(key);
            System.out.println("Removed: " + word.getValue() + " " + word.getCount() + " times");

             bookHash.remove(key);
        }
        return countRemoved;
    }
    public static boolean isAllUpperCase(String str){
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c<65 || c>90) {
                return false;
            }
        }
        //str.charAt(index)
        return true;
    }

}
class ValueComparor implements Comparator
{
   @Override
    public int compare(Object o1, Object o2) {

        WordInfo w1 = (WordInfo)o1;
        WordInfo w2 = (WordInfo)o2;
        return w1.compareTo(w2);
    }
}




