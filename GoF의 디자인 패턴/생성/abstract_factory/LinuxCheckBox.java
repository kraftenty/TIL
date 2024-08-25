public class LinuxCheckBox extends CheckBox {

    public LinuxCheckBox(boolean checked) {
        super(checked);
    }

    @Override
    void render() {
        System.out.println(
            "Linux API 를 이용하여 "
            + (this.checked ? "체크된" : "체크 안된")
            + " 체크 박스를 만듭니다."
        );
    };
    
}
