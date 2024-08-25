public class Product {

    private String part1;
    private String part2;
    private String part3;

    public Product(String part1, String part2, String part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    @Override
    public String toString() {
        return "product built with " + part1 + ", " + part2 + ", " + part3;
    }
    
}
