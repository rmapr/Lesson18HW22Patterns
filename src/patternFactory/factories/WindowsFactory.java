package patternFactory.factories;

import patternFactory.buttons.Button;
import patternFactory.buttons.WindowsButton;
import patternFactory.checkboxes.Checkbox;
import patternFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
