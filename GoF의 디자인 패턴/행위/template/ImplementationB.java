public class ImplementationB extends Template {

    @Override
    protected void step1() {
        System.out.println("ImplementationB.step1()");
    }

    @Override
    protected void step2() {
        System.out.println("ImplementationB.step2()");
    }

    @Override
    protected void step3() {
        System.out.println("ImplementationB.step3()");
    }

    @Override
    protected boolean hook() {
        return false;
    }
    
}
