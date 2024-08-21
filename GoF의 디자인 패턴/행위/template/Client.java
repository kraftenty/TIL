public class Client { 
    public static void main(String[] args) {
        Template template = new ImplementationA();
        template.templateMethod();

        template = new ImplementationB();
        template.templateMethod();
    }
}