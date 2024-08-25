public class WindowsButton extends Button {
    
    public WindowsButton(String caption) {
        super(caption);
    }
    
    @Override
    void render() {
        System.out.println("Windows API를 사용하여 " + this.caption + " 버튼을 만듭니다." );
    }

}
