class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void action() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("Proxy action");
        realSubject.action();
    }
}