public class Main {
    public static void main(String[] args) {
        
        ItemList list1 = new ItemList();
        list1.add(new Item(10));
        list1.add(new Item(20));
        list1.add(new Item(30));

        ItemList list2 = new ItemList();
        list2.add(new Item(40));
        list2.add(new Item(50));
        list1.add(list2);

        ItemList list3 = new ItemList();
        list3.add(new Item(60));
        list2.add(list3);

        SumVisitor sumVisitor = new SumVisitor();
        list1.accept(sumVisitor);
        System.out.println(sumVisitor.getValue());
    }
    
}
