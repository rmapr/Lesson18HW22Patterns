package patternFactory;

import patternFactory.app.Application;
import patternFactory.factories.GUIFactory;
import patternFactory.factories.MacOSFactory;
import patternFactory.factories.WindowsFactory;

public class App {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
