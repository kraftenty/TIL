public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickEvent() {
        System.out.println(caption + " 버튼 클릭됨");
    }

    abstract void render();
}
