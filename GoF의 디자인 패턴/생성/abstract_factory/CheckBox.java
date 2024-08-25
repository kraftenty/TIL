public abstract class CheckBox {
    protected boolean checked;
    
    public CheckBox(boolean checked) {
        this.checked = checked;
    }

    void setChecked(boolean checked) {
        this.checked = checked;
        render();
    }

    abstract void render();
}
