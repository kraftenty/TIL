public class Main {

    public static void main(String[] args) {
        Array array = new Array(new int[] {1,2,3,4,5});
        Iterator it = array.iterator();
        while(it.next()) {
            System.out.println(it.current());
        }
    }
    
}
