import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookSearch bookSearch = new BookSearch("bookFile.txt");
        try {
            bookSearch.read();
            //1
            System.out.println("Uniqe words: " + bookSearch.countUniqeWords());
            //2
            printBookContainsWord(bookSearch);
            //3
            printNumWordAppears(bookSearch);





        //    System.out.println("Total words: " + bookSearch.countTotalWords());
        }
        catch (FileNotFoundException e)
        {

        }
    }

    private static void printBookContainsWord(BookSearch bookSearch)
    {
        System.out.println("Type a word to check if it appears:");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        boolean result = bookSearch.contains(word);
        if (result)
            System.out.println("The word " + word + " does appear");
        else
            System.out.println("The word " + word + " does not appear");
    }

    private static void printNumWordAppears(BookSearch bookSearch)
    {
        System.out.println("Type a word to check the number of time it appears in the book:");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println("The word: " + word + " appears " + bookSearch.count(word) + " times");
    }
}
