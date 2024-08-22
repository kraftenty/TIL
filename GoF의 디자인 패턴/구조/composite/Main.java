public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("hi.txt"));
        root.add(new File("a.out"));

        Folder etc = new Folder("etc");
        root.add(etc);
        etc.add(new File("hello.exe"));

        root.list();
    }
    
}
