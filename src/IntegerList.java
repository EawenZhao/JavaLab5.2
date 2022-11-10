import java.util.ArrayList;
import java.util.List;

public class IntegerList implements IntegerList_Interface {
    List<Integer> integers = new ArrayList<>();

    @Override
    public void add(Integer integer) {
        integers.add(integer);
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new Iterator<>();
        iterator.setList(integers);
        return iterator;
    }
}
