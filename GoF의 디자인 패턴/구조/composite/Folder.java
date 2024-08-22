
import java.util.*;

public class Folder extends Unit {

    private List<Unit> unitList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(Unit unit) {
        unitList.add(unit);
    }

    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder folder = (Folder) unit;
            System.out.println(indent + "- " + unit);
            Iterator<Unit> iterator = folder.unitList.iterator();
            while(iterator.hasNext()) {
                list(indent + "    " , iterator.next());
            }
        }
    }

    public void list() {
        list("", this);
    }

}
