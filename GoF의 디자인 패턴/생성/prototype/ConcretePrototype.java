public class ConcretePrototype implements Prototype {
    
    private String info;

    public ConcretePrototype(String info) {
        this.info = info;
    }

    @Override
    public Object clone() {
        return new ConcretePrototype(this.info);
    }

    @Override
    public void printInfo() {
        System.out.println("ConcretePrototype: " + info);
    }
}
