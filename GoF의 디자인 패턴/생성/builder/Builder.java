public class Builder {
    private String part1;
    private String part2;
    private String part3;


    public Builder buildPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    public Builder buildPart2(String part2) {
        this.part2 = part2;
        return this;
    }

    public Builder buildPart3(String part3) {
        this.part3 = part3;
        return this;
    }

    public Product getResult() {
        return new Product(part1, part2, part3);
    }
}
