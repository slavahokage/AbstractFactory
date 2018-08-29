public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void create() {
        button.onClick();
        checkBox.clickCheckBox();
    }

}
