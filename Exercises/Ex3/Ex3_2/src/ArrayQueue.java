import java.io.Console;
import java.util.Arrays;

/**
 * Created by alongreen on 12/11/2015.
 */
public class ArrayQueue implements Queueable {

    private int[] queue;
    private int arrayIndex;
    public ArrayQueue()
    {
        this(2);
    }

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        arrayIndex =0;
    }

    @Override
    public void add(int value) {
        if (arrayIndex>=queue.length) {
            grow();
        }
        queue[arrayIndex++] = value;

    }
    private void grow()
    {
        int oldCapacity = queue.length;
        int newCapacity = oldCapacity*2;
        queue = Arrays.copyOf(queue,newCapacity);

    }
    @Override
    public int remove() {

        int firstItem = -1;
        if (!isEmpty())
        {
            firstItem = queue[0];
            advanceQueue(1);
            arrayIndex--;
        }
        return firstItem;
    }

    private void advanceQueue(int count)
    {
        queue[0] = 0;
        for (int i=0;i<arrayIndex-1;i++)
        {
            queue[i] = queue[i+1];
        }
        queue[arrayIndex-1] = 0;
    }
    @Override
    public boolean isEmpty() {
        if (queue.length==0) return true;
        return false;
    }
    public void print()
    {

        for (int i=0;i<arrayIndex;i++)
        {
            System.out.println(queue[i]);
        }
        System.out.println("Queue size: " + queue.length);
    }
}
