public class SumPrinter {
    void print(SumStrategy strategy, int N) {
        System.out.println("The Sum of 1 ~ " + N);
        System.out.println(strategy.get(N));

    }
}
