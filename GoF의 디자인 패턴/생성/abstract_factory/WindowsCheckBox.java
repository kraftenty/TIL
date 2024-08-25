public class WindowsCheckBox extends CheckBox {

    public WindowsCheckBox(boolean checked) {
        super(checked);
    }

    @Override
    void render() {
        System.out.println(
            "Windows API 를 이용하여 "
            + (this.checked ? "체크된" : "체크 안된")
            + " 체크 박스를 만듭니다."
        );
    };
    
}
