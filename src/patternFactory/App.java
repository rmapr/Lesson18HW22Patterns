package patternFactory;

import patternFactory.app.Application;
import patternFactory.factories.FurnitureFactory;
import patternFactory.factories.ModernFurnitureFactory;
import patternFactory.factories.VictorianFurnitureFactory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Application application = initApplication();
        application.paint();
    }
    private static Application initApplication() {
        Application app;
        FurnitureFactory factory;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choice:
                1 - Modern Factory
                2 - Victorian Factory""");
        int numFactory = scanner.nextInt();
        if (numFactory == 1) {
            factory = new ModernFurnitureFactory();
        } else {
            factory = new VictorianFurnitureFactory();
        }
        app = new Application(factory);
        return app;
    }
}
