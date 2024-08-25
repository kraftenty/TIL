public class LinuxFactory implements ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean checked) {
        return new LinuxCheckBox(checked);
    }
    
}
