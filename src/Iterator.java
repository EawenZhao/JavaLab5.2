import java.util.ArrayList;
import java.util.List;

public class Iterator<T> implements Iterable<T> {
    List<T> list = new ArrayList<>();
    private int currPosition = 0;


    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        currPosition++;
        return list.get(currPosition - 1); //return the current value
    }

    @Override
    public boolean hasNext() {
        return currPosition <= list.size() - 1; //list.size() returns the actual size of the list, so needs to minus 1
    }
}
