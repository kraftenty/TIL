public class SumVisitor implements Visitor {
    private int sum = 0;

    public int getValue() {
        return sum;
    }

    @Override
    public void visit(Unit unit) {
        if (unit instanceof Item) {
            sum += ((Item)unit).getValue();
        } else { // 단일 데이터가 아닌 경우
            unit.accept(this);
        }
    }
}
