public class Main {
    public static void main(String[] args) {
        IntegerList list = new IntegerList();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}