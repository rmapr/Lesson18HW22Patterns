package patternFactory.factories;

import patternFactory.buttons.Button;
import patternFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
