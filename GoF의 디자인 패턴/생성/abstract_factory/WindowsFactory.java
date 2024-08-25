public class WindowsFactory implements ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new WindowsButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean checked) {
        return new WindowsCheckBox(checked);
    }
    
}
