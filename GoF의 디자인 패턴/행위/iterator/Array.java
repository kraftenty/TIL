public class Array implements Aggregator {
    private int[] items;
    
    public Array(int[] items) {
        this.items = items;
    }

    public int getItem(int index) {
        return items[index];
    }

    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
