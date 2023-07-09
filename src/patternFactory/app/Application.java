package patternFactory.app;

import patternFactory.chairs.Chair;
import patternFactory.factories.FurnitureFactory;
import patternFactory.tables.Table;

public class Application {
    private Chair chair;
    private Table table;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void paint() {
        chair.paint();
        table.paint();
    }
}
