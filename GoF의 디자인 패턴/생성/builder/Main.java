public class Main {

    public static void main(String[] args) {
        Product product = new Builder()
                            .buildPart1("hello")
                            .buildPart2("world")
                            .buildPart3("haha")
                            .getResult();

        System.out.println(product);
    }
    
}
