public class LinuxButton extends Button {
    
    public LinuxButton(String caption) {
        super(caption);
    }
    
    @Override
    void render() {
        System.out.println("Linux API를 사용하여 " + this.caption + " 버튼을 만듭니다." );
    }

}
