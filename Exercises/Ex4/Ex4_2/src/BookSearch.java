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

        Integer pageIndex = 1;
        Scanner input = new Scanner(new File(filePath));
        while (input.hasNext())
        {
            String word = input.next();

            if (word.compareTo("Page") == 0)
            {
                if (input.hasNextInt()) {
                    String page = input.next();
                    if (page.compareTo(pageIndex.toString())==0) {
                        pageIndex++;

                        continue;
                    }
                }
            }
            LinkedList<WordInfo> list = bookHash.get(word.hashCode());
            WordInfo wordInfo = new WordInfo(word,pageIndex);
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
    private List<LinkedList<WordInfo>> sortSize()
    {
        List<LinkedList<WordInfo>> sortedWordRepetitions = new ArrayList<>(bookHash.values());
        Collections.sort(sortedWordRepetitions,new SizeComparor());
        return sortedWordRepetitions;
    }
    private List<LinkedList<WordInfo>> sortString()
    {
        List<LinkedList<WordInfo>> sortedWordStrings = new ArrayList<>(bookHash.values());
        Collections.sort(sortedWordStrings,new StringComparor());
        return sortedWordStrings;
    }
    public int countUniqeWords()
    {
        return bookHash.size();
    }

    public boolean contains(String word)
    {
        return bookHash.containsKey(word.hashCode());
    }
    public int count(String word)
    {
        LinkedList<WordInfo> wordList = bookHash.get(word.hashCode());
        if (wordList == null) return 0;
        return wordList.size();
    }
    public void printWordRepetitions(int repetitionsCount)
    {

        for (LinkedList<WordInfo> wordList : sortSize())
        {
            if (wordList.size() >= repetitionsCount)
                System.out.println("The word: (" + wordList.getFirst().getValue() + ") appears " + wordList.size() + " times");
        }
    }
    public void printWords()
    {
        Integer pIndex = 1;
        for (LinkedList<WordInfo> wordList : sortString())
        {
            for (WordInfo w: wordList)
            {
                System.out.println(w.getValue() + "," + w.getPage());
            }
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
            LinkedList<WordInfo> wordList = (LinkedList<WordInfo>)pair.getValue();
            String value = wordList.getFirst().getValue();
            if (isAllUpperCase(value))
            {
                keysToRemove.add((int)pair.getKey());
                countRemoved+= wordList.size();
            }


        }
        for (Integer key:keysToRemove)
        {

            LinkedList<WordInfo> wordList = bookHash.get(key);
            String word = wordList.getFirst().getValue();
            Integer count = wordList.size();
            wordList.clear();
            System.out.println("Removed: " + word + " " + count + " times");

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
        return true;
    }

}
class SizeComparor implements Comparator
{
   @Override
    public int compare(Object o1, Object o2) {

        LinkedList<WordInfo> w1 = (LinkedList<WordInfo>) o1;
        LinkedList<WordInfo> w2 = (LinkedList<WordInfo>)o2;
       if (w1.size() == w2.size()) return 0;
       if (w1.size()> w2.size()) return 1;
       else return -1;
    }
}

class StringComparor implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {

        LinkedList<WordInfo> w1 = (LinkedList<WordInfo>) o1;
        LinkedList<WordInfo> w2 = (LinkedList<WordInfo>)o2;
        return w1.getFirst().getValue().compareTo(w2.getFirst().getValue());
    }
}




