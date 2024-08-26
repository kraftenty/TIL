import java.util.*;

public class ItemList implements Unit {
    private List<Unit> list = new ArrayList<>();

    public void add(Unit unit) {
        list.add(unit);
    }

    @Override
    public void accept(Visitor visitor) {
        Iterator<Unit> iterator = list.iterator();

        while(iterator.hasNext()) {
            Unit unit = iterator.next();
            visitor.visit(unit);
        }
    }
}
