public class Main {

    public static void main(String[] args) {
        ComponentFactory factory = new LinuxFactory();
        Button button = factory.createButton("submit");
        CheckBox checkBox = factory.createCheckBox(false);

        button.render();
        checkBox.render();
    }
    
}
