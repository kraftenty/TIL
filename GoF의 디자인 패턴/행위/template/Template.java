abstract class Template {

    public final void templateMethod() {
        step1();
        step2();
        if(hook()) {
            System.out.println("hook 실행");
        }
        step3();
    }

    boolean hook() {
        return true;
    }

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

}