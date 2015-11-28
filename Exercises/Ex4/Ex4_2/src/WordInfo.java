/**
 * Created by alongreen on 21/11/2015.
 */
public class WordInfo implements Comparable {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private int count;

    private int page;

    public WordInfo(String value, int page)
    {
        this.value = value;
        this.page = page;
    }
    public void add()
    {
        count++;
    }

    @Override
    public boolean equals(Object obj) {
        WordInfo w1 = (WordInfo)obj;
        if (w1.getValue().compareTo(this.value) == 0) return true;
        return false;
    }

    @Override
    public int compareTo(Object o) {
        WordInfo w2 = (WordInfo)o;
        return this.getValue().compareTo(w2.getValue());

    }
}


