package patternFactory.factories;

import patternFactory.buttons.Button;
import patternFactory.buttons.MacOSButton;
import patternFactory.checkboxes.Checkbox;
import patternFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
