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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
        if (this.getCount() == w2.getCount()) return 0;
        if (this.getCount()>w2.getCount())
            return 1;
        else
            return -1;
    }
}


